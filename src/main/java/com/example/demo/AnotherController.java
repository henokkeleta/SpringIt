package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@ Controller
public class AnotherController {
	@RequestMapping("/")
	public String index(Model model) {
	model.addAttribute("message", "HELLO!");
	return "Hello";
	}
}
