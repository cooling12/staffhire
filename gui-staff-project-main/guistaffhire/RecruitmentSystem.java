/**
 * Write a description of class GUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;


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
    private JCheckBox terminatedTXT;
    
    
    
    
    // stores the attributes for the buttons 
    private JButton submitBUT;
    private JButton fullTimeBUT;
    private JButton partTimeBUT;
    private JButton displayBUT;
    private JButton clearBUT;
    private JButton setSalaryBUT;
    private JButton setWorkingShiftsBUT;
    private JButton terminateBUT;
    
    //additional attributes 

    private int intifyVancany;
    private double doubleifySalary;
    private int intifyWeeklyFractionalHours;
    private int initifyWorkingHour;
    public double doubleifyWagesPerHour; 
    
    private String shifts;
    
    
    public ArrayList<StaffHire> stafflist = new ArrayList();
    
    

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
     employmentPanel.setBackground(new Color(76, 87, 92));
     employmentPanel.setPreferredSize(new Dimension(700,600));
     GridBagConstraints gbc = new GridBagConstraints();
     gbc.insets = new Insets (5, 5, 5, 5);//for padding
     
     
     
     //lables and textfields go here 
     vacancyNumberLBL = new JLabel("vacancy");
     vacancyNumberLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 0;
     gbc.gridy = 0; 
     contentPane.add(vacancyNumberLBL,gbc);
     
     TFvacancyNumberTXT = new JTextField(10);
     gbc.gridx =1;
     gbc.gridy = 0;
     contentPane.add(TFvacancyNumberTXT, gbc);
     
     
     
     
     StaffNameLBL = new JLabel("name");
     StaffNameLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 0;
     gbc.gridy = 2; 
     
     contentPane.add(StaffNameLBL,gbc);
     
     TFstaffNameTXT = new JTextField(10);
     gbc.gridx =1;
     gbc.gridy =2;
     contentPane.add(TFstaffNameTXT, gbc);
     
     
     
     
     jobTypeLBL = new JLabel("job type");
     jobTypeLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 0;
     gbc.gridy = 3;
     contentPane.add(jobTypeLBL,gbc);
     
     TFJobTypeTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 3;
     contentPane.add(TFJobTypeTXT,gbc);
     
     
     
     
     qualificationLBL = new JLabel("qualification");
     qualificationLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 0;
     gbc.gridy = 4;
     contentPane.add(qualificationLBL,gbc);
     
     qualificationTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 4;
     contentPane.add(qualificationTXT,gbc);
     
     
     
     
     joiningDateLBL = new JLabel("Join date");
     joiningDateLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 0;
     gbc.gridy = 5;
     contentPane.add(joiningDateLBL,gbc);
     
     TFjoiningDateTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 5;
     contentPane.add(TFjoiningDateTXT,gbc);
     
     
     
     
     
     designationLBL= new JLabel("designation");
     designationLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 0;
     gbc.gridy = 6;
     contentPane.add(designationLBL,gbc);
     
     TFdesignationTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 6;
     contentPane.add(TFdesignationTXT,gbc);
     
     
     
     
     appointedByLBL = new JLabel("appointed by");
     appointedByLBL.setForeground(new Color(255,255,255));
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
     gbc.gridx = 1;
     gbc.gridy = 8;
     site.add(joinedTXT,gbc);
     

     
     /**
     * this section handles the fulltime staff section of the ui 
     */
    
     JLabel fullTimeHeaderLBL = new JLabel("fulltime staff");
     fullTimeHeaderLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 1;
     gbc.gridy = 9;
     site.add(fullTimeHeaderLBL,gbc);
     
     
     WeeklyFractionalHoursLBL = new JLabel("Weekly Fractional Hours");
     WeeklyFractionalHoursLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 0;
     gbc.gridy = 11;
     site.add(WeeklyFractionalHoursLBL,gbc);
     
     TFWeeklyFractionalHoursTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 11;
     site.add(TFWeeklyFractionalHoursTXT,gbc);
     
     
     
     
     salaryLBL = new JLabel("salary");
     salaryLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 0;
     gbc.gridy = 12;
     site.add(salaryLBL,gbc);
     
     TFsalaryTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 12;
     site.add(TFsalaryTXT,gbc);
     
     
        
     
     setSalaryBUT = new JButton("set salary");
     gbc.gridx = 1;
     gbc.gridy = 13;
     setSalaryBUT.addActionListener(this);
     site.add(setSalaryBUT,gbc);
     
          
     
     fullTimeBUT = new JButton("add fulltime staff");
     gbc.gridx = 1;
     gbc.gridy = 14;
     fullTimeBUT.addActionListener(this);
     site.add(fullTimeBUT,gbc);
     
     
     
     
     /**
     * this section handles the part time staff section of the ui 
     */
     
     
     JLabel partTimeHeaderLBL = new JLabel(" part-time staff");
     partTimeHeaderLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 1;
     gbc.gridy = 15;
     site.add(partTimeHeaderLBL,gbc);
     
     workingHourLBL = new JLabel("working hour");
     workingHourLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 0;
     gbc.gridy = 16;
     site.add(workingHourLBL,gbc);
     
     TFworkingHourTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 16;
     site.add(TFworkingHourTXT,gbc);
     
     
     
     
     
     wagesPerHourLBL = new JLabel("wages per hour");
     wagesPerHourLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 0;
     gbc.gridy = 17;
     site.add(wagesPerHourLBL,gbc);
     
     TFwagesPerHourTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 17;
     site.add(TFwagesPerHourTXT,gbc);
     
     
     
     
     shiftsLBL = new JLabel("shifts");
     shiftsLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 0;
     gbc.gridy = 18;
     site.add(shiftsLBL,gbc);
     
     TFshiftsTXT = new JTextField(10);
     gbc.gridx = 1;
     gbc.gridy = 18;
     site.add(TFshiftsTXT,gbc);
     
     
     
     terminatedTXT = new JCheckBox();
     terminatedTXT.setText("terminated");
     terminatedTXT.setHorizontalTextPosition(SwingConstants.LEFT);
     gbc.gridx = 1;
     gbc.gridy = 19;
     site.add(terminatedTXT,gbc);
     
     
     
     partTimeBUT = new JButton("add parttime staff");
     gbc.gridx = 1;
     gbc.gridy = 20;
     //submitBUT.addActionListener(this);
     partTimeBUT.addActionListener(this);
     site.add(partTimeBUT,gbc);
     

     
     
     
     site.add(partTimeBUT,gbc);
     
     setWorkingShiftsBUT = new JButton("set working shift");
     gbc.gridx = 1;
     gbc.gridy = 21;
     partTimeBUT.addActionListener(this);
     setWorkingShiftsBUT.addActionListener(this);
     site.add(setWorkingShiftsBUT,gbc);
     
     
     

     terminateBUT = new JButton("terminate");
     gbc.gridx = 1;
     gbc.gridy = 22;
     terminateBUT.addActionListener(this);
     site.add(terminateBUT,gbc);
     
     
     

     
     
     
     
     
     
     
     
     
     
     /**
     * this section handles admin buttons 
     */
     displayBUT = new JButton("display number");
     gbc.gridx = 12;
     gbc.gridy = 2;

     displayBUT.addActionListener(this);
     site.add(displayBUT,gbc);
     
     
     clearBUT = new JButton("clear");
     gbc.gridx = 12;
     gbc.gridy = 3;
     clearBUT.addActionListener(this);
     site.add(clearBUT,gbc);
     
     
     
     
     
     
     site.pack(); 
     
     site.setLayout(new BorderLayout());
     site.add(employmentPanel,BorderLayout.WEST);
     site.setSize(600,710);
     site.setVisible(true);
    }
    public static void main(String[]args){
        RecruitmentSystem recruitmentSystem = new RecruitmentSystem();
        System.out.println("wooo were in main baby");

        
        
        }
    
    
    /**
     * find which button triggered the event and call the appropiate method
     */

    public void actionPerformed(ActionEvent event){
        if(event.getSource()==clearBUT){
            TFvacancyNumberTXT.setText("");
            TFstaffNameTXT.setText("");
            TFJobTypeTXT.setText("");
            qualificationTXT.setText("");
            TFjoiningDateTXT.setText("");
            TFdesignationTXT.setText("");
            TFappointedByTXT.setText("");
            TFsalaryTXT.setText("");
            TFWeeklyFractionalHoursTXT.setText("");
            TFworkingHourTXT.setText("");
            TFwagesPerHourTXT.setText("");
            TFshiftsTXT.setText("");
            terminatedTXT.setSelected(false);
            joinedTXT.setSelected(false);

        }
        else if (event.getSource() == fullTimeBUT){
             intifyVancany = Integer.parseInt(TFvacancyNumberTXT.getText());
             doubleifySalary = Double.parseDouble(TFsalaryTXT.getText());
             intifyWeeklyFractionalHours = Integer.parseInt(TFWeeklyFractionalHoursTXT.getText());
             
            try{intifyVancany = Integer.parseInt(TFvacancyNumberTXT.getText());
            }
            catch(NumberFormatException nfe){
                System.out.println("wrong move buddy");
                TFvacancyNumberTXT.setText("");
            }    
            try{doubleifySalary = Double.parseDouble(TFsalaryTXT.getText());
            }
            catch(NumberFormatException nfe){
                System.out.println("wrong move buddy");
                TFsalaryTXT.setText("");
            }    
            
            try{intifyWeeklyFractionalHours = Integer.parseInt(TFWeeklyFractionalHoursTXT.getText());
            }
            catch(NumberFormatException nfe){
                System.out.println("wrong move buddy");
                TFWeeklyFractionalHoursTXT.setText("");
            }    
            
            
            
            
            
            intifyVancany = Integer.parseInt(TFvacancyNumberTXT.getText());
            doubleifySalary = Double.parseDouble(TFsalaryTXT.getText());
            intifyWeeklyFractionalHours = Integer.parseInt(TFWeeklyFractionalHoursTXT.getText());
             
             FullTimeStaffHire   full = new FullTimeStaffHire(
            
            intifyVancany,
            TFstaffNameTXT.getText(),
            TFJobTypeTXT.getText(),
            qualificationTXT.getText(),
            TFjoiningDateTXT.getText(),
            TFdesignationTXT.getText(),
            TFappointedByTXT.getText(),
            joinedTXT.isSelected(),
            intifyWeeklyFractionalHours,
            doubleifySalary
            );   

            
            
            full.SetSalary(doubleifySalary);
            full.SetWeeklyFractionalHours(intifyWeeklyFractionalHours);
            full.display();

            
            stafflist.add(full);
            for(int i = 0; i<stafflist.size(); i++){
                System.out.println(stafflist.get(i).toString());
            }
        }
        
        else if (event.getSource() == partTimeBUT){
            
             
              
            try{intifyVancany = Integer.parseInt(TFvacancyNumberTXT.getText());
            }
            catch(NumberFormatException nfe){
                System.out.println("wrong move buddy");
            }    
            finally{
                TFvacancyNumberTXT.setText("");
            }
            
            try{initifyWorkingHour = Integer.parseInt(TFworkingHourTXT.getText());
            }
            catch(NumberFormatException nfe){
                System.out.println("wrong move buddy");
            }    
            finally{
                TFworkingHourTXT.setText("");
            }
            
            try{doubleifyWagesPerHour = Double.parseDouble(TFwagesPerHourTXT.getText());
            }
            catch(NumberFormatException nfe){
                System.out.println("wrong move buddy");
            }    
            finally{
                TFvacancyNumberTXT.setText("");
            }
            
            shifts = TFshiftsTXT.getText();
            doubleifyWagesPerHour = Double.parseDouble(TFwagesPerHourTXT.getText());
            intifyVancany = Integer.parseInt(TFvacancyNumberTXT.getText());             
            initifyWorkingHour = Integer.parseInt(TFworkingHourTXT.getText()); 
             
            PartTimeStaffHire   part = new PartTimeStaffHire(

            intifyVancany,
            TFstaffNameTXT.getText(),
            TFJobTypeTXT.getText(),
            qualificationTXT.getText(),
            TFjoiningDateTXT.getText(),
            TFdesignationTXT.getText(),
            TFappointedByTXT.getText(),
            joinedTXT.isSelected(),
            initifyWorkingHour,
            doubleifyWagesPerHour,
            shifts,
            terminatedTXT.isSelected()
            );
            System.out.println(part.GetStaffName());
            System.out.println(terminatedTXT.isSelected());

            
            
            
            part.SetWorkingHour(initifyWorkingHour);
            part.SetShifts(TFshiftsTXT.getText());
            part.SetWagesPerHour(doubleifyWagesPerHour);
            stafflist.add(part);
            for(int i = 0; i<stafflist.size(); i++){
                System.out.println(stafflist.get(i).toString());
            }
             
           
        }

        else if (event.getSource() == displayBUT){
            
            System.out.println(stafflist.get(intifyVancany));
            intifyVancany = Integer.parseInt(TFvacancyNumberTXT.getText());
            
              
            
                for(int i = 0; i < stafflist.size(); i++){
                if(intifyVancany == i){
                    StaffHire figure = stafflist.get(i);
                            
                  if   (figure instanceof FullTimeStaffHire) {
                    ((FullTimeStaffHire) figure).display();
                    
                    }
                    else if (figure instanceof PartTimeStaffHire) {
                    ((PartTimeStaffHire) figure).display();
                    
                    }
        
       
                }
           
        
            }
            
        }
        else if(event.getSource() == setSalaryBUT){
            
              for(int i = 0; i < stafflist.size(); i++){
                if(intifyVancany == i){
                    StaffHire figure = stafflist.get(i);
                    doubleifySalary = Double.parseDouble(TFsalaryTXT.getText());
                    boolean joined =  figure. GetJoined();
                    System.out.println(joined);
                    // Check if the object is a FullTimeStaffHire and cast if it is
                 if   (figure instanceof FullTimeStaffHire && joined == true) {
                        ((FullTimeStaffHire) figure).SetSalary(doubleifySalary);
                    }
                    // Check if the object is a PartTimeStaffHire and cast if it is
                 else if (figure instanceof PartTimeStaffHire) {
                        System.out.println("wrong staff member");
            
                 }
                 else{
                    System.out.println("cant set salary staff member has not joined");
                 }
        
       
                }
           
        
            }
            
        
        
        }

        else if(event.getSource() == setWorkingShiftsBUT){
            
            for(int i = 0; i < stafflist.size(); i++){
                if(intifyVancany == i){
                    StaffHire figure = stafflist.get(i);
                     shifts = TFshiftsTXT.getText();       
                    
                 if   (figure instanceof FullTimeStaffHire) {
                     System.out.println("wrong staff member");
                    }
                
                 else if (figure instanceof PartTimeStaffHire) {
                     ((PartTimeStaffHire) figure).SetShifts(TFshiftsTXT.getText());
                     System.out.println("setty");
                    }
        
       
                }
           
        
            }
        
        
        }
            
        
        
        else if(event.getSource() == terminateBUT){
            
            for(int i = 0; i < stafflist.size(); i++){
                if(intifyVancany == i){
                    StaffHire figure = stafflist.get(i);    
                    stafflist.remove(figure);
                    System.out.println(stafflist.size());
             
                 
        
       
                }

           
        
            }
        
        
        }
        }













    }
    




