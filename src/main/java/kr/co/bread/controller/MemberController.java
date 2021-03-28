package kr.co.bread.controller;

import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.co.bread.dto.MemberDTO;
import kr.co.bread.mapper.MemberMapper;


@Controller
public class MemberController {
	
	@Autowired
	MemberMapper memberMapper;

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
		dto.setMtype("USER");
		memberMapper.join(dto);
		out.print("dd");
	}
	
}
