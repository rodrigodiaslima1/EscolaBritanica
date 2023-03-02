package br.com.tvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.tvc.domain.Course;

public class DAOCourse implements IDAOCourse {

	@Override
	public Course register(Course course) {

		// 1- Open connection with the DB
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("myPersistence");
		
		// 2- Execute the manipulation in the DB
		EntityManager entityManager = factory.createEntityManager();
		
		// 3- Open transaction
		entityManager.getTransaction().begin();
		
		// 4- Save transaction
		entityManager.persist(course);
		
		// 5- Commit transaction
		entityManager.getTransaction().commit();
		
		// 6- Close 
		factory.close();
		entityManager.close();
		
		return course;
	}

}
