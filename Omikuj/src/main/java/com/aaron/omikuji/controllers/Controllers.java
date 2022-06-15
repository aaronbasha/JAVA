package com.aaron.omikuji.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllers {
	
	@RequestMapping ("/") 
		public String index() {
		return "index.jsp";
	}
	
	@RequestMapping ("/show")
		public String show(HttpSession session, Model model) {
		
		model.addAttribute("numnber", session.getAttribute("number"));
		model.addAttribute("city", session.getAttribute("city"));
		model.addAttribute("name", session.getAttribute("name"));
		model.addAttribute("endeavor", session.getAttribute("endeavor"));
		model.addAttribute("livingthing", session.getAttribute("livingthing"));
		model.addAttribute("somethingnice", session.getAttribute("somethingnice"));
		
		return "results.jsp";
		
	}
	
	@PostMapping("/submit")
    public String submitData(
            @RequestParam(value="number") String number,
            @RequestParam(value="city") String city,
            @RequestParam(value="name") String name,
            @RequestParam(value="endeavor") String endeavor,
            @RequestParam(value="livingthing") String livingthing,
            @RequestParam(value="somethingnice") String somethingnice,
            HttpSession session
            ) {
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("name", name);
        session.setAttribute("endeavor", endeavor);
        session.setAttribute("livingthing",livingthing);
        session.setAttribute("somethingnice", somethingnice);

            return "redirect:/show";

    }
	
	
}
