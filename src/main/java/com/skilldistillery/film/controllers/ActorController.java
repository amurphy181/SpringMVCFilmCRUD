package com.skilldistillery.film.controllers;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.skilldistillery.film.data.DatabaseAccessorObject;
import com.skilldistillery.film.entities.Actor;

@Controller
public class ActorController {
	@Autowired
	private DatabaseAccessorObject db;
	
	@RequestMapping(path = "addActor.do", method = RequestMethod.POST)
	public ModelAndView createState(Actor actor, RedirectAttributes redir) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("redirect:actorAdded.do");
		try {
			db.addActor(actor);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		redir.addFlashAttribute(actor);
		return mv;
	}
	// -------------------

	@RequestMapping(path = "actorAdded.do", method = RequestMethod.GET)
	public ModelAndView showActor(Actor actor) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("actorDetails");
		return mv;
	
	
}
}
