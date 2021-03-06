package it.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.model.User;
import it.service.TTServiceImpl;



@Controller
public class IndexCtrl {
	
	@Autowired
	private TTServiceImpl ttService;  //Service which will do all data retrieval/manipulation work
	
	@RequestMapping(value = {"/index","/"} , method = RequestMethod.GET)
	public ModelAndView  index(HttpSession session, @RequestParam(value = "pg",   required=false) Long id_partgroup) 
	{
		ModelAndView model = new ModelAndView("index");
		User user = new User();
		user.setName("name "+user.getId());
		user.setPassword("pass "+user.getId());
		
		//ttService.addUser(user);
		
		//System.out.println(""+ttService.getUserList());
		
		return model;
	}
	
	@RequestMapping(value = {"/showMessage"} , method = RequestMethod.GET)
	public ModelAndView  messageUrl(HttpSession session) 
	{
		ModelAndView model = new ModelAndView("index");
		//System.out.println(""+ttService.getUserList());
		
		return model;
	}

	@RequestMapping(value = {"/support"} , method = RequestMethod.GET)
	public ModelAndView  support(HttpSession session) 
	{
		ModelAndView model = new ModelAndView("support");
		//System.out.println(""+ttService.getUserList());
		
		return model;
	}
	


	@RequestMapping(value = {"/contact"} , method = RequestMethod.GET)
	public ModelAndView  contact_us(HttpSession session) 
	{
		ModelAndView model = new ModelAndView("contact");
		
		return model;
	}


	@RequestMapping(value = {"/login.html"} , method = RequestMethod.GET)
	public ModelAndView  login(HttpSession session) 
	{
		ModelAndView model = new ModelAndView("login");
		
		return model;
	}

	@RequestMapping(value = {"/about"} , method = RequestMethod.GET)
	public ModelAndView  shop(HttpSession session) 
	{
		ModelAndView model = new ModelAndView("about");
		
		return model;
	}
}
