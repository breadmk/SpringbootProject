package kr.co.bread.sitemesh;

import org.sitemesh.builder.SiteMeshFilterBuilder;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

public class Config extends ConfigurableSiteMeshFilter{
	
	@Override
	protected void applyCustomConfiguration(SiteMeshFilterBuilder builder) {
		
		builder.addDecoratorPath("/*", "/WEB-INF/MainLayOut/layout.jsp");
	}


}
