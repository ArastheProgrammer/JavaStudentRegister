
package araskuzucujavamt1question2;


public class GraduateStudents extends Student
{

   
    public GraduateStudents(String name, String surname, int student_Id) 
    {
        super(name, surname, student_Id);
        stdType = "Graduate Student";
    }
    
    @Override
    public void Display()
    {
        System.out.println(stdType);
        System.out.println("Studen Name is: " + name);
        System.out.println("Studen Surname is: " + surname);
        System.out.println("Studen Student Id is: " + student_Id);        
    }
}
