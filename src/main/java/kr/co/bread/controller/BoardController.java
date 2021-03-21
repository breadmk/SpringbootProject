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
		if(dto.getName().contains("1")) {
			String[] name = dto.getName().split(",");
			dto.setName(name[1]);
			academyMapper.insert(dto);
		}else {
			String[] name = dto.getName().split(",");
			dto.setName(name[0]);
			academyMapper.insert(dto);
		}
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
	
	@RequestMapping("/board/update")
	public String update(Model model,HttpServletRequest request) {
		int no = Integer.parseInt(request.getParameter("no"));
		AcademyDTO dto = academyMapper.getOne(no);
		model.addAttribute("dto",dto);
		return "/board/update";
	}
	
	@RequestMapping("/board/updateOk")
	public String update(AcademyDTO dto) {
		int no = dto.getNo();
		String pwd = academyMapper.getPwd(no);
		if(pwd.equals(dto.getPwd())){
			if(dto.getName().contains("1")) {
				String[] name = dto.getName().split(",");
				dto.setName(name[1]);
				academyMapper.update(dto);
			}else {
				String[] name = dto.getName().split(",");
				dto.setName(name[0]);
				academyMapper.update(dto);
			}
		}else {
			return "redirect:/board/update?no="+dto.getNo()+"&chk=1";
		}
		
		return "redirect:/board/content?no="+dto.getNo();
	}
	
	@RequestMapping("/board/delete")
	public String delete(HttpServletRequest request) {
		int no = Integer.parseInt(request.getParameter("no"));
		academyMapper.delete(no);
		return "redirect:/board/list";
	}
}
