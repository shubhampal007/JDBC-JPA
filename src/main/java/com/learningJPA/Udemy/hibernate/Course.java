package com.learningJPA.Udemy.hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Course {
    @Id //Represent Primary key
    @GeneratedValue //JPA will generate a random id for me
    private Long id;

    private String name;

    public Course() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course(String name){
        this.name=name;
    }
    public Course(Long id,String name){
        this.id=id;
        this.name=name;
    }

}
