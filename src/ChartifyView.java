import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class ChartifyView extends JFrame {

    protected final JToolBar toolBar;
    protected final JMenuBar menuBar;
    protected final JMenu fileMenu, editMenu, programMenu, toolsMenu;
    protected final JMenuItem newMenu, openMenu, saveMenu, exportMenu, printMenu, exitMenu, helpMenu;
    protected final JMenuItem cutMenu, copyMenu, deleteMenu,zoomInMenu, zoomOutMenu;
    protected final JMenuItem runMenu, stepMenu, pauseMenu, stopMenu, addFunctionMenu, functionManagerMenu;
    protected final JMenuItem consoleWindowMenu, sourceCodeViewerMenu, variableViewerMenu;
    protected final JMenuItem documentationMenu, aboutMenu;
    protected final JSeparator separator, separatorFileMenu, separator_2, separator_3, separator_4, separator_5, separator_6;
    protected final JButton openFile, save, play, pause, skip, stop, zoomIn, zoomOut, function;
    protected final Color color = new Color(192, 192, 192);
    protected final JScrollPane scrollPane, scrollPane_1;
    protected final AccordionPanel accor;
    protected final Panel panel;
    

    public ChartifyView() {
    	setAlwaysOnTop(true);

        setIconImage(Toolkit.getDefaultToolkit().getImage("ChartifyLogo.png"));
        getContentPane().setBackground(new Color(255, 255, 240));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(true);
        setSize(new Dimension(2000, 1000));
        setTitle("Chartify");
        setLocationRelativeTo(null);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        programMenu = new JMenu("Program");
        toolsMenu = new JMenu("Tools");
        helpMenu = new JMenu("Help");
        
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(programMenu);
        menuBar.add(toolsMenu);
        menuBar.add(helpMenu);
              
        newMenu = new JMenuItem("New\t (Ctrl+N)");
        openMenu = new JMenuItem("Open\t (Ctrl+O)");
        saveMenu = new JMenuItem("Save\t (Ctrl+S)");
        exportMenu = new JMenuItem("Export\t (Ctrl+E)");
        separator = new JSeparator();
        printMenu = new JMenuItem("Print\t (Ctrl+P)");
        separatorFileMenu = new JSeparator();
        exitMenu = new JMenuItem("Exit");
        
        fileMenu.add(newMenu);
        fileMenu.add(openMenu);
        fileMenu.add(saveMenu);
        fileMenu.add(exportMenu);
        fileMenu.add(separator);fileMenu.add(printMenu);
        fileMenu.add(printMenu);
        fileMenu.add(separatorFileMenu);
        fileMenu.add(exitMenu);
                
        cutMenu = new JMenuItem("Cut (Ctrl+X)");
        copyMenu = new JMenuItem("Copy (Ctrl+C)");
        deleteMenu = new JMenuItem("Delete (Del)");
        separator_2 = new JSeparator();
        zoomInMenu = new JMenuItem("Zoom In (Ctrl+Plus)");
        zoomOutMenu = new JMenuItem("Zoom Out (Ctrl+Minus)");
       
        editMenu.add(cutMenu);
        editMenu.add(copyMenu);
        editMenu.add(deleteMenu);
        editMenu.add(separator_2);
        editMenu.add(zoomInMenu);
        editMenu.add(zoomOutMenu);
        
        runMenu = new JMenuItem("Run (F5)");
        stepMenu = new JMenuItem("Step (F6)");
        pauseMenu = new JMenuItem("Pause (F7)");
        stopMenu = new JMenuItem("Stop (F8)");
        separator_3 = new JSeparator();
        addFunctionMenu = new JMenuItem("Add Function");
        functionManagerMenu = new JMenuItem("Function Manager");
        
        programMenu.add(runMenu);
        programMenu.add(stepMenu);
        programMenu.add(pauseMenu);
        programMenu.add(stopMenu);
        programMenu.add(separator_3);
        programMenu.add(addFunctionMenu);
        programMenu.add(functionManagerMenu);
          
        
        consoleWindowMenu = new JMenuItem("Console Window");
        separator_4 = new JSeparator();
        sourceCodeViewerMenu = new JMenuItem("Source Code Viewer");
        separator_5 = new JSeparator();
        variableViewerMenu = new JMenuItem("Variable Viewer");
        
        toolsMenu.add(consoleWindowMenu);
        toolsMenu.add(separator_4);
        toolsMenu.add(sourceCodeViewerMenu);
        toolsMenu.add(separator_5);
        toolsMenu.add(variableViewerMenu);

        documentationMenu = new JMenuItem("Documentation");
        separator_6 = new JSeparator();
        aboutMenu = new JMenuItem("About");
        
        helpMenu.add(documentationMenu);
        helpMenu.add(separator_6);
        helpMenu.add(aboutMenu);
        
        
        getContentPane().setLayout(null);
        

        toolBar = new JToolBar();
        toolBar.setFloatable(false);
        toolBar.setBounds(0, 0, 1370, 79);
        toolBar.setBackground(color);
        getContentPane().add(toolBar);
        validate();

        openFile = new JButton(new ImageIcon("openFileOut.png"));
        save = new JButton(new ImageIcon("saveIconOut.png"));
        play = new JButton(new ImageIcon("playIconOut.png"));
        pause = new JButton(new ImageIcon("pauseIconOut.png"));
        skip = new JButton(new ImageIcon("skipOut.png"));
        stop = new JButton(new ImageIcon("stopIconOut.png"));
        zoomIn = new JButton(new ImageIcon("zoomInOut.png"));
        zoomOut = new JButton(new ImageIcon("zoomOutOut.png"));
        function = new JButton(new ImageIcon("FunctionOut.png"));
        
        openFile.setBackground(color);
        save.setBackground(color);
        play.setBackground(color);
        pause.setBackground(color);
        skip.setBackground(color);
        stop.setBackground(color);
        zoomIn.setBackground(color);
        zoomOut.setBackground(color);
        function.setBackground(color);
        
        openFile.setToolTipText("Open");
        save.setToolTipText("Save");
        play.setToolTipText("Play");
        pause.setToolTipText("Pause");
        skip.setToolTipText("Skip");
        stop.setToolTipText("Stop");
        zoomIn.setToolTipText("Zoom In");
        zoomOut.setToolTipText("Zoom Out");
        function.setToolTipText("Function Manager");
        
        toolBar.add(openFile);
        toolBar.add(save);
        toolBar.add(play);
        toolBar.add(pause);
        toolBar.add(skip);
        toolBar.add(stop);
        toolBar.add(zoomIn);
        toolBar.add(zoomOut);
        toolBar.add(function);

        validate();

        scrollPane = new JScrollPane();
        scrollPane.setViewportBorder(null);
        scrollPane.setBounds(167, 79, 504, 649);
        getContentPane().add(scrollPane);
        JLabel lblChart = new JLabel("Chart");
        scrollPane.setColumnHeaderView(lblChart);

        validate();


        scrollPane_1 = new JScrollPane();
        scrollPane_1.setViewportBorder(null);
        scrollPane_1.setToolTipText("");
        scrollPane_1.setBounds(671, 79, 699, 649);
        getContentPane().add(scrollPane_1);

        validate();

        panel = new Panel();
        scrollPane_1.setViewportView(panel);

        accor = new AccordionPanel();
        ImageIcon icon = new ImageIcon("300px-Arduino-pro-mini-328-2.png");
        ImageIcon[] list = {icon, icon, icon, icon};
        accor.setBounds(0, 79, 167, 569);
        accor.addBar("Variables & Comments", AccordionPanel.getInside(list));
        accor.addBar("If-Else", AccordionPanel.getInside(list));
        accor.addBar("While", AccordionPanel.getInside(list));
        accor.addBar("For", AccordionPanel.getInside(list));
        accor.addBar("Try-Catch", AccordionPanel.getInside(list));
        getContentPane().add(accor);
        validate();

        revalidate();
    }

    /*public JToolBar getToolBar() {
        return toolBar;
    }*/

    public static void main(String[] args) {
        ChartifyController cont = new ChartifyController();
    }
}


