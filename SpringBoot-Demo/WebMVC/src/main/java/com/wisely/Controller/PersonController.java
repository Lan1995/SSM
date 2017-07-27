 package com.wisely.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisely.demo.PersonTest;

@Controller
@SpringBootApplication
public class PersonController {
	
	@RequestMapping("/person")
	public String index(Model model){
		PersonTest person = new PersonTest("aa",11);
		List<PersonTest> people = new ArrayList<>();
		PersonTest person1 = new PersonTest("xx",22);
		PersonTest person2 = new PersonTest("yy",33);
		PersonTest person3 = new PersonTest("zz",44);
		people.add(person1);
		people.add(person2);
		people.add(person3);
		
		model.addAttribute("person", person);
		model.addAttribute("people", people);
		
		return "index";
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(PersonController.class, args);
	}
	
}
