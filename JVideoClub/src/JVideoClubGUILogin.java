import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author todi
 */
public class JVideoClubGUILogin {
     /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
    	
        //Create and set up the window.
        JFrame frame = new JFrame("JVideoClub");        
        frame.setLayout(new BorderLayout());
        frame.setSize(300, 135);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JLabel label = new JLabel("Please Login to the JVideoClub");
        frame.add(label, BorderLayout.NORTH);
        
        JPanel panelLogin = new JPanel();
        panelLogin.setLayout(new GridLayout(2,2));
        frame.add(panelLogin, BorderLayout.CENTER);
        
        JLabel labelUsername = new JLabel("Username:  ");
        labelUsername.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel labelPassword = new JLabel("Password:  ");
        labelPassword.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField textUsername = new JTextField("", 30);
        textUsername.setHorizontalAlignment(JTextField.LEFT);
        
        JPasswordField textPassword = new JPasswordField("", 30);
        textPassword.setHorizontalAlignment(JTextField.LEFT);
        
        panelLogin.add(labelUsername);
        panelLogin.add(textUsername);
        
        panelLogin.add(labelPassword);
        panelLogin.add(textPassword);                    
        
        JPanel panelOKCancel = new JPanel();
        panelOKCancel.setLayout(new FlowLayout());
        frame.add(panelOKCancel, BorderLayout.SOUTH);
                
        JButton buttonOk = new JButton("OK");    
        panelOKCancel.add(buttonOk);    
        //added an ActionListener
        buttonOk.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {            
               //Check for Successful Login - Display the appropriate message.
               
               //On Successful login call the Main Menu Form
              // if(){  }
               //On unsuccessful login call a dialog box informing the user, and don't login!
              // else if(){    }
            }
         });
        
        
        JButton buttonCancel = new JButton("Cancel");
        panelOKCancel.add(buttonCancel);
        //added an ActionListener
        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {            
               System.exit(1); //just Exit the program...
            }
         });        
             
        
 
        //Display the window.
        //frame.pack(); //either this or the setSize() added before...
        frame.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}