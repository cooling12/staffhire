
/**
 * Write a description of class StaffHire here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StaffHire
{
    // instance variables - replace the example below with your own
    private int vacancyNumber;
    private String designation;
    private String staffname;
    private String jobtype;
    private String joiningdate;
    private String qualification;
    private String appointedBy;
    private boolean joined;

    /**
     * Constructor for objects of class StaffHire
     */
    public StaffHire(
     int newvacancyNumber,
     String newdesignation,
     String newstaffname,
     String newjobtype,
     String newjoiningdate,
     String newQualification,
     String newappointedBy,
     boolean newjoined
    
    )
    {
        
        // initialise instance variables
        vacancyNumber= newvacancyNumber;
        designation = newdesignation;
        staffname = newstaffname;
        jobtype = newjobtype;
        joiningdate = newjoiningdate;
        qualification = newQualification;
        appointedBy = newappointedBy;
        joined = newjoined;
    
    }
    public void SetVacancyNumber(){
        
    }
    public int GetVacancyNumber(){
        
        return vacancyNumber;
    }
    
    public void SetQualification(){
  
    }
    
    public String GetQualification(){
      return qualification;
    }
    
    public void SetAppointedBy(){
    
    }
    public String GetAppointedBy(){
        return appointedBy;
    }
























}
