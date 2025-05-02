
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
    double NewSalary,
    int NewWeeklyFractionalHours
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
        
        NewSalary = salary;
        NewWeeklyFractionalHours =WeeklyFractionalHours;
    }
    public void setShifts(){
        System.out.println("guhasshahahah");
    
    }
}