package com.skilldistillery.film.controllers;

import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.film.data.DatabaseAccessorObject;
import com.skilldistillery.film.entities.Film;

public class FilmController {
	@Autowired
	private DatabaseAccessorObject db;
	
	@RequestMapping(path="filmDetails.do", method=RequestMethod.GET)
	public ModelAndView filmDetails() {
		Film f = new Film();
		ModelAndView mv = new ModelAndView("WEB-INF/filmDetails.jsp", "film", f);
		return mv;
	}
	
	@RequestMapping(path="filmDetails.do", method=RequestMethod.POST)
	public ModelAndView doFilmDetails(Film film) {
		ModelAndView mv = new ModelAndView();
		int filmId = film.getId();
		
		Film filmDetails = null;
		try {
			filmDetails = db.getAllFilmDetails(filmId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		mv.addObject("film", filmDetails);
		mv.setViewName("WEB-INF/filmDetails.jsp");
		return mv;
	}
	
	
}
