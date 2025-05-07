/**
 * this makes the gui,handles the inputs/outputs and stores the database of staff 
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
    public int intifyWeeklyFractionalHours;
    private int initifyWorkingHour;
    private double doubleifyWagesPerHour; 
    private String shifts;
    
    // the list the staff are stored in 
    public ArrayList<StaffHire> stafflist = new ArrayList();
    private JLabel staffSizeLBL;
    
    

    /**
     * Constructor for objects of class GUI
     */
    public RecruitmentSystem()
    {
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
     
     
     
     
     /**
     * this section handles staffhire inputs 
     */
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
     
     
     

     //checkbox
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
     
          
     
     fullTimeBUT = new JButton("add full-time staff");
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
     terminatedTXT.setText("terminate");
     terminatedTXT.setHorizontalTextPosition(SwingConstants.LEFT);
     gbc.gridx = 1;
     gbc.gridy = 19;
     site.add(terminatedTXT,gbc);
     
     
     
     partTimeBUT = new JButton("add part-time staff");
     gbc.gridx = 1;
     gbc.gridy = 20;
     partTimeBUT.addActionListener(this);
     site.add(partTimeBUT,gbc);
     

     setWorkingShiftsBUT = new JButton("set working shift");
     gbc.gridx = 1;
     gbc.gridy = 21;
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
     
     
     staffSizeLBL = new JLabel("list of staff: "+"empty");
     staffSizeLBL.setForeground(new Color(255,255,255));
     gbc.gridx = 12;
     gbc.gridy = 4;
     site.add(staffSizeLBL,gbc);
     
     
     //creates the frame 
     site.pack(); 
     site.setLayout(new BorderLayout());
     site.add(employmentPanel,BorderLayout.WEST);
     site.setSize(600,710);
     site.setVisible(true);
    }
    public static void main(String[]args){
        RecruitmentSystem recruitmentSystem = new RecruitmentSystem();

        
        
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
    
            try{intifyVancany = Integer.parseInt(TFvacancyNumberTXT.getText());
            }
            catch(NumberFormatException nfe){
                System.out.println("invalid vacancy number input a Arabic numeral 1,2,3 ecetra");
                TFvacancyNumberTXT.setText("");
            }    
            try{doubleifySalary = Double.parseDouble(TFsalaryTXT.getText());
            }
            catch(NumberFormatException nfe){
                System.out.println("invalid salary input please input a Arabic numeral within two decimal places");
                System.out.println("2.45 for example");
                TFsalaryTXT.setText("");
            }    
            
            try{intifyWeeklyFractionalHours = Integer.parseInt(TFWeeklyFractionalHoursTXT.getText());
            }
            catch(NumberFormatException nfe){
                System.out.println("wrong input please only input a whole number ");
                TFWeeklyFractionalHoursTXT.setText("");
            }    
            
            
            
            
            //converting  the inputs into paramater friendly datatypes
            intifyVancany = Integer.parseInt(TFvacancyNumberTXT.getText());
            doubleifySalary = Double.parseDouble(TFsalaryTXT.getText());
            intifyWeeklyFractionalHours = Integer.parseInt(TFWeeklyFractionalHoursTXT.getText());
            System.out.println("aaaaaaaah"+intifyWeeklyFractionalHours);
             
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

            
            
            full.setWeeklyFractionalHours(intifyWeeklyFractionalHours);
            full.display();
            stafflist.add(full);
             for(int i = 0; i<stafflist.size(); i++){
                    System.out.println(stafflist.get(i).toString());

                    staffSizeLBL.setText("list of staff:"+Integer.toString(stafflist.size()));
                    staffSizeLBL.getText();
            } 
        }
        
        else if (event.getSource() == partTimeBUT){
              
            try{intifyVancany = Integer.parseInt(TFvacancyNumberTXT.getText());
            }
            catch(NumberFormatException nfe){
                System.out.println("invalid vacancy number input a Arabic numeral 1,2,3 ecetra");
                TFvacancyNumberTXT.setText("");
            }    
            try{initifyWorkingHour = Integer.parseInt(TFworkingHourTXT.getText());
            }
            catch(NumberFormatException nfe){
                System.out.println("wrong input please only input a whole number ");
                TFworkingHourTXT.setText("");
            }   
            try{doubleifyWagesPerHour = Double.parseDouble(TFwagesPerHourTXT.getText());
            }
            catch(NumberFormatException nfe){
                System.out.println("invalid wage input please input a Arabic numeral within two decimal places");
                System.out.println("2.45 for example");
                TFworkingHourTXT.setText("");
            }    
            
            // converts the inputs into paramater friendly datatypes
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
            TFshiftsTXT.getText(),
            terminatedTXT.isSelected()
            );

            
            
            
            part.setWorkingHour(initifyWorkingHour);
            part.setShifts(TFshiftsTXT.getText());
            part.setTerminated(terminatedTXT.isSelected());
            part.setWagesPerHour(doubleifyWagesPerHour);
            part.display();
            stafflist.add(part);
            
            for(int i = 0; i<stafflist.size(); i++){
                    System.out.println(stafflist.get(i).toString());

                    staffSizeLBL.setText("list of staff:"+Integer.toString(stafflist.size()));
                    staffSizeLBL.getText();
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
                    boolean joined =  figure.getJoined();
                    System.out.println(joined);
                
                 if   (figure instanceof FullTimeStaffHire && joined == true) {
                        ((FullTimeStaffHire) figure).setSalary(doubleifySalary);
                    }
                    
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
                     ((PartTimeStaffHire) figure).setShifts(TFshiftsTXT.getText());
                     System.out.println("working shift set");
                    }
        
       
                }
           
        
            }
        
        
        }
            
        
        
        else if(event.getSource() == terminateBUT){
            
            for(int i = 0; i < stafflist.size(); i++){
                if(intifyVancany == i){
                    StaffHire figure = stafflist.get(i);    
                 if   (figure instanceof FullTimeStaffHire) {
                     System.out.println("wrong staff member");
                    }
                
                 else if (figure instanceof PartTimeStaffHire) {
                     stafflist.remove(figure);
                     System.out.println("staff member removed");
                    }
                 
        
       
                }

           
        
            }
        
        
        }
        }













    }
    




