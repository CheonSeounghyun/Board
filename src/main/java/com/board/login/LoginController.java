package com.board.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/")
	public String main() {
		return "/main";
	}
	
	@GetMapping("/login")
	public String login() {
		return "/login";
	}
	
	@GetMapping("/error")
	public String error() {
		return "/error";
	}
}
