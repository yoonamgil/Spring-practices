package com.douzone.guestbook.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.douzone.guestbook.Vo.GuestBookVo;
import com.douzone.guestbook.repository.GuestBookRepository;



@Controller
public class GuestbookController {

	@Autowired
	private GuestBookRepository guestBookRepository;
	
	@RequestMapping("")
	public String index(Model model) {
		List<GuestBookVo> list =guestBookRepository.findAll();
		model.addAttribute("list",list);
		
		return "index";
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public String add(GuestBookVo vo) {
		
		guestBookRepository.insert(vo);
		return "redirect:/";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String delete( Long no) {
		
	
		return "delete";
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public String delete(GuestBookVo vo) {
		
		guestBookRepository.delete(vo);
		return "redirect:/";
	}
}
