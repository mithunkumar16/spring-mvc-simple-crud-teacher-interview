package com.spring.mvc_simple_project.dto;


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Teacher {
	@Id
	private int teacherId;
	private String teacherName;
	private String teacherEmail;
	
	//not create column in table local date and time
//	@Transient
	private LocalDateTime batchTime;
	
	
	//private Time batchTime;

	public LocalDateTime getBatchTime() {
		return batchTime;
	}

	public void setBatchTime(LocalDateTime batchTime) {
		this.batchTime = batchTime;
	}

	public int getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getTeacherEmail() {
		return teacherEmail;
	}

	public void setTeacherEmail(String teacherEmail) {
		this.teacherEmail = teacherEmail;
	}

	

	
	
	

}
