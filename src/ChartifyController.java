
import static java.awt.PageAttributes.MediaType.C;

import java.awt.Toolkit;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author evren
 */
public class ChartifyController extends ChartifyView {
	
	
    
    public ChartifyController(){
        
        for(int i = 0; i < 9 ; i++){
            toolBar.getComponent(i).addMouseListener(new ButtonListener());
        }
        
        //Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask() returns control key (ctrl) on Windows and linux, and command key (⌘) on Mac OS.
        newMenu.setAccelerator(KeyStroke.getKeyStroke('N', Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));
        openMenu.setAccelerator(KeyStroke.getKeyStroke('O', Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));
        saveMenu.setAccelerator(KeyStroke.getKeyStroke('S', Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));
        exportMenu.setAccelerator(KeyStroke.getKeyStroke('E', Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));
        printMenu.setAccelerator(KeyStroke.getKeyStroke('P', Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));
        
        
        cutMenu.setAccelerator(KeyStroke.getKeyStroke('X', Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));
        copyMenu.setAccelerator(KeyStroke.getKeyStroke('C', Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));
        deleteMenu.setAccelerator(KeyStroke.getKeyStroke("DELETE"));
        zoomInMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ADD, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));
        zoomOutMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_SUBTRACT, Toolkit.getDefaultToolkit ().getMenuShortcutKeyMask()));
        
        runMenu.setAccelerator(KeyStroke.getKeyStroke("F5"));
        stepMenu.setAccelerator(KeyStroke.getKeyStroke("F6"));
        pauseMenu.setAccelerator(KeyStroke.getKeyStroke("F7"));
        stopMenu.setAccelerator(KeyStroke.getKeyStroke("F8"));
        
        
        newMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        
        openMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null); 
            }
        }); 
        
        saveMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        });
        
        exportMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
           
            }
        }); 
        
        printMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
           
            }
        }); 
        
        exitMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            System.exit(0);
            }
        }); 
        
        helpMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        });
        
        cutMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        }); 
        
        copyMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        }); 
        
        deleteMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        });
        
        zoomInMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        });
        
        zoomOutMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        });
        
        runMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             
            }
        }); 
        
        stepMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        }); 
        
        pauseMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        }); 
        
        stopMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        }); 
        
        addFunctionMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        }); 
        
        functionManagerMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        });
        
        consoleWindowMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             
            }
        }); 
        
        sourceCodeViewerMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
             
            }
        }); 
        
        variableViewerMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        });
        
        documentationMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        }); 
        
        aboutMenu.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
            
            }
        });
    }
    
    private class ButtonListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if(e.getComponent() == toolBar.getComponent(0)){
                JFileChooser chooser=new JFileChooser();
                int status=chooser.showOpenDialog(null);         
                	
                
            }
            else if(e.getComponent() == toolBar.getComponent(1)){
                
            }
            
            else if(e.getComponent() == toolBar.getComponent(2)){
                
            }
            
            else if(e.getComponent() == toolBar.getComponent(3)){
                
            }
            
            else if(e.getComponent() == toolBar.getComponent(4)){
                
            }
            
            else if(e.getComponent() == toolBar.getComponent(5)){
                
            }
            
            else if(e.getComponent() == toolBar.getComponent(6)){
                
            }
            
            else if(e.getComponent() == toolBar.getComponent(7)){
                
            }
            
            else if(e.getComponent() == toolBar.getComponent(8)){
                
            }
        }

			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
        

        @Override
        public void mousePressed(MouseEvent e) {
            if(e.getComponent() == toolBar.getComponent(0) )
                 ((JButton)toolBar.getComponent(0)).setIcon(new ImageIcon("openFileIn.png"));
             
            else if(e.getComponent() == toolBar.getComponent(1))
                ((JButton)toolBar.getComponent(1)).setIcon(new ImageIcon("saveIconIn.png"));
            
            else if(e.getComponent() == toolBar.getComponent(2))
                ((JButton)toolBar.getComponent(2)).setIcon(new ImageIcon("playIconIn.png"));
            
            else if(e.getComponent() == toolBar.getComponent(3))
                ((JButton)toolBar.getComponent(3)).setIcon(new ImageIcon("pauseIconIn.png"));
            
            else if(e.getComponent() == toolBar.getComponent(4))
                ((JButton)toolBar.getComponent(4)).setIcon(new ImageIcon("skipIn.png"));
            
            else if(e.getComponent() == toolBar.getComponent(5))
                ((JButton)toolBar.getComponent(5)).setIcon(new ImageIcon("stopIconIn.png"));
            
            else if(e.getComponent() == toolBar.getComponent(6))
                ((JButton)toolBar.getComponent(6)).setIcon(new ImageIcon("zoomInIn.png"));
            
            else if(e.getComponent() == toolBar.getComponent(7))
                ((JButton)toolBar.getComponent(7)).setIcon(new ImageIcon("zoomOutIn.png"));
            
            else if(e.getComponent() == toolBar.getComponent(8))
                ((JButton)toolBar.getComponent(8)).setIcon(new ImageIcon("FuntionIn.png"));
            
        }

        @Override
        public void mouseReleased(MouseEvent e) {
           
            if(e.getComponent() == toolBar.getComponent(0) )
                 ((JButton)toolBar.getComponent(0)).setIcon(new ImageIcon("openFileOut.png"));
            
            else if(e.getComponent() == toolBar.getComponent(1))
                ((JButton)toolBar.getComponent(1)).setIcon(new ImageIcon("saveIconOut.png"));
            
            else if(e.getComponent() == toolBar.getComponent(2))
                ((JButton)toolBar.getComponent(2)).setIcon(new ImageIcon("playIconOut.png"));
            
            else if(e.getComponent() == toolBar.getComponent(3))
                ((JButton)toolBar.getComponent(3)).setIcon(new ImageIcon("pauseIconOut.png"));
            
            else if(e.getComponent() == toolBar.getComponent(4))
                ((JButton)toolBar.getComponent(4)).setIcon(new ImageIcon("skipOut.png"));
            
            else if(e.getComponent() == toolBar.getComponent(5))
                ((JButton)toolBar.getComponent(5)).setIcon(new ImageIcon("stopIconOut.png"));
            
            else if(e.getComponent() == toolBar.getComponent(6))
                ((JButton)toolBar.getComponent(6)).setIcon(new ImageIcon("zoomInOut.png"));
            
            else if(e.getComponent() == toolBar.getComponent(7))
                ((JButton)toolBar.getComponent(7)).setIcon(new ImageIcon("zoomOutOut.png"));
            
            else if(e.getComponent() == toolBar.getComponent(8))
                ((JButton)toolBar.getComponent(8)).setIcon(new ImageIcon("FunctionOut.png"));
            
            
             
        }

        
    }
}
