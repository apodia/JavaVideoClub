import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;

public class JVideoClubGUIFindClient { //implements ActionListener {

	private static void createAndShowGUI() {
		
	      //Create and set up the window.
		JFrame frame = new JFrame("JVideoClub - Find Client");  
		frame.setLayout(new BorderLayout());
	    frame.setSize(700, 300);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	       
	      
	        JPanel searchPanel = new JPanel();
	        searchPanel.setLayout(new FlowLayout());
	        frame.add(searchPanel, BorderLayout.NORTH);        
	                
	        JTextField textFieldSearch = new JTextField(25);
	        textFieldSearch.setToolTipText("Enter name or partial name here...");
	        textFieldSearch.setHorizontalAlignment(JTextField.LEFT);        
	        JButton searchClientButton = new JButton("Search Client");       
	                  
	        searchPanel.add(textFieldSearch);      
	        searchPanel.add(searchClientButton);
	      
	        //action listener for search client button
	        searchClientButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent ae) {            
	               
	            }
	        });
	        
	                            
	        JPanel mainTablePanel = new JPanel();
	        mainTablePanel.setLayout(new FlowLayout());
	        frame.add(mainTablePanel, BorderLayout.CENTER);        
	        
	        JTable clientsTable = new JTable(new String[][] { {"001", "is", "a"}, {"002", "a", "Test"} },
	                						new String[] {"Index", "Client Name", "Client Surname"});        
	          
	        JScrollPane jsp = new JScrollPane(clientsTable);
	        frame.getContentPane().add(jsp, BorderLayout.CENTER);
	      
	      
	      
	      
	      
	      //Display the window.        
	      frame.setVisible(true);     
		}	
		
		public static void main(String[] args) {		
			javax.swing.SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					createAndShowGUI();
				}
			});
		}

}
