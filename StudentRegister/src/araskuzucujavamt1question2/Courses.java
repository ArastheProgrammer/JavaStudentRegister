
package araskuzucujavamt1question2;


public class Courses 
{
    
    private String courseName;
    private int courseNumber;
    private Student[] registeredStudents = new Student[30];
   

   
    Courses()
    {
        courseName = " ";
        courseNumber =0;
    }
    public String getCourseName() 
    {
        return courseName;
    }

    public void setCourseName(String courseName) 
    {
        this.courseName = courseName;
    }

    
    public double getCourseNumber() 
    {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) 
    {
        this.courseNumber = courseNumber;
    }

    public Courses(String courseName, int courseNumber)
    {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
        
    }

    private int ct=0;
    public void Enroll_Lesson(Student std)
    {
        if(ct<30)
        {
            if ("Regular Student".equals(std.stdType) && 0<courseNumber && courseNumber<499) 
            {   registeredStudents[ct] = std;
                ct++;
                System.out.println("Basarılı Kayıt!");
            }
            else if("Graduate Student".equals(std.stdType) && 499<courseNumber && courseNumber<599)   
            {
                registeredStudents[ct] = std;
                ct++;
                System.out.println("Basarılı Kayıt!");
            }
            else if ("Special Student".equals(std.stdType) && 699<courseNumber && courseNumber<799) 
            {
                registeredStudents[ct] = std;
                ct++;
                System.out.println("Basarılı Kayıt!");
            }
            else
            {
                System.out.println("Sayın "+std.name+" isimli "+std.stdType+" öğrencimiz "+courseName+" kodlu dersimiz size açık değildir.");
               
                
            }
        }
        else
        {
            System.out.println("Bu dersin kontejyanı dolmuştur.");
            
        }    
    }

    public void PrintStudents()
    {
        
       
        System.out.println("Persons enrolled in " + courseName + ":");
        for(int i=0;i<ct;i++)
        {
            System.out.print(i+1+". ");
            registeredStudents[i].Display();
            System.out.println();
        }
    }

}
