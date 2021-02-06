package com.spring.orm;

import com.spring.orm.dao.Student;
import com.spring.orm.dao.StudentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        StudentDAO dao = context.getBean("studentDAO", StudentDAO.class);

        dao.insert(new Student(2, "Akhilesh Garg", "India"));

        List<Student> studentList = dao.getAllStudents();
        System.out.println("Before deletion");
        for (Student s : studentList) {
            System.out.println(s);
        }

//        Student student = dao.getStudent(1);
//        dao.delete(student);

//        System.out.println("After deletion");
//        studentList = dao.getAllStudents();
//        for (Student s : studentList) {
//            System.out.println(s);
//        }
        dao.update(new Student(1, "Akhilesh K Garg", "Haryana, India"));
        System.out.println(dao.getAllStudents());
    }
}
