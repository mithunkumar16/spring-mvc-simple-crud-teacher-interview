package com.spring.mvc_simple_project.dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.mvc_simple_project.dto.Teacher;

@Component
public class TeacherDao {
	@Autowired
	EntityManagerFactory entityManagerFactory;

	// save teacher method
	public Teacher saveTeacher(Teacher teacher) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		teacher.setBatchTime(LocalDateTime.now());
		entityTransaction.begin();
		entityManager.persist(teacher);
		entityTransaction.commit();
		return null;
	}

	public List<Teacher> displayAllTeacher() {

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String select = "select t from Teacher t";// JPQL query

		return entityManager.createQuery(select, Teacher.class).getResultList();
	}

	public Teacher getTeacherById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		// Teacher teacher=entityManager.find(Teacher.class, id);
		return entityManager.find(Teacher.class, id);
	}

	public void deleteTeacherById(int id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Teacher teacher = entityManager.find(Teacher.class, id);
		entityTransaction.begin();
		entityManager.remove(teacher);
		entityTransaction.commit();

	}
	
	//update Teacher
	public void updateTeacher(Teacher teacher) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		teacher.setBatchTime(LocalDateTime.now());
		entityTransaction.begin();
		entityManager.merge(teacher);
		entityTransaction.commit();
			
	}
}
