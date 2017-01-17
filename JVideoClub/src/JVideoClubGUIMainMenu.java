import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

public class JVideoClubGUIMainMenu { 
	
private static void createAndShowGUI() {
    	
        //Create and set up the window.
        JFrame frame = new JFrame("JVideoClub - Main Menu");        
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        
        JPanel topLabelsPanel = new JPanel();
        topLabelsPanel.setLayout(new FlowLayout());
        frame.add(topLabelsPanel, BorderLayout.NORTH);
                
        JLabel mainMenuLabel = new JLabel("Main Menu Options - ");
        //mainMenuLabel.setAlignmentX(topLabelsPanel.LEFT_ALIGNMENT);
        topLabelsPanel.add(mainMenuLabel);        
        JLabel welcomeLabel = new JLabel("Welcome, "+"!"); //----------TODO: Add User Name!
        //welcomeLabel.setAlignmentX(topLabelsPanel.RIGHT_ALIGNMENT);
        topLabelsPanel.add(welcomeLabel);      
                
                
        JPanel mainButtonsPanel = new JPanel();
        mainButtonsPanel.setLayout(new GridLayout());
        frame.add(mainButtonsPanel, BorderLayout.CENTER);             
                
        JButton clientsButton = new JButton("CLIENTS");
        JButton moviesButton = new JButton("MOVIES");
                                  
        mainButtonsPanel.add(clientsButton);
        mainButtonsPanel.add(moviesButton);   
        
        //2 action listeners
        clientsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {            
               
            }
         });
        
        moviesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {            
               
            }
         });
        
        
        JButton quitButton = new JButton("Quit Application");
        frame.add(quitButton, BorderLayout.SOUTH);
        
        //action listener for quit button
        quitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {            
               System.exit(0);
            }
         });
        
        
        //Display the window.     
        frame.setVisible(true);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}

}
