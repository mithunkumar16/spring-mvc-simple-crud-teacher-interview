package com.spring.mvc_simple_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mvc_simple_project.dto.Teacher;
import com.spring.mvc_simple_project.service.TeacherService;

@Controller
public class TeacherContrlloer {
	@Autowired
	TeacherService service;

	@RequestMapping("/")
	public String getHome() {
		return "home";
	}

	@RequestMapping("/back")
	public String getHomes() {
		return "home";
	}

	@RequestMapping("/insertTeacher")
	public ModelAndView getTeacherObject() {
		ModelAndView andView = new ModelAndView("insert-teacher");

		andView.addObject("teacher", new Teacher());
		return andView;

	}

	@RequestMapping("/saveTeacher")
	public ModelAndView getTeacherObject(Teacher teacher) {
		ModelAndView andView = new ModelAndView("insert-teacher");
		service.saveTeacher(teacher);
		return andView;

	}

	@RequestMapping("/displayTeacher")
	public ModelAndView displayAllTeacher() {

		List<Teacher> teachers = service.displayAllTeacher();
		ModelAndView andView = new ModelAndView("display");
		andView.addObject("teacherData", teachers);
		return andView;
	}

	@RequestMapping("/deleteTeacher")
	public ModelAndView deleteTeacher(@RequestParam int teacherId) {
		service.deleteTeacherById(teacherId);
		List<Teacher> teachers = service.displayAllTeacher();
		ModelAndView andView = new ModelAndView("display");
		andView.addObject("teacherData", teachers);
		return andView;
	}

	// open update teacher form
	@RequestMapping("/updateTeacher")
	public ModelAndView openUpdateTeacherForm(int teacherId) {
		ModelAndView andView = new ModelAndView("update-teacher");
		andView.addObject("updateteacher", service.getTeacherById(teacherId));
		return andView;
	}

	// update method
	@RequestMapping("/updatesTeacher")
	public ModelAndView updateTeacher(Teacher updateteacher) {
		service.updateTeacher(updateteacher);

		List<Teacher> teachers = service.displayAllTeacher();
		ModelAndView andView = new ModelAndView("display");
		andView.addObject("teacherData", teachers);
		return andView;
	}
}
