package com.douzone.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.douzone.hellospring.vo.UserVo;

@Controller
@RequestMapping("/user")
public class UserController {
	
	
	//UserRepository userRepository;
	
	//@ResponseBody
	@RequestMapping(value= {"/join","j"},method=RequestMethod.GET)
	public String join() {

		return "/WEB-INF/views/join.jsp";
	}
	
	@GetMapping(value= {"/join","j"})
	public String join_() {

		return "/WEB-INF/views/join.jsp";
	}
	
//	@ResponseBody
	
	
	@RequestMapping(value="/join",method=RequestMethod.POST)
	public String join(UserVo userVo) {
		
		//userRepository.insert(userVo);
		System.out.println(userVo);
		return "redirect:/";
	}
	
	@ResponseBody
	@RequestMapping(value="/update")
	public String update(@RequestParam("n") String name) { //@RequestParam 원래는 붙어있어야 하지만 이제는 안해도 된다 파라미터와 변수의 이름을 바꾸고 싶을 때는 꼭 써야한다. 
		/**
		 * 만일 n이라는 이름으로 파라미터가 없는 경우 400 bad request 오류 발생 
		 */
		
		System.out.println(name);
		return "UserController:update";
	}
	
	@ResponseBody
	@RequestMapping(value="/update2")
	public String update2(
			@RequestParam(value="n",required=true , defaultValue ="") String name,
			@RequestParam(value="a",required=true , defaultValue ="0") int age ) { //@RequestParam 원래는 붙어있어야 하지만 이제는 안해도 된다 파라미터와 변수의 이름을 바꾸고 싶을 때는 꼭 써야한다. 
		/**
		 * 위의 update
		 */
		
		System.out.println("-----"+name+"--------"+age);
		return "UserController:update2 "+name+"---"+age;
	}
}
