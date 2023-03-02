package br.com.tvc.domain;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "tb_enrollment")
public class Enrollment {
	
	@Id
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE, 
			generator = "enrollmentId")
	@SequenceGenerator(name = "enrollmentId", sequenceName = "sq_enrollment",
	initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "columnCode", length = 10, nullable = false, unique = true)
	private String code;
	
	@Column(name = "columnDate")
	private Instant enrollmentDate;
	
	@Column(name = "columnFee")
	private Double fee;
	
	@Column(name = "columnStatus")
	private String status;

	
	// GETTERS AND SETTERS
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

	public Instant getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(Instant enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}

	public Double getFee() {
		return fee;
	}

	public void setFee(Double fee) {
		this.fee = fee;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
	
}
