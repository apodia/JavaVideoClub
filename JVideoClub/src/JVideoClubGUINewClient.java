import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class JVideoClubGUINewClient { 

private static void createAndShowGUI() {
    	
        //Create and set up the window.
        JFrame frame = new JFrame("JVideoClub - Add Client");        
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JLabel label = new JLabel("Add Client");
        frame.add(label, BorderLayout.NORTH);
        
        JPanel panelLogin = new JPanel();
        panelLogin.setLayout(new GridLayout(5,2));
        frame.add(panelLogin, BorderLayout.CENTER);
        
        
        
        JLabel labelName = new JLabel("Name:  ");
        labelName.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel labelSurname = new JLabel("Surname:  ");
        labelSurname.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel labelAddress = new JLabel("Address:  ");
        labelAddress.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel labelPhone = new JLabel("Phone:  ");
        labelPhone.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel labelCity = new JLabel("City:  ");
        labelCity.setHorizontalAlignment(JLabel.CENTER);       
        
        
        
        JTextField textName = new JTextField("", 30);
        textName.setHorizontalAlignment(JTextField.LEFT);
        
        JTextField textSurname = new JTextField("", 30);
        textSurname.setHorizontalAlignment(JTextField.LEFT);
        
        JTextField textAddress = new JTextField("", 30);
        textAddress.setHorizontalAlignment(JTextField.LEFT);
        
        JTextField textPhone = new JTextField("", 30);
        textPhone.setHorizontalAlignment(JTextField.LEFT);
        
        JTextField textCity = new JTextField("", 30);
        textCity.setHorizontalAlignment(JTextField.LEFT);      
        
        
        
        panelLogin.add(labelName);
        panelLogin.add(textName);
        
        panelLogin.add(labelSurname);
        panelLogin.add(textSurname);   
        
        panelLogin.add(labelAddress);
        panelLogin.add(textAddress); 
        
        panelLogin.add(labelPhone);
        panelLogin.add(textPhone); 
        
        panelLogin.add(labelCity);
        panelLogin.add(textCity); 
        
        
        
        JPanel panelSearch = new JPanel();
        panelSearch.setLayout(new FlowLayout());
        frame.add(panelSearch, BorderLayout.SOUTH);
                
        
        JButton buttonSearch = new JButton("Add Client");    
        panelSearch.add(buttonSearch);    
        //added an ActionListener
        buttonSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {            
              
            }
        });        
 
        //Display the window.        
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
