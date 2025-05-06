/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PartTimeStaffHire extends StaffHire
{
    // instance variables - replace the example below with your own
    private int workingHour;
    private double wagesPerHour;
    private String shifts;
    private boolean terminated;
    
    

    /**
     * Constructor for objects of class PartTimeStaffHire
     */
    public PartTimeStaffHire(
    int VacancyNumber,
    String StaffName,
    String JobType,
    String Qualification,
    String JoiningDate,
    String Designation,
    String AppointedBy,
    boolean Joined,
    int newWorkingHour,
    double newWagesPerHour,
    String newShifts,
    boolean newTerminated
    )
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
        
        
        newWorkingHour = workingHour;
        newWagesPerHour = wagesPerHour;
        newShifts = shifts;
        newTerminated = terminated;
    }

    public void setShifts(){
        System.out.println("guhahahahah");
    
    }


    public void SetShifts(String shifts){
        this.shifts = shifts; 
    }
    public String GetShifts(){
        
        return shifts;
    
    }

    
    public double GetWagesPerHour(){
    
    
        return wagesPerHour;
    }
    
    public void SetWagesPerHour(double wagesPerHour){
    
        this.wagesPerHour = wagesPerHour;
        
    }
    
    public int GetWorkingHour(){
    
        return workingHour;
    }
    public void SetWorkingHour(int workingHour){
    
        this.workingHour = workingHour;
    }
    public boolean GetTerminated(){
    
    
        return terminated; 
    }
    
    public void display()
    {
         System.out.println("burgers and fries");
         System.out.println("vacancy:"+this.GetVacancyNumber());
         System.out.println("designation:"+this.Getdesignation());
         System.out.println("staff members name:"+this.GetStaffName());
         System.out.println("job type"+this.GetJobType());
         System.out.println("joining date"+this.GetJoiningDate());
         System.out.println("qualification:"+this.GetQualification());
         System.out.println("appointed by:"+this.GetAppointedBy());
         System.out.println("joined state:"+this.GetJoined());
         System.out.println("working hours:"+this.GetWorkingHour());
         System.out.println("hourly wage:"+this.GetWagesPerHour());
         System.out.println("terminated state:"+this.GetTerminated());
         System.out.println("shifts:"+this.GetShifts());
    }

}
