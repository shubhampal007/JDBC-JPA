package com.learningJPA.Udemy.jdbc.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity
public class Person {
    @Id
    private int id;
    private String name;
    private String location;
    private Date birth_date;

    public String getLocation() {
        return location;
    }
    public Person() {}
    public Person(int id,String name,String location,Date birth_date)
    {
        this.id=id;
        this.name=name;
        this.location=location;
        this.birth_date=birth_date;
    }



    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", birth_date=" + birth_date +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

}
