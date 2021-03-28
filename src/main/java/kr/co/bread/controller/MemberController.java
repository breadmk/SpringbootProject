package kr.co.bread.controller;

import java.io.PrintWriter;
import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.bread.config.mk.PrincipalDetail;
import kr.co.bread.config.mk.PrincipalDetailService;
import kr.co.bread.dto.MemberDTO;
import kr.co.bread.mapper.MemberMapper;
import kr.co.bread.service.MemberService;


@Controller
public class MemberController {
	
	@Autowired
	MemberMapper memberMapper;
	
	@Autowired
	MemberService memberService;
	
	@Autowired
	PrincipalDetailService service; 
	
	@RequestMapping("/member/signup")
	public String singup() {
		
		return "/member/signUp";
	}
	
	@RequestMapping("/member/signOk")
	public String signOk() {
		
		return "/member/signOk";
	}
	
	@ResponseBody
	@PostMapping("/member/joinOk")
	public void joinOk(@RequestBody MemberDTO dto, PrintWriter out) {
		System.out.println(dto);
		memberService.회원가입(dto);
		out.print("dd");
	}
	
	@RequestMapping("/member/login")
	public String login() {
		
		return "/member/login";
	}
	
}
