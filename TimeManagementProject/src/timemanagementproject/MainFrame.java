/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timemanagementproject;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author shukur
 */
public class MainFrame extends JFrame{
    
    private JFrame frame = new JFrame();;
    
    private JPanel taskPanel = new JPanel(); 
    private JCheckBox btn1;
    private JCheckBox btn2;
    private JCheckBox btn3;
    private JCheckBox btn4;
    private JCheckBox btn5;
    private JCheckBox btn6;
    private JCheckBox btn7;
    private JCheckBox btn8;
    private JCheckBox btn9;
    private JCheckBox btn10;
    private String input = "nope";
    int count = 1;
    
    private JPanel toolBar = new JPanel();;
    private JButton addTaskButton;
    private JButton DeleteTaskButton;
    private JLabel label1;
    private JLabel label2;
    
    private JFrame addTaskFrame = new JFrame();
    private JTextField textField;
    private JLabel taskNameLabel;
    
    public MainFrame(){      
     
     // setting layouts
     frame.setLayout(new BorderLayout());
     taskPanel.setLayout(new GridLayout(0,1,10,3));
     toolBar.setLayout(new GridLayout(1,0,20,0));  
     addTaskFrame.setLayout(new FlowLayout());
     
     //creating referances
     btn1 = new JCheckBox();
     btn1.setVisible(false);
     btn2 = new JCheckBox();
     btn2.setVisible(false);
     btn3 = new JCheckBox();
     btn3.setVisible(false);
     btn4 = new JCheckBox();
     btn4.setVisible(false);
     btn5 = new JCheckBox();
     btn5.setVisible(false);
     btn6 = new JCheckBox();
     btn6.setVisible(false);
     btn7 = new JCheckBox();
     btn7.setVisible(false);
     btn8 = new JCheckBox();
     btn8.setVisible(false);
     btn9 = new JCheckBox();
     btn9.setVisible(false);
     btn10 = new JCheckBox();
     btn10.setVisible(false);
     addTaskButton = new JButton("Add Task");
     DeleteTaskButton = new JButton("Delete Task");
     label1 = new JLabel(""); 
     label2 = new JLabel(""); 
     
     textField = new JTextField(30);
     taskNameLabel = new JLabel("Task name:");
     
     addTaskButton.addActionListener( new ActionListener(){
        
        public void actionPerformed(ActionEvent e) {
           addTaskFrame.setVisible(true);
        }
         
     });
    textField.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            Graphics g = taskPanel.getGraphics();
             input = textField.getText();
             textField.setText("");
             
             if (count==1 ) {
                 btn1.setLabel(input);
                btn1.setVisible(true);
                count++;
                g.drawLine(20, 35, 770, 35);
            }else if(count==2){
                btn2.setLabel(input);
                btn2.setVisible(true);
                count++;
                g.drawLine(20, 70, 770, 70);
            }
             else if(count==3){
                 btn3.setLabel(input);
                btn3.setVisible(true);
                count++;
                g.drawLine(20, 103, 770, 103);
            }
             else if(count==4){
                 btn4.setLabel(input);
                btn4.setVisible(true);
                count++;
                g.drawLine(20, 138, 770, 138);
            }
             else if(count==5){
                 btn5.setLabel(input);
                btn5.setVisible(true);
                count++;
                g.drawLine(20, 172, 770, 172);
            }
             else if(count==6){
                 btn6.setLabel(input);
                btn6.setVisible(true);
                count++;
                g.drawLine(20, 205, 770, 205);
            }
             else if(count==7){
                 btn7.setLabel(input);
                btn7.setVisible(true);
                count++;
                g.drawLine(20, 240, 770, 240);
            }
             else if(count==8){
                 btn8.setLabel(input);
                btn8.setVisible(true);
                count++;
                g.drawLine(20, 273, 770, 273);
            }
             else if(count==9){
                 btn9.setLabel(input);
                btn9.setVisible(true);
                count++;
                g.drawLine(20, 307, 770, 307);
            }
             else if(count==10){
                 btn10.setLabel(input);
                btn10.setVisible(true);
                count++;
                g.drawLine(20, 307, 770, 307);
            }
            addTaskFrame.setVisible(false);
             
        }
        
    });
     
     frame.add(taskPanel, BorderLayout.CENTER);
     frame.add(toolBar, BorderLayout.SOUTH);
     taskPanel.add(btn1);
     taskPanel.add(btn2);
     taskPanel.add(btn3);
     taskPanel.add(btn4);
     taskPanel.add(btn5);
     taskPanel.add(btn6);
     taskPanel.add(btn7);
     taskPanel.add(btn8);
     taskPanel.add(btn9);
     taskPanel.add(btn10);
     toolBar.add(addTaskButton);
     toolBar.add(DeleteTaskButton);
     toolBar.add(label1);
     toolBar.add(label2);
     addTaskFrame.add(taskNameLabel);
     addTaskFrame.add(textField);
     
     frame.setTitle("Time manageme app");
     frame.setVisible(true);
     frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
     frame.setSize(800,400);
     //frame.setResizable(false);
     frame.setLocation(300, 250);
     
     addTaskFrame.setTitle("Add task");
     addTaskFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
     addTaskFrame.setSize(400,80);
     addTaskFrame.setVisible(false);
     addTaskFrame.setLocation(300, 520);
    }
    
    /*public void paint(Graphics g){
        
        super.paint(g);
        
        g.drawLine(20, 70, 770, 70);
        g.drawLine(20, 35, 770, 35);
        g.drawLine(20, 103, 770, 103);
        g.drawLine(20, 138, 770, 138);
        g.drawLine(20, 172, 770, 172);
        g.drawLine(20, 205, 770, 205);
        g.drawLine(20, 240, 770, 240);
        g.drawLine(20, 273, 770, 273);
        g.drawLine(20, 307, 770, 307);
        g.drawLine(20, 307, 770, 307);
        }
        */
}
