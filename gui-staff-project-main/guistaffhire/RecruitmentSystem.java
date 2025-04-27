
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
    // stores the inputs and their corresponding labels
    private JLabel vacancyNumberLBL;
    private JTextField TFvacancyNumberTXT;
    
    private JLabel StaffNameLBL;
    private JTextField TFstaffNameTXT;
    
    private JLabel jobTypeLBL;
    private JTextField TFJobTypeTXT;
    
    private JLabel qualificationLBL;
    private JTextField qualificationTXT;
    
    private JLabel joiningDateLBL;
    private JTextField TFjoiningDateTXT;
    
    private JLabel designationLBL;
    private JTextField TFdesignationTXT;
    
    private JLabel appointedByLBL;
    private JTextField TFappointedByTXT;
    
    private JLabel joinedLBL;
    private JCheckBox joinedTXT;
    
    
    //relating to full time staff 
    private JLabel salaryLBL;
    private JTextField TFsalaryTXT;
    
    private JLabel WeeklyFractionalHoursLBL;
    private JTextField TFWeeklyFractionalHoursTXT;
    
    
    //relating to part time staff 
    private JLabel workingHourLBL;
    private JTextField TFworkingHourTXT;
    
    private JLabel wagesPerHourLBL;
    private JTextField TFwagesPerHourTXT;
    
    private JLabel shiftsLBL;
    private JTextField TFshiftsTXT;
    
    private JLabel termintedLBL;
    private JCheckBox JoinedTXT;
    
    
    
    
    // stores the attributes for the buttons 
    private JButton submitBUT;
    private JButton fullTimeBUT;
    private JButton partTimeBUT;
    private JButton displayBUT;
    private JButton clearBUT;

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
     JFrame site = new JFrame("recruitment system");
     Container contentPane = site.getContentPane();
     contentPane.setLayout(new GridBagLayout());
     JPanel employmentPanel = new JPanel();
     employmentPanel.setBackground(new Color(28, 26, 26));
     employmentPanel.setPreferredSize(new Dimension(400,280));
     GridBagConstraints gbc = new GridBagConstraints();
     gbc.insets = new Insets (2, 2, 2, 0);//for padding
     
     
     
     //lables and textfields go here 
     vacancyNumberLBL = new JLabel("vacancy");
     gbc.gridx = 0;
     gbc.gridy = 0; 
     contentPane.add(vacancyNumberLBL,gbc);
     
     TFvacancyNumberTXT = new JTextField(10);
     gbc.gridx =1;
     gbc.gridy = 0;
     contentPane.add(TFvacancyNumberTXT, gbc);
     
     
     
     
     StaffNameLBL = new JLabel("name");
     gbc.gridx = 0;
     gbc.gridy = 2; 
     
     contentPane.add(StaffNameLBL,gbc);
     
     TFstaffNameTXT = new JTextField(10);
     gbc.gridx =1;
     gbc.gridy =2;
     contentPane.add(TFstaffNameTXT, gbc);
     
     
     
     
     jobTypeLBL = new JLabel("job type");
     gbc.gridx = 0;
     gbc.gridy = 3;
     contentPane.add(jobTypeLBL,gbc);
     
     TFJobTypeTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 3;
     contentPane.add(TFJobTypeTXT,gbc);
     
     
     
     
     qualificationLBL = new JLabel("qualification");
     gbc.gridx = 0;
     gbc.gridy = 4;
     contentPane.add(qualificationLBL,gbc);
     
     qualificationTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 4;
     contentPane.add(qualificationTXT,gbc);
     
     
     
     
     joiningDateLBL = new JLabel("Join date");
     gbc.gridx = 0;
     gbc.gridy = 5;
     contentPane.add(joiningDateLBL,gbc);
     
     TFjoiningDateTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 5;
     contentPane.add(TFjoiningDateTXT,gbc);
     
     
     
     
     
     designationLBL= new JLabel("designation");
     gbc.gridx = 0;
     gbc.gridy = 6;
     contentPane.add(designationLBL,gbc);
     
     TFdesignationTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 6;
     contentPane.add(TFdesignationTXT,gbc);
     
     
     
     
     appointedByLBL = new JLabel("appointed by");
     gbc.gridx = 0;
     gbc.gridy = 7;
     contentPane.add(appointedByLBL,gbc);
     
     TFappointedByTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 7;
     contentPane.add(TFappointedByTXT,gbc);
     
     
     
     
     
     

     
     joinedTXT = new JCheckBox();
     joinedTXT.setText("joined");
     joinedTXT.setHorizontalTextPosition(SwingConstants.LEFT);
     gbc.gridx = 0;
     gbc.gridy = 8;
     site.add(joinedTXT,gbc);
     

    
     JLabel fullTimeHeaderLBL = new JLabel("fulltime staff");
     gbc.gridx = 1;
     gbc.gridy = 9;
     site.add(fullTimeHeaderLBL,gbc);
     
     
     WeeklyFractionalHoursLBL = new JLabel("Weekly Fractional Hours");
     gbc.gridx =0;
     gbc.gridy = 11;
     site.add(WeeklyFractionalHoursLBL,gbc);
     
     TFWeeklyFractionalHoursTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 11;
     site.add(TFWeeklyFractionalHoursTXT,gbc);
     
     
     
     
     salaryLBL = new JLabel("salary");
     gbc.gridx =0;
     gbc.gridy = 12;
     site.add(salaryLBL,gbc);
     
     TFsalaryTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 12;
     site.add(TFsalaryTXT,gbc);
     
     
     
     
     
     
     JLabel partTimeHeaderLBL = new JLabel(" part-time staff");
     gbc.gridx = 1;
     gbc.gridy = 14;
     site.add(partTimeHeaderLBL,gbc);
     
     workingHourLBL = new JLabel("working hour");
     gbc.gridx = 0;
     gbc.gridy = 15;
     site.add(workingHourLBL,gbc);
     
     TFworkingHourTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 15;
     site.add(TFworkingHourTXT,gbc);
     
     
     
     
     
     workingHourLBL = new JLabel("working hour");
     gbc.gridx = 0;
     gbc.gridy = 16;
     site.add(workingHourLBL,gbc);
     
     TFworkingHourTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 16;
     site.add(TFworkingHourTXT,gbc);
     
     
     
     
     
     
     //buttons are located here 
     
     fullTimeBUT = new JButton("add fulltime staff");
     gbc.gridx = 12;
     gbc.gridy = 3;
     //submitBUT.addActionListener(this);
     site.add(fullTimeBUT,gbc);
     
     
     fullTimeBUT = new JButton("add fulltime staff");
     gbc.gridx = 13;
     gbc.gridy = 4;
     //submitBUT.addActionListener(this);
     site.add(fullTimeBUT,gbc);
     
     
     partTimeBUT = new JButton("add parttime staff");
     gbc.gridx = 12;
     gbc.gridy = 5;
     //submitBUT.addActionListener(this);
     site.add(partTimeBUT,gbc);
     
     
     displayBUT = new JButton("display number");
     gbc.gridx = 12;
     gbc.gridy = 2;
     //submitBUT.addActionListener(this);
     site.add(displayBUT,gbc);
     
     
     clearBUT = new JButton("clear");
     gbc.gridx = 12;
     gbc.gridy = 5;
     //submitBUT.addActionListener(this);
     site.add(clearBUT,gbc);
     
     
     
     
     
     
     site.pack(); 
     
     site.setLayout(new BorderLayout());
     site.add(employmentPanel,BorderLayout.WEST);
     site.setSize(500,500);
     site.setVisible(true);
    }
    public static void main(String[]args){
        RecruitmentSystem recruitmentSystem = new RecruitmentSystem();
        System.out.println("wooo were in main baby");
        FullTimeStaffHire poo = new FullTimeStaffHire(
        1,
        2,
        3,
        "burger",
        "burger",
        "burger",
        "burger",
        "burger",
        "burger",
        true
        );
        poo.setShifts();
    }
    
    /**
     * find which button triggered the event and call the appropiate method
     */

    public void actionPerformed(ActionEvent event){
        if(event.getSource()==submitBUT){
            System.out.println(TFstaffNameTXT.getText());
        }
        
    }












}
    

