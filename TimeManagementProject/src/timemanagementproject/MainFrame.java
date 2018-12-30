/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timemanagementproject;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author shukur
 */
public class MainFrame extends JFrame{
    
    private TaskPanel taskPanel;
    private ToolBar toolBar;
    
    public MainFrame(){
        
     super("Time management app");
     
     setLayout(new BorderLayout());
     
     taskPanel = new TaskPanel();
     toolBar = new ToolBar();
     
     add(taskPanel, BorderLayout.CENTER);
     add(toolBar, BorderLayout.SOUTH);
     
     setVisible(true);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setSize(800,400);
    }
    
    
}
