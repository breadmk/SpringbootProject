package kr.co.bread.config.mk;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import kr.co.bread.dto.MemberDTO;
import kr.co.bread.mapper.MemberMapper;

@Service //Bean등록
public class PrincipalDetailService implements UserDetailsService {
	
	@Autowired
	private MemberMapper memberMapper;
	
    // 스프링이 로그인 요청을 가로챌 때, username,password 변수 2개를 가로채는데, 
	// password 부분 처리는 알아서 함.
	// username 이 DB에 있는지만 확인해주면 된다.
	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
		 MemberDTO pricipal = memberMapper.getId(id);
		 return new PrincipalDetail(pricipal); ///시큐리티의 세션에 유저 정보가 저장이 됨.
	}

}






