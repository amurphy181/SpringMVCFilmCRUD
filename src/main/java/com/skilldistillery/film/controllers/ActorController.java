package com.skilldistillery.film.controllers;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.film.data.DatabaseAccessorObject;
import com.skilldistillery.film.entities.Actor;

@Controller
public class ActorController {
	@Autowired
	private DatabaseAccessorObject db;
	
	@RequestMapping(path="searchActor.do", method=RequestMethod.GET) //need to create this path
	public ModelAndView actorDetails() {
		Actor a = new Actor();
		ModelAndView mv = new ModelAndView("WEB-INF/searchActor.jsp", "actor", a);
		return mv;
	}
	
	@RequestMapping(path="searchActor.do", method=RequestMethod.POST)
	public ModelAndView doActorDetails(Actor actor) {
		ModelAndView mv = new ModelAndView();
		int actorId = actor.getId();
		
		Actor actorDetails = null;
		try {
			actorDetails = db.getActorById(actorId);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		mv.addObject("actor", actorDetails);
		mv.setViewName("WEB-INF/actorDetails.jsp"); //need to create this jsp
		return mv;
	}
	
	
}
