package com.spring.mvc_simple_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.mvc_simple_project.dao.TeacherDao;
import com.spring.mvc_simple_project.dto.Teacher;
@Controller
public class TeacherService {
	
	@Autowired
	TeacherDao dao;
	
	//save teacher method
		public Teacher saveTeacher(Teacher teacher) {
			return dao.saveTeacher(teacher);
		}
		
		public List<Teacher> displayAllTeacher() {	
			return dao.displayAllTeacher();
		}
		public Teacher getTeacherById(int id) {
			return dao.getTeacherById(id);
		}
		public void deleteTeacherById(int id) {
			dao.deleteTeacherById(id);
		}
		//update Teacher
		public void updateTeacher(Teacher teacher) {
			dao.updateTeacher(teacher);
		}

		

}
