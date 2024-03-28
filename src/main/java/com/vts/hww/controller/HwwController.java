package com.vts.hww.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HwwController {

	@GetMapping("/")
	public String applicationLaunch()throws Exception {
		System.out.println("Hiiiii");
		return "static/LaunchPage";
	}
}
