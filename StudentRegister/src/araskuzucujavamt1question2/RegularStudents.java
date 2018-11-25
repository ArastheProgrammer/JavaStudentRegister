
package araskuzucujavamt1question2;


public class RegularStudents extends Student
{

    public RegularStudents(String name, String surname, int student_Id) 
    {
        super(name, surname, student_Id);
        stdType = "Regular Student";
    }
    
    
    
    
    @Override
    public void Display()
    {
        System.out.println(stdType);
        System.out.println("Student Name is: " + name);
        System.out.println("Student Surname is: " + surname);
        System.out.println("Student Id is: " + student_Id);        
    }
}
