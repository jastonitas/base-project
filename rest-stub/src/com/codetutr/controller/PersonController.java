package com.codetutr.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.codetutr.domain.Person;
import com.codetutr.service.PersonService;

@Controller
@RequestMapping("api")
public class PersonController {
	
	Logger LOG = LoggerFactory.getLogger(PersonController.class);
	
	PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@RequestMapping("person/random")
	@ResponseBody
	public Person randomPerson() {
		LOG.info("invoked ... randomPerson");
		return personService.getRandom();
	}
	
	@RequestMapping("person/{id}")
	@ResponseBody
	public Person getById(@PathVariable Long id) {
		LOG.info("invoked ... getById");
		return personService.getById(id);
	}
	
	/* same as above method, but is mapped to
	 * /api/person?id= rather than /api/person/{id}
	 */
	@RequestMapping(value="person", params="id")
	@ResponseBody
	public Person getByIdFromParam(@RequestParam("id") Long id) {
		LOG.info("invoked ... getByIdFromParam");
		return personService.getById(id);
	}
	
	/**
	 * Saves new person. Spring automatically binds the name
	 * and age parameters in the request to the person argument
	 * @param person
	 * @return String indicating success or failure of save
	 */
	@RequestMapping(value="person", method=RequestMethod.POST)
	@ResponseBody
	public String savePerson(Person person) {
		LOG.info("invoked ... savePerson");
		personService.save(person);
		return "Saved person: " + person.toString();
	}
}
