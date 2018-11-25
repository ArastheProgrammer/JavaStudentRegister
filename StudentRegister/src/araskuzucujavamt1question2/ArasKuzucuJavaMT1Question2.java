
package araskuzucujavamt1question2;

import java.util.Scanner;

public class ArasKuzucuJavaMT1Question2 
{

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
       
        String courseNameStorage = null;
        int courseCodeStorage = 0, studentNumberStorage = 0, ct=0;
        
        Courses[] lectures = new Courses[10];
        
        Courses d = new Courses();
        
        Student r1 = new RegularStudents("Aras","Kuzucu",150302033);
        Student r2 = new RegularStudents("Berke","Alta" ,160122343);
        
        Student g1 = new GraduateStudents("Pelin","Akarsu",13434842);
        Student g2 = new GraduateStudents("Kemal","Atar",67676842);
        Student g3 = new GraduateStudents("Doruk","Yıldırım",3433842);
        
        Student s1 = new SpecialStudents("Canan","Sevgi",134898989);
        Student s2 = new SpecialStudents("Yalçın","Ural",16764842);
        Student s3 = new SpecialStudents("Hazal","Abant",18875842);
        
        Student ogrenciler[] = {r1,r2,g1,g2,g3,s1,s2,s3};
        
        System.out.println("    " + "COURSE CREATION MENU" + "    ");
        do 
        {
            System.out.println("Kaç adet ders yaratmak istiyorsunuz lütfen giriniz(Ders sayısı maksimum 10'dur!)");
            ct = input.nextInt();
        } 
        while (ct>10 || ct<0);

            for (int i = 0; i < ct; i++) 
            {
                lectures[i] = new Courses();
                
                System.out.println("Enter "+ (i+1) +". course name: ");
                courseNameStorage = input.next();
                lectures[i].setCourseName(courseNameStorage);
                
                System.out.println("Enter"+ (i+1) +". course code: ");
                courseCodeStorage =input.nextInt();
                lectures[i].setCourseNumber(courseCodeStorage);
                
            }
        
            
        System.out.println("    " + "COURSE SELECTION MENU" + "    ");
        boolean flag1 = true;
        while(flag1)
        {
            System.out.println("Ogrenci Numaranızı giriniz: (Cıkmak icin 000 basınız)");
            studentNumberStorage =input.nextInt();
            System.out.println("Kayıt yaptıracağınız dersin kodunu giriniz: ");
            courseCodeStorage =input.nextInt();
            Student deneme1 = new Student();
            
                for(int i=0; i<ogrenciler.length; i++)
                {   
                    if (ogrenciler[i].getStudent_Id() == studentNumberStorage) 
                    {
                    deneme1  = ogrenciler[i];
                    break;
                    }                        

                }
                
                for(int j =0; j<ct; j++)
                {                
                 if (lectures[j].getCourseNumber() == courseCodeStorage) 
                    {
                     lectures[j].Enroll_Lesson(deneme1);
                    }
                }
            
                deneme1 = null;
                
            if(studentNumberStorage ==000)
            {
                flag1 = false;
            }
        }
        
        System.out.println("    " + "COURSE DISPLAY MENU" + "    ");
        boolean flag2 = true;
        while (flag2)
        {
             System.out.println("Görmek istediğiniz dersin kodunu giriniz. (Cıkmak icin 000 basınız)");
             courseCodeStorage =input.nextInt();
            for (int i = 0; i < ct; i++) 
            {
                if (lectures[i].getCourseNumber() == courseCodeStorage) 
                {
                     lectures[i].PrintStudents();
                }
                else if(courseCodeStorage == 000)                  
                {
                    flag2 = false;
                }
            }
 
        }
        System.out.println("End!");
    }
    
}
