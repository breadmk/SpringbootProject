package kr.co.bread;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.bread.sitemesh.Config;

@Configuration
public class BreadFilterConfig {
	
	@Bean
	public FilterRegistrationBean siteMeshFilter() {
		FilterRegistrationBean filter = new FilterRegistrationBean();
		filter.setFilter(new Config()); //2번에서 만든 클래스 이름으로 사용
		return filter;
	}
}
