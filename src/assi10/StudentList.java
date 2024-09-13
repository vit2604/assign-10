package assi10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {

    private List<Student> studentList;

    public StudentList() {
        this.studentList = new ArrayList<>();
    }
    public void addStudent(Student stu) {
        studentList.add(stu);
    }
    public void updateStudent(String id) {
        for (Student stu : studentList) {
            if (stu.getId().equals(id)) {
                stu.addStudent(stu);
                System.out.println("Cap nhat thanh cong cho sinh vien co ID: " + id);
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien co ID: " + id);
    }

    public void deleteStudent(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                studentList.remove(i);
                System.out.println("Da xoa sinh vien co ID: " + id);
                return;
            }
        }
        System.out.println("Khong tim thay sinh vien co ID: " + id);
    }

    public void displayAllStudents() {
        
        for (Student stu : studentList) {
            stu.displayInfo();
        
    }}

    public Student findHighestGPA() {
        Student topStudent = studentList.get(0);
        for (Student student : studentList) {
            if (student.getGPA() > topStudent.getGPA()) {
                topStudent = student;
            }
        }
        return topStudent;
    }
}
