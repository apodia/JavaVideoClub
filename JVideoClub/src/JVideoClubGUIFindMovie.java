import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;
//import java.awt.GridLayout;
import javax.swing.*;

public class JVideoClubGUIFindMovie { 
	
private static void createAndShowGUI() {
    	
        //Create and set up the window.
        JFrame frame = new JFrame("JVideoClub - Find Movie");        
        frame.setLayout(new BorderLayout());
        frame.setSize(700, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        JPanel searchPanel = new JPanel();
        searchPanel.setLayout(new FlowLayout());
        frame.add(searchPanel, BorderLayout.NORTH);        
                
        JTextField textFieldSearch = new JTextField(25);
        textFieldSearch.setToolTipText("Enter title or part of title here...");
        textFieldSearch.setHorizontalAlignment(JTextField.LEFT);        
        JButton searchMovieButton = new JButton("Search");       
                  
        searchPanel.add(textFieldSearch);      
        searchPanel.add(searchMovieButton);
        
        //action listener for search movie button
        searchMovieButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {            
               
            }
         });
                      
        JPanel mainTablePanel = new JPanel();
        mainTablePanel.setLayout(new FlowLayout());
        frame.add(mainTablePanel, BorderLayout.CENTER);        
        
        JTable moviesTable = new JTable(new String[][] { {"001", "is", "a"}, {"002", "a", "Test"} },
                						new String[] {"Index", "Movie Title", "Movie Director"});        
          
        JScrollPane jsp = new JScrollPane(moviesTable);
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
