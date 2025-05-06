
/**
 * Write a description of class StaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaffHire
{
    // instance variables - replace the example below with your own
    
    protected int VacancyNumber;
    protected String Designation;
    protected String StaffName;
    protected String JobType;
    protected String JoiningDate;
    protected String Qualification;
    protected String AppointedBy;
    protected boolean Joined;


    /**
     * Constructor for objects of class StaffHire
     */
    public StaffHire(
     int newVacancyNumber,
     String newDesignation,
     String newStaffName,
     String newJobType,
     String newJoiningDate,
     String newQualification,
     String newAppointedBy,
     boolean newJoined
    
    )
    {
        
        // initialise instance variables
        VacancyNumber= newVacancyNumber;
        Designation = newDesignation;
        StaffName = newStaffName;
        JobType = newJobType;
        JoiningDate = newJoiningDate;
        Qualification = newQualification;
        AppointedBy = newAppointedBy;
        Joined = newJoined;
    
    }
    
    public void SetJobType(){
        
    }
    public String GetJobType(){
        return JobType;
    }
    public void Setjoined(){
        
    }
    
    public boolean GetJoined(){
        return Joined;
    }
    public void SetJoiningDate(){
        
    }
    public String GetJoiningDate(){
        return JoiningDate;
    }
    public void SetStaffName(String StaffName){
        this.StaffName = StaffName;
    }
    public String GetStaffName(){
    
        return StaffName;
    }
    public void Setdesignation(){
        
    }
    public String Getdesignation(){
        return Designation;
    }
    public void SetVacancyNumber(){
        
    }
    public int GetVacancyNumber(){
        
        return VacancyNumber;
    }
    
    public void SetQualification(){
  
    }
    
    public String GetQualification(){
      return Qualification;
    }
    
    public void SetAppointedBy(){
    
    }
    public String GetAppointedBy(){
        return AppointedBy;
    }
    

    public void display(
     int newVacancyNumber,
     String newDesignation,
     String newStaffName,
     String newJobType,
     String newJoiningDate,
     String newQualification,
     String newAppointedBy,
     boolean newJoined)
    {
         System.out.println(this.GetVacancyNumber());
         System.out.println(this.Getdesignation());
         System.out.println(this.GetStaffName());
         System.out.println(this.GetJobType());
         System.out.println(this.GetJoiningDate());
         System.out.println(this.GetQualification());
         System.out.println(this.GetAppointedBy());
         System.out.println(this.GetJoined());
        }
    
 





























}
