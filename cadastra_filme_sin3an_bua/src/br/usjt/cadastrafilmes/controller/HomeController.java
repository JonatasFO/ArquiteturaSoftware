package br.usjt.cadastrafilmes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/hello")
	public String execute() {
		System.out.println("chamou o controller hello");
		return "hello";
	}
}