package com.spring.orm.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;

public class StudentDAO {

    private HibernateTemplate hibernateTemplate;

    public StudentDAO() {
        super();
    }

    public StudentDAO(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Transactional
    public int insert(Student student) {
        System.out.println("insert");
        return (Integer) this.hibernateTemplate.save(student);
    }

    @Transactional
    public void delete(Student student) {
        this.hibernateTemplate.delete(student);
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
