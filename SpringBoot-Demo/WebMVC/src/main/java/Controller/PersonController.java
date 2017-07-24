package Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wisely.demo.Person;

@Controller
@SpringBootApplication
public class PersonController {
	
	@RequestMapping("/person")
	public String index(Model model){
		Person person = new Person("aa",11);
		List<Person> people = new ArrayList<>();
		Person person1 = new Person("xx",22);
		Person person2 = new Person("yy",33);
		Person person3 = new Person("zz",44);
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
