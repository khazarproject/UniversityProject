/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timemanagementproject;

import javax.swing.SwingUtilities;

/**
 *
 * @author shukur
 */
public class TimeManagementProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable(){      
            public void run() {      
                new MainFrame();
            }
            
        });
    }
    
}
