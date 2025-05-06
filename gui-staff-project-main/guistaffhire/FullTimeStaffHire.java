/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FullTimeStaffHire extends StaffHire
{
    // instance variables - replace the example below with your own
    private int WeeklyFractionalHours;
    private double salary;

    /**
     * Constructor for objects of class FullTimeStaffHire
     */
    public FullTimeStaffHire(
    int VacancyNumber,
    String StaffName,
    String JobType,
    String Qualification,
    String JoiningDate,
    String Designation,
    String AppointedBy,
    boolean Joined,
    int NewWeeklyFractionalHours,
    double NewSalary)
    {
    
        // initialise instance variables
        super(
        VacancyNumber,
        Designation,
         StaffName,
         JobType,
         JoiningDate,
         Qualification,
        AppointedBy,
        Joined);
        
        NewSalary = salary;
        NewWeeklyFractionalHours =WeeklyFractionalHours;


    }
    public void setShifts(){
        System.out.println("guhasshahahah");
    

    }   
    public double GetSalary(){
    
        return salary;
    }
    
    
    public void SetSalary(double salary){
    
        this.salary = salary;
        System.out.println("set");
    
    }
    
    public int GetWeeklyFractionalHours(){
        
        return WeeklyFractionalHours;
    
    }
    
    public void SetWeeklyFractionalHours(int WeeklyFractionalHours){
        
        this.WeeklyFractionalHours = WeeklyFractionalHours;
    
    }
    
    public void display()
    {
         System.out.println("burgers and fries");
         System.out.println(this.GetVacancyNumber());
         System.out.println(this.Getdesignation());
         System.out.println(this.GetStaffName());
         System.out.println(this.GetJobType());
         System.out.println(this.GetJoiningDate());
         System.out.println(this.GetQualification());
         System.out.println(this.GetAppointedBy());
         System.out.println(this.GetJoined());
         System.out.println(this.GetWeeklyFractionalHours());
         System.out.println(this.GetSalary());

    }
}