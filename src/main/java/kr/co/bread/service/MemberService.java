package kr.co.bread.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import kr.co.bread.dto.MemberDTO;
import kr.co.bread.mapper.MemberMapper;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;

	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public Integer 회원가입(MemberDTO dto) {
		String rawPw = dto.getPw();
		String encPw = encoder.encode(rawPw);
		dto.setPw(encPw);
		dto.setMtype("USER");
		memberMapper.join(dto);
		
		return 1;
		
	}
}
