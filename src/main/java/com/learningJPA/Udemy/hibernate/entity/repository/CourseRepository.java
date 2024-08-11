package com.learningJPA.Udemy.hibernate.entity.repository;

import com.learningJPA.Udemy.hibernate.Course;
import com.learningJPA.Udemy.jdbc.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class CourseRepository {
    @Autowired
   private EntityManager em;

    public Person findPersonById(int id)
    {
        return em.find(Person.class,id);
    }
    public Course findCourseById(int id)
    {
        return em.find(Course.class,id);
    }
    public void insertCourse(Course c)
    {
        em.persist(c);
    }

}
