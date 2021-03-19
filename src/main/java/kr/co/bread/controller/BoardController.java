package kr.co.bread.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.bread.dto.AcademyDTO;
import kr.co.bread.mapper.AcademyMapper;

@Controller
public class BoardController {
	
	@Autowired
	AcademyMapper academyMapper;

	//목록
	@RequestMapping("/board/list")
	public String list(Model model) {
		List<AcademyDTO> list = academyMapper.getAll();
		System.out.println(list);
		model.addAttribute("list",list);
		return "/board/list";
	}
	
	//등록 폼
	@RequestMapping("/board/insert")
	public String insert() {
		return "/board/insert";
	}
	
	//등록 ok
	@RequestMapping("/board/insertOk")
	public String insertOk(AcademyDTO dto) {
		academyMapper.insert(dto);
		return "redirect:/board/list";
	}
	
	//세부 내용
	@RequestMapping("/board/content")
	public String Content(HttpServletRequest request,Model model) {
		int no = Integer.parseInt(request.getParameter("no"));
		AcademyDTO dto = academyMapper.getOne(no);
		model.addAttribute("dto",dto);
		return "/board/content";
	}
}
