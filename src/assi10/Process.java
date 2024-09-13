
package assi10;
import java.util.Scanner;
public class Process {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Update Student by Id");
            System.out.println("3. Delete Student by ID");
            System.out.println("4. Display all student infomation");
            System.out.println("5. Find the highest GPA student");
            System.out.println("6. Exit");
            System.out.print("Choice : ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    Student stu = new Student();
                    stu.addStudent(stu);
                    studentList.addStudent(stu);
                    break;

                case 2:
                    System.out.print("Enter the ID of the student you want to update: ");
                    String updateId = scanner.nextLine();
                    studentList.updateStudent(updateId);
                    break;

                case 3:
                    System.out.print("Enter the ID of the student you want to delete: ");
                    String deleteId = scanner.nextLine();
                    studentList.deleteStudent(deleteId);
                    break;

                case 4:
                    studentList.displayAllStudents();
                    break;

                case 5:
                     Student topStudent = studentList.findHighestGPA();
                    if (topStudent != null) {
                        System.out.println("Student with the highest GPA:");
                        topStudent.displayInfo();
                    } else {
                        System.out.println("No students in the list.");
                    }
                    break;


                case 6:
                    System.out.println("Exiting.");

                    System.exit(0);
                    break;

                
            }
        }
    }
}