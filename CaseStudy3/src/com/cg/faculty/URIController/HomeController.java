package com.cg.faculty.URIController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String getHomePage() {
		return "indexPage";
	}
}
