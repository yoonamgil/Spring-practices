package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/guestbook")
public class GuestbookController {
	
	
	
	
	@ResponseBody
	@RequestMapping("/list")
	public String list() {
		
		return "GuestBookController:list";
		
	}
	

	@ResponseBody
	@RequestMapping("/delete")
	public String delete() {
		
		return "GuestBookController:delete";
		
	}
	
}
