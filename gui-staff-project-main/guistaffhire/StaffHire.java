
/**
 * the StaffHire class acts as a super class to the two staff subclasses
 * allowing them both to share the attributes/methods of staffhire through inheritance 
 * and for them to be stored together in one list using polymorphism
 * @Abdullah Alnahas
 * @06/5/2025
 */
public class StaffHire
{
    /** 
    * instance variables they are encapsulated which allows their subclasses to access them easily but wont let 
    * other classes access them 
    */
    protected int VacancyNumber;
    protected String Designation;
    protected String StaffName;
    protected String JobType;
    protected String JoiningDate;
    protected String Qualification;
    protected String AppointedBy;
    protected boolean Joined;


    
    // Constructor for objects of class StaffHire
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
    
    //accessor methods stored here 
    public void setJobType(){}
    public String getJobType(){
        return JobType;
    }
    
    public void setjoined(){}
    public boolean getJoined(){
        return Joined;
    }
    
    public void setJoiningDate(){}
    public String getJoiningDate(){
        return JoiningDate;
    }
    
    public void setStaffName(String StaffName){
        this.StaffName = StaffName;
    }
    public String getStaffName(){
        return StaffName;
    }
    
    public void setdesignation(){}
    public String getdesignation(){
        return Designation;
    }
    
    public void setVacancyNumber(){}
    public int getVacancyNumber(){
        return VacancyNumber;
    }
    
    public void setQualification(){}
    public String getQualification(){
      return Qualification;
    }
    
    public void setAppointedBy(){}
    public String getAppointedBy(){
        return AppointedBy;
    }
    

    //this display is overrided elsewhere in the program 
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
         System.out.println(this.getVacancyNumber());
         System.out.println(this.getdesignation());
         System.out.println(this.getStaffName());
         System.out.println(this.getJobType());
         System.out.println(this.getJoiningDate());
         System.out.println(this.getQualification());
         System.out.println(this.getAppointedBy());
         System.out.println(this.getJoined());
        }
    
 





























}
