import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class JVideoClubGUIAddMovie {

private static void createAndShowGUI() {
    	
        //Create and set up the window.
        JFrame frame = new JFrame("JVideoClub - Add Movie");        
        frame.setLayout(new BorderLayout());
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        JLabel label = new JLabel("Add Movie");
        frame.add(label, BorderLayout.NORTH);
        
        JPanel panelLogin = new JPanel();
        panelLogin.setLayout(new GridLayout(5,2));
        frame.add(panelLogin, BorderLayout.CENTER);
        
        
        
        JLabel labelMovieName = new JLabel("Movie Name:  ");
        labelMovieName.setHorizontalAlignment(JLabel.CENTER); 
        
        JLabel labelDirectorName = new JLabel("Director:  ");
        labelDirectorName.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel labelGenre = new JLabel("Genre:  ");
        labelGenre.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel labelYear = new JLabel("Year:  ");
        labelYear.setHorizontalAlignment(JLabel.CENTER);       
        
        
        
        JTextField textMovieName = new JTextField("", 30);
        textMovieName.setHorizontalAlignment(JTextField.LEFT);
        
        JTextField textDirectorName = new JTextField("", 30);
        textDirectorName.setHorizontalAlignment(JTextField.LEFT);
        
        JTextField textGenre = new JTextField("", 30);
        textGenre.setHorizontalAlignment(JTextField.LEFT);
        
        JTextField textYear = new JTextField("", 4);
        textYear.setHorizontalAlignment(JTextField.LEFT);      
        
        
        
        panelLogin.add(labelMovieName);
        panelLogin.add(textMovieName);  
        
        panelLogin.add(labelDirectorName);
        panelLogin.add(textDirectorName); 
        
        panelLogin.add(labelGenre);
        panelLogin.add(textGenre); 
        
        panelLogin.add(labelYear);
        panelLogin.add(textYear); 
        
        
        
        JPanel panelSearch = new JPanel();
        panelSearch.setLayout(new FlowLayout());
        frame.add(panelSearch, BorderLayout.SOUTH);
                
        
        JButton buttonSearch = new JButton("Add Movie");    
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
