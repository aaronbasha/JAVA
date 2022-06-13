package com.aaron.daikichi;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class HomeController {

	@RequestMapping("/")
	public String index() {
		return "Welcome";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{city}")
	public String showCity(@PathVariable ("city") String city) {
		return "Congratulations! You will soon travel to " + city + "!";
	}
	
	@RequestMapping("/lotto/{number}")
	public String showLotto(@PathVariable ("number") int number) {
		if (number % 2 == 0) {
		return "You will take a grand journey in the near future, but be wary of tempting offers.";	
	}
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.";
		
	}

}

//@RequestMapping("/m/{track}/{module}/{lesson}")
//    public String showLesson(@PathVariable("track") String track, 
//@PathVariable("module") String module, @PathVariable("lesson") String lesson){
//    	return "Track: " + track + ", Module: " + module + ", Lesson: " + lesson;
//    }





