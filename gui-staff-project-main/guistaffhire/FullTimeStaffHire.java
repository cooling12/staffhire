/**
 * this is the class for the fullTime staff object it allows for the wider program 
 * to create part time staff objects and manipulate their attributes 
 * @Abdullah Alnahas
 * @06/5/2025
 */
public class FullTimeStaffHire extends StaffHire
{
    // instance variables - replace the example below with your own
    private int weeklyFractionalHours;
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
    
        //inherits the
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
        NewWeeklyFractionalHours =weeklyFractionalHours;
    }
    
    //accessor methods 
    public double getSalary(){
        return salary;
    }    
    public void setSalary(double salary){
        this.salary = salary;
        System.out.println("set");
    }
    
    public int getWeeklyFractionalHours( ){
        return weeklyFractionalHours;
    }
    public void setWeeklyFractionalHours(int weeklyFractionalHours){
        this.weeklyFractionalHours =weeklyFractionalHours ;
    }
    
    //override
    public void display()
    {
         System.out.println("FullTime staff vacancy:"+this.getVacancyNumber());
         System.out.println("designation:"+this.getdesignation());
         System.out.println("staff members name:"+this.getStaffName());
         System.out.println("job type"+this.getJobType());
         System.out.println("joining date"+this.getJoiningDate());
         System.out.println("qualification:"+this.getQualification());
         System.out.println("appointed by:"+this.getAppointedBy());
         System.out.println("joined state:"+this.getJoined());
         System.out.println("weekly fractional hours:"+this.getWeeklyFractionalHours());
         System.out.println("salary:"+this.getSalary());
    }
}