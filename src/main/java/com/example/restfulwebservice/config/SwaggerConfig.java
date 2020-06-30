package com.example.restfulwebservice.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration //설정에 관환내용
@EnableSwagger2
public class SwaggerConfig {
		private static final Contact DEFAULT_CONTACT = new Contact("siku", "http://www.joneconsulting.co.kr", "jwhs0310@naver.com");
	
		private static final ApiInfo DEFAULT_API_INFO = new ApiInfo("ASESONME API Title", "My User Management REST API service",
																	"1.0", "urn:tos", DEFAULT_CONTACT, "Apache 2.0",
																	"http://www.apache.org/license/LICENSE-2.0", new ArrayList<>());
	
		
		//producer consumer가 어떤 형태로 데이터를 사용할 수 있는지 문서타입으로 지정
		private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<>(
				//asList() ther? 형을 리스트 형식으로
				Arrays.asList("application/json", "application/xml"));
		
		
		@Bean   //docket 반환값 형태의 가지고 있는 문서를 도큐멘트화 시킴
		public Docket api() {
			return new Docket(DocumentationType.SWAGGER_2)
					.apiInfo(DEFAULT_API_INFO)
					.produces(DEFAULT_PRODUCES_AND_CONSUMES)
					.consumes(DEFAULT_PRODUCES_AND_CONSUMES);
					
			
		}
	
}
