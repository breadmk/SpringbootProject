package kr.co.bread.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import kr.co.bread.config.mk.PrincipalDetailService;

@Configuration 
@EnableWebSecurity 
@EnableGlobalMethodSecurity(prePostEnabled = true)  
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private PrincipalDetailService principalDetailService;
	
	@Bean //IOC 관리 
	public BCryptPasswordEncoder encodePWD() {
		return new BCryptPasswordEncoder();
	}
	
	//시큐리티가 대신 로그인하면서 password를 가로채기를 한다. 다만
	//해당 password가 뭘로 해쉬가 되어 회원가입이 되었는지를 파악해야
	//같은 해쉬로 암호화해서 DB에 있는 해쉬랑 비교할 수 있다.
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(principalDetailService).passwordEncoder(encodePWD());
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.csrf().disable() //csrf 토큰 비활성화 ( 테스트시 걸어두는게 좋음 ) // 토큰을 쎄션에 올려서 도메인에 대한 검증을 실시할수있음  // 요청시에 csrf 토큰이 없으면 막아줌.
			.authorizeRequests()
				.antMatchers("/","/member/**","/static/js/**","/static/css/**","/static/image/**") //여기로 들어오는건
				.permitAll() //모두 다 허용
				.anyRequest() // 그렇지 않은 요청은
				.authenticated() //인증이 되어야 한다. (제한)
			.and()
				.formLogin()	// 로그인이 필요한 페이지는
				.loginPage("/member/login") //이쪽으로 자동으로 연결해준다.
				.loginProcessingUrl("/member/loginOk") //스프링 시큐리티가 해당 주소로 오는 요청을 가로채서 대신 로그인 해준다.
				.usernameParameter("id")
				.passwordParameter("pw")
				.defaultSuccessUrl("/"); //로그인 완료(정상)시 가는 주소 redirect 같은 느낌.
	}
}
