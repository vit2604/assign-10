
package assi10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Student extends Person{
    private float GPA;
    private String major;
    public Student()
    {
        
    }
    public Student( Float GPA , String major)
    {
        this.GPA=GPA;
        this.major=major;
    }
    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    
    public void addStudent(Student stu){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("===Enter information Student===");
        System.out.print("Enter Id:");
        String idsv = keyboard.nextLine();
        stu.setId(idsv);
        System.out.print("Enter full Name : ");
        String name=keyboard.nextLine();
        stu.setFullName(name);
        System.out.print("Enter date of birth (dd/MM/yyyy)");
        String dateOfBithString = keyboard.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = sdf.parse(dateOfBithString);
            setDateOfbirth(dateOfBirth);
        } catch (ParseException e) {
            System.out.println("Định dạng ngày tháng không hợp lệ.");
        }
        System.out.print("Enter GPA:");
        float gpa = keyboard.nextFloat();
        setGPA(gpa);
        keyboard.nextLine();
        System.out.print("Enter major: 4");
        String majo = keyboard.nextLine();
        setMajor(majo);     
    }

    @Override
    public void displayInfo() {
         SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println( "Student{" + "id:" + getId() + ", fullName: " + getFullName() + ", GPA : " + getGPA() + ", major : " + getMajor() + ", dateofBirth: " + sdf.format(getDateOfbirth())+"}");
    }
    public static void main(String[] args) {
        Student s2 = new Student();
        s2.addStudent(s2);
        s2.displayInfo();
    }
    
}
