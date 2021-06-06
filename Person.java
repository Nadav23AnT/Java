/**
 * Class Person, providing an object that include full name and id number that represent a person
 * 
 * @author (Nadav_Chen)
 */
public class Person
{
    protected String _firstName; // _firstName - first name of a person
    protected long _id; // id number
    protected String _lastName; // _lastName - last name of a person
    public Person(String firstName, String lastName, long id) // Constructor that initialize object's paremeters
    {
        _firstName = firstName;
        _lastName = lastName;
        _id = id;
    }

    public Person(Person other) // Copy Constructor
    {
        _firstName = other._firstName;
        _lastName = other._lastName;
        _id = other._id;
    }

    public String getFirstName() // A method that prints the variable _firstName
    {
        return _firstName;
    }

    public long getId() // A method that prints the variable _id
    {
        return _id;
    }

    public String getLastName() // A method that prints the variable _lastName
    {
        return _lastName;
    }

    public void setFirstName(String firstName) // A method that defines the variable _firstName
    {
        _firstName = firstName;
    }

    public void setId(long id) // A method that defines the variable _id
    {
        _id = id;
    }

    public void setLastName(String lastName) // A method that defines the variable _lastName
    {
        _lastName = lastName;
    }

    public String toString() // Prints the contents of the object as a string
    {
        return "Last Name: " + _lastName + ", First Name: " + _firstName + ", ID: " + _id;
    }
}