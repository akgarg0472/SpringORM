package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

public class StudentDAO {

    private HibernateTemplate hibernateTemplate;

    public StudentDAO() {
        super();
    }

    public StudentDAO(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    // insertion operation
    @Transactional
    public int insert(Student student) {
        System.out.println("insert");
        return (Integer) this.hibernateTemplate.save(student);
    }

    // select operation
    @Transactional
    public Student getStudent(int studentId) {
        return this.hibernateTemplate.get(Student.class, studentId);
    }

    @Transactional
    public List<Student> getAllStudents() {
        return this.hibernateTemplate.loadAll(Student.class);
    }

    // delete operation
    @Transactional
    public void delete(Student student) {
        this.hibernateTemplate.delete(student);
    }

    // update operation
    @Transactional
    public void update(Student student) {
        this.hibernateTemplate.update(student);
    }

    @Transactional
    public void update(int studentId, String oldStudentName, String oldStudentAddress) {
        Student student = new Student(studentId, oldStudentName, oldStudentAddress);
        update(student);
    }

    // setter method
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
