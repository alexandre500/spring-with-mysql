package com.techunting.techuntingspringmysqldb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techunting.techuntingspringmysqldb.model.ContactsModel;
import com.techunting.techuntingspringmysqldb.repository.ContactsRepository;

@RestController
@RequestMapping("/api")
public class ContactsController {
	
	@Autowired
	private ContactsRepository contactsRepository;
	
	@PostMapping("/listcontacts")
	public List<ContactsModel> getAllContacts() {
		return contactsRepository.findAll();
	}
}
