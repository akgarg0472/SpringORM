package com.spring.orm;

import com.spring.orm.dao.Student;
import com.spring.orm.dao.StudentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        StudentDAO dao = context.getBean("studentDAO", StudentDAO.class);
        dao.insert(new Student());
    }
}
