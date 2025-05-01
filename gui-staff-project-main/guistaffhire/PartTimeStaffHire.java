
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
    String Designation,
    String StaffName,
    String JobType,
    String JoiningDate,
    String Qualification,
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

}
