package kr.co.bread.config.mk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import ch.qos.logback.core.net.SyslogOutputStream;
import kr.co.bread.dto.MemberDTO;

public class PrincipalDetail implements UserDetails{

	private MemberDTO member;
	private String id = "ddd";
	
	public PrincipalDetail(MemberDTO member) {
		this.member=member;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getPassword() {
		return member.getPw();
	}

	@Override
	public String getUsername() {
		return member.getId();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		Collection<GrantedAuthority> collertors = new ArrayList<>();
		collertors.add(()->{return "MTYPE_"+member.getMtype();});
		return collertors;
	}
	
	
}
