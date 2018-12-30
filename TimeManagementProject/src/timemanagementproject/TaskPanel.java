/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timemanagementproject;

import java.awt.Graphics;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author shukur
 */
public class TaskPanel extends JPanel{
    
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
    public String taskName;
    
    public TaskPanel(){
        
        setLayout(new GridLayout(0,1,10,3));
        
        btn1 = new JCheckBox(taskName);
        btn2 = new JCheckBox();
        btn3 = new JCheckBox();
        btn4 = new JCheckBox();
        btn5 = new JCheckBox();
        btn6 = new JCheckBox();
        btn7 = new JCheckBox();
        btn8 = new JCheckBox();
        btn9 = new JCheckBox();
        btn10 = new JCheckBox();
        
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);
        add(btn8);
        add(btn9);
        add(btn10);
        
    }
    public void paint(Graphics g){
            g.drawLine(20, 70, 770, 70);
            g.drawLine(20, 35, 770, 35);
            g.drawLine(20, 103, 770, 103);
            g.drawLine(20, 138, 770, 138);
            g.drawLine(20, 172, 770, 172);
            g.drawLine(20, 205, 770, 205);
            g.drawLine(20, 240, 770, 240);
            g.drawLine(20, 273, 770, 273);
            g.drawLine(20, 307, 770, 307);
            g.drawLine(20, 340, 770, 340);
        }
}
