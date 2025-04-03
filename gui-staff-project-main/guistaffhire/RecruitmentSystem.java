
/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RecruitmentSystem  implements ActionListener
{
    // instance variables - replace the example below with your own
    private JLabel vacancyNumberLBL;
    private JTextField TFvacancyNumberTXT;
    
    private JLabel staffNameLBL;
    private JTextField TFstaffNameTXT;
    
    private JLabel jobTypeLBL;
    private JTextField TFJobTypeTXT;
    
    private JLabel qualificationLBL;
    private JTextField qualificationTXT;
    
    private JLabel joiningdateLBL;
    private JTextField TFjoiningdateTXT;
    
    private JLabel designationLBL;
    private JTextField TFdesignationTXT;
    
    private JLabel appointedByLBL;
    private JTextField TFappointedBy;
    
    private JLabel joinedLBL;
    private JCheckBox joinedTXT;

    /**
     * Constructor for objects of class GUI
     */
    public RecruitmentSystem()
    {
        // initialise instance variables
        makeFrame();
    }
    
    private void makeFrame()
    {
        
     //the design of the gui will be here 
     JFrame frame = new JFrame("stuff for now");
     Container contentPane = frame.getContentPane();
     contentPane.setLayout(new GridBagLayout());
     GridBagConstraints gbc = new GridBagConstraints();
     gbc.insets = new Insets (5, 5, 5, 5);//for padding
     
     
     vacancyNumberLBL = new JLabel("vacany");
     gbc.gridx = 0;
     gbc.gridy = 0; 
     
     contentPane.add(vacancyNumberLBL,gbc);
     
     TFvacancyNumberTXT = new JTextField(15);
     gbc.gridx =1;
     gbc.gridy = 0;
     contentPane.add(TFvacancyNumberTXT, gbc);
     
     
     frame.pack(); 
     frame.setVisible(true);
    }
    public static void main(String[]args){
        RecruitmentSystem recruitmentSystem = new RecruitmentSystem();
    }
    
    /**
     * find which button triggered the event and call the appropiate method
     */

    public void actionPerformed(ActionEvent event){
        
    }












}
    

