package com.satishit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.satishit.entity.Contact;

@Controller
public class ContactController {

	@GetMapping("/loadform")
	public String loadForm(Model model) {

		Contact cobj = new Contact();
		model.addAttribute("contact", cobj);
		return "contact";
	}

}
