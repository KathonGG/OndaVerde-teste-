package ondaverde;

import Login.LoginPanel;
import javax.swing.JTextField;

public class OndaVerde {

    public static void main(String[] args) {
         // Create a new instance of LoginPanel
        LoginPanel loginPanel = new LoginPanel();
        
        // Create a JFrame to hold the LoginPanel
        javax.swing.JFrame frame = new javax.swing.JFrame("Login Example");
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        
        // Add the LoginPanel to the JFrame
        frame.getContentPane().add(loginPanel);
        
        // Set the size of the JFrame
        frame.pack();
        JTextField textField = new JTextField("Fixed Text Field");
        textField.setBounds(50,50,200,30);
        frame.setSize(625, 500);
        
        
        // Center the JFrame on the screen
        frame.setLocationRelativeTo(null);
        
        // Make the JFrame visible
        frame.setVisible(true);
    }
    
}
