
package araskuzucujavamt1question2;


public class Student 
{
    protected String name;
    protected String surname;
    protected int student_Id;
    protected String stdType;

    public int getStudent_Id() {
        return student_Id;
    }

    public void setStudent_Id(int student_Id) {
        this.student_Id = student_Id;
    }
    
    Student()
    {
        stdType ="Student";
    }
    public Student(String name, String surname, int student_Id) {
        this.name = name;
        this.surname = surname;
        this.student_Id = student_Id;
    }
    
    
    
    public void Display()
    {
        System.out.println("Student Name is: " + name);
        System.out.println("Student Surname is: " + surname);
        System.out.println("Student Id is: " + student_Id);        
    }
    
}
