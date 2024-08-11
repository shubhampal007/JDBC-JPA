package com.learningJPA.Udemy;

import com.learningJPA.Udemy.hibernate.Course;
import com.learningJPA.Udemy.jdbc.entity.Person;
import com.learningJPA.Udemy.hibernate.entity.repository.CourseRepository;
import com.learningJPA.Udemy.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class UdemyApplication implements CommandLineRunner {
	@Autowired
	PersonJdbcDao dao;
	@Autowired
	CourseRepository cr;

	Logger log= LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(UdemyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("All Records->{}",dao.findAll());
		log.info("Records of 1001->{}",dao.findById(1001));
		log.info("Record deleted 1001 ->{}",dao.deleteById(1001));
		log.info("Add Record 2001 ->{}",dao.insertPerson(new Person(2001,"Abdul","Pakistan",new Date(933089400000l))));
		log.info("JPA record Person 1002->{}",cr.findPersonById(1002));
		//insertValuesIntoCourse();
		//log.info("JPA record ->{}",cr.findCourseById(1002));

		//log.info("Record id 1001:{}",cr.findById(1001));
	}

	private void insertValuesIntoCourse() {
		Course c=new Course(1001l,"Shubham v2 Version");
		cr.insertCourse(c);

	}
}


