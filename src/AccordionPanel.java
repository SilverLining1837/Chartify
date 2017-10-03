import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;


public class AccordionPanel extends JPanel implements ActionListener{
	
	//Instance variables
	private JPanel top=new JPanel(new GridLayout(1,1));
	private JPanel bottom=new JPanel(new GridLayout(1,1));
	private LinkedHashMap <String, BarInfo> bars=new LinkedHashMap <>();
	private int visibleBar=0;
	private JComponent visible=null;
	
	//Constructor
	public AccordionPanel(){
		setLayout(new BorderLayout());
		add(top,BorderLayout.NORTH);
		add(bottom,BorderLayout.SOUTH);
		setBounds(0,79,165,554);
		
	}
	
	//addBar adds the bars to the panel
	public void addBar( String name, JComponent component){
		BarInfo info=new BarInfo(name, component);
		info.getButton().addActionListener(this);
		this.bars.put(name, info);
		render();
	}
	
	//addBar adds the bars to the panel for other constructor
	public void addBar( String name, ImageIcon icon, JComponent component){
		BarInfo info=new BarInfo(name, icon, component);
		info.getButton().addActionListener(this);
		this.bars.put(name, info);
		render();
	}
	
	//Removes the bar
	public void removeBar(String name){
		this.bars.remove(name);
		render();
	}
	
	//Returns visibleBar
	public int getVisibleBar(){
		return visibleBar;
	}
	
	//Changes the number of visibleBar
	public void setVisibleBar(int barnumber){
		if(0<barnumber && barnumber<this.bars.size()-1){
			this.visibleBar=barnumber;
			render();
		}
	}
	
	//The key method that responds the changes that made in accordionpanel
	private void render(){
		int totalBar=this.bars.size();
		int topnumber=this.visibleBar+1;
		int bottomnumber=totalBar-topnumber;
		
		
		Iterator iter=this.bars.keySet().iterator();
		
		
		this.top.removeAll();
		GridLayout toplayout=(GridLayout) this.top.getLayout();
		toplayout.setRows(topnumber);
		BarInfo info=null;
		for(int i=0; i<topnumber; i++){
			String barname=(String) iter.next();
			info=(BarInfo) this.bars.get(barname);
			this.top.add(info.getButton());
		}
		this.top.validate();
		
		
		if(this.visible!=null)
			this.remove(this.visible);
		this.visible=info.getComponent();
		this.add(visible, BorderLayout.CENTER);
		
		this.bottom.removeAll();
		GridLayout bottomlayout=(GridLayout) this.bottom.getLayout();
		bottomlayout.setRows(bottomnumber);
		info=null;
		for(int i=0;i<bottomnumber;i++){
			String barname=(String)iter.next();
			info=(BarInfo)this.bars.get(barname);
			this.bottom.add(info.getButton());
			
		}
		this.bottom.validate();
		
		this.validate();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int currentBar=0;
		for(Iterator i=this.bars.keySet().iterator();i.hasNext();){
			String barname=(String)i.next();
			BarInfo info=(BarInfo) this.bars.get(barname);
			if(info.getButton()==e.getSource()){
				this.visibleBar=currentBar;
				render();
				return;
			}
			currentBar++;
		}
		
	}
	
	//For testing. It will change for gifs
	public static JPanel getInside(ImageIcon[] iconlist){
		JPanel panel=new JPanel();
		
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		for(ImageIcon icon :iconlist){
			JLabel label=new JLabel(icon);
			label.addMouseListener(new MouseAdapter(){
				public void mousePressed(MouseEvent e) {
		            JComponent c = (JComponent) e.getSource();
		            TransferHandler handler = c.getTransferHandler();
		            handler.exportAsDrag(c, e, TransferHandler.COPY);
		        }
	        }); 
			label.setTransferHandler(new TransferHandler("icon"));
			panel.add(label);
			panel.add(Box.createRigidArea(new Dimension(50,10)));
			
		}
		return panel;
		
	}

	private class BarInfo{
		
		//Instance variables
		private String name;
		private JButton button;
		private JComponent component;
		
		//Constructors
		
		public BarInfo(String name, JComponent component){
			this.name=name;
			this.component=component;
			this.button=new JButton(name);
		}
		
		public BarInfo(String name, ImageIcon icon, JComponent component){
			this.name=name;
			this.component=component;
			this.button=new JButton(name, icon);
			
		}
		
		//Returns the name of the bar
		public String getName(){
			return name;
		}
		
		//Changres the name
		public void setName(String name){
			this.name=name;
		}
		
		//Returns the JButton
		public JButton getButton(){
			return button;
		}
		
		//Returns the body of the panel
		public JComponent getComponent(){
			return component;
		}
		                              
		
		
	}

	
}
