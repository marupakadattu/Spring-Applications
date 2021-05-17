package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.model.User;

@Controller
public class UserController {
	@RequestMapping("/connectme")
	public String display(Model m) {
		m.addAttribute("user", new User());
		return "form";
	}

	@RequestMapping("/connect")
	public String submitForm(@Valid @ModelAttribute("user") User u, BindingResult br) {
		if (br.hasErrors()) {
			return "form";
		} else {
			return "final";
		}
	}

}
