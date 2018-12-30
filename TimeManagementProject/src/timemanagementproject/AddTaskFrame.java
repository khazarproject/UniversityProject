/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timemanagementproject;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author shukur
 */
public class AddTaskFrame extends JFrame {
    private JTextField textField;
    private JLabel label;
    
    public AddTaskFrame(){
        
    setLayout(new FlowLayout());
    
    textField = new JTextField(30);
    label = new JLabel("Task name:");
    
    textField.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
             String input = textField.getText();
             
        }
        
    });
    
    add(label);
    add(textField);
    
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(400,80);
    setVisible(true);
    }
}
