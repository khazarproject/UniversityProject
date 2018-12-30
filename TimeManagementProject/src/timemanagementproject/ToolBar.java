/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timemanagementproject;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author shukur
 */
public class ToolBar extends JPanel {
    
    private JButton addTaskButton;
    private JButton DeleteTaskButton;
    private JLabel label1;
    private JLabel label2;
    
    public ToolBar(){
        
     setLayout(new GridLayout(1,0,20,0));
     
     addTaskButton = new JButton("Add Task");
     DeleteTaskButton = new JButton("Delete Task");
     label1 = new JLabel(""); 
     label2 = new JLabel(""); 
     
     addTaskButton.addActionListener( new ActionListener(){
        
         public void actionPerformed(ActionEvent e) {
            new AddTaskFrame();
         }
         
     });
     
     add(addTaskButton);
     add(DeleteTaskButton);
     add(label1);
     add(label2);
     
    }
}
