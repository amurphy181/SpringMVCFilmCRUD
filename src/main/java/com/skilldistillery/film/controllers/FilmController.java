package com.skilldistillery.film.controllers;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.film.data.DatabaseAccessorObject;
import com.skilldistillery.film.entities.Film;

@Controller
public class FilmController {

	@Autowired
	private DatabaseAccessorObject db;

	@RequestMapping(path = "searchFilm.do", method = RequestMethod.POST)
	public ModelAndView searchFilmId(int id) {
		ModelAndView mv = new ModelAndView();

		Film filmDetails = null;
		try {
			filmDetails = db.getFilmById(id);

		} catch (SQLException e) {
			e.printStackTrace();
		}

		mv.addObject("film", filmDetails);
		mv.setViewName("WEB-INF/filmDetails.jsp");
		return mv;
	}

	@RequestMapping(path = "addFilm.do", method = RequestMethod.GET)
	public ModelAndView addFilmToDatabase(Film film) {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("WEB-INF/addFilm.jsp");
		return mv;
	}

	@RequestMapping(path = "addFilm.do", method = RequestMethod.POST)
	public String addFilm(Film film) {
//		ModelAndView mv = new ModelAndView();


		db.addFilm(film);
//		mv.addObject("film", film);
//		mv.setViewName("WEB-INF/filmDetails.jsp");
		return "WEB-INF/filmDetails.jsp";
	}

	// @RequestMapping(path = "editFilm.do", method = RequestMethod.GET)
	// public ModelAndView editFilm(@RequestParam(name = "filmId"))
}
