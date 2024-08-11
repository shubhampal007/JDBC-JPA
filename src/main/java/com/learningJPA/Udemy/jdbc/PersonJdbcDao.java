package com.learningJPA.Udemy.jdbc;

import com.learningJPA.Udemy.jdbc.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDao {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll()
    {
        return jdbcTemplate.query("Select * from person",new BeanPropertyRowMapper<>(Person.class));
    }

    public Person findById(int id)
    {
        return jdbcTemplate.queryForObject("select * from person where id=?",new Object[]{id},new BeanPropertyRowMapper<>(Person.class));
    }
    public int deleteById(int id)
    {
        return jdbcTemplate.update("Delete from person where id=?",new Object[]{id});
    }
    public int insertPerson(Person person)
    {
        return jdbcTemplate.update("insert into person(id,name,location,birth_date) values(?,?,?,?)", person.getId(),person.getName(),person.getLocation(),person.getBirth_date());
    }


}
