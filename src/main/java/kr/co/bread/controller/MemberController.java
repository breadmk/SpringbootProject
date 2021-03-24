package kr.co.bread.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("/member/signup")
	public String singup() {
		
		return "/member/signup";
	}
	
	@RequestMapping("/member/signOk")
	public String signOk() {
		
		return "/member/signOk";
	}
}
