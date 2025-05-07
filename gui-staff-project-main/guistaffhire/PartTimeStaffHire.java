/**
 * this is the class for the part time staff object it allows for the wider program 
 * to create part time staff objects and manipulate their attributes 
 * @Abdullah Alnhahas
 * @05/5/2025
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
        
        // inherits the initalised paramaters from Staffhire
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

    //accessor methods
    public void setShifts(String shifts){
        this.shifts = shifts; 
    }
    public String getShifts(){
        return shifts;
    }

    public double getWagesPerHour(){
        return wagesPerHour;
    }
    public void setWagesPerHour(double wagesPerHour){
        this.wagesPerHour = wagesPerHour;
    }
    
    public int getWorkingHour(){
        return workingHour;
    }
    public void setWorkingHour(int workingHour){
        this.workingHour = workingHour;
    }
    
    public boolean getTerminated(){    
        return terminated; 
    }
    public void setTerminated(boolean terminated){
        this.terminated = terminated;
    }
    
    //override
    public void display()
    {
        //gets the data to be displayed and prints it with an appropiate message  
        System.out.println(" PartTime staff vacancy:"+this.getVacancyNumber());
         System.out.println("designation:"+this.getdesignation());
         System.out.println("staff members name:"+this.getStaffName());
         System.out.println("job type"+this.getJobType());
         System.out.println("joining date: "+this.getJoiningDate());
         System.out.println("qualification:"+this.getQualification());
         System.out.println("appointed by:"+this.getAppointedBy());
         System.out.println("joined state:"+this.getJoined());
         System.out.println("working hours:"+this.getWorkingHour());
         System.out.println("hourly wage:"+this.getWagesPerHour());
         System.out.println("terminated state:"+this.getTerminated());
         System.out.println("shifts:"+this.getShifts());
    }
}
