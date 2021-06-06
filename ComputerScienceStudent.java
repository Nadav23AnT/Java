
/**
 * Class ComputerScienceStudent represents an object that include Student class and Person class 
 * methods and variables (full name, id, list of courses and grades, the average grade of the student).
 *
 * @author (Nadav_Chen)
 */
public class ComputerScienceStudent extends Student
{
    private String _programmingLanguage; // Represents what programming language the student uses
    private final String _BASE_LANGUAGE = "Java"; // The default programming language 

    public ComputerScienceStudent(String firstName, String lastName, long id) // Constructor that initialize object's paremeters
    {
        super(firstName, lastName, id); // Calling Constructor of Student
        _programmingLanguage = _BASE_LANGUAGE;
    }

    public ComputerScienceStudent(String firstName, String lastName, long id, String[] courses, 
                                    double[] grades, String programmingLanguage) 
    {  // Constructor that initialize object's paremeters using input parameters
        super(firstName, lastName, id, courses, grades); // Calling the Constructor of father class Student
        _programmingLanguage = programmingLanguage;
    }
    
    public String getProgrammingLanguages()   { // Print the variable content of _programmingLanguage 
        return _programmingLanguage;
    }
    
    public void setProgrammingLanguages(String programmingLanguage)   { // A method that defines the variable _programmingLanguage
        _programmingLanguage = programmingLanguage;
    }
    
    public String toString()  // Prints the contents of the object as a string
    {
        return super.toString() + "\n" + "Programming Language is: " + _programmingLanguage;
    }
}
