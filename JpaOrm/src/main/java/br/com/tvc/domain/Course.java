package br.com.tvc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_course")
public class Course {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE, 
			generator = "courseId")
	@SequenceGenerator(
			name = "courseId", sequenceName = "sq_course", 
			initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "columnCode", length = 10, nullable = false, unique = true)
	private String code;
	
	@Column(name = "columnName", length = 50, nullable = false)
	private String name;
	
	@Column(name = "columnDescription", length = 140, nullable = false)
	private String description;
	
	
	// GETTER AND SETTERS
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

	
}
