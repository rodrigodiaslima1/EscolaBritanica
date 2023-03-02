package br.com.tvc;

import br.com.tvc.dao.DAOCourse;
import br.com.tvc.dao.IDAOCourse;
import br.com.tvc.domain.Course;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class TestCourse {

	private IDAOCourse daoCourse;
	
	public TestCourse() {
		daoCourse = new DAOCourse();
	}
	
	@Test
	public void register() {
		Course course = new Course();
		course.setCode("A1");
		course.setDescription("Test Course");
		course.setName("Java Back-end Course");
		
		daoCourse.register(course);
		
		assertNotNull(course);
		assertNotNull(course.getId());
	}
	
}
