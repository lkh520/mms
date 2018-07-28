/**
 * project : mms-web
 * package : com.mms
 * fileName: Swagger2Config.javaUserService.java
 * createAt:2018年07月21日上午1:44:16
 * createBy:lkh
 */
package com.mms;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @createAt:2018年07月21日上午1:44:16
 * @createBy:lkh
 *
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
	/**
	 * UI页面显示信息
	 */

	private final String SWAGGER2_API_BASEPACKAGE = "com.mms.controller";
	private final String SWAGGER2_API_TITLE = "MMS-API";
	private final String SWAGGER2_API_DESCRIPTION = "用户管理";
	private final String SWAGGER2_API_CONTACT = "lkh520";
	private final String SWAGGER2_API_VERSION = "1.0";

	/**
	 * createRestApi
	 *
	 * @return
	 */

	@Bean
	public Docket createRestApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				.apis(RequestHandlerSelectors.basePackage(SWAGGER2_API_BASEPACKAGE)).paths(PathSelectors.any()).build();
	}

	/**
	 * apiInfo
	 * 
	 * @return
	 */
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title(SWAGGER2_API_TITLE)
				.contact(new Contact(SWAGGER2_API_CONTACT, "", "lkh520@qq.com"))
				.description(SWAGGER2_API_DESCRIPTION)
				.version(SWAGGER2_API_VERSION)
				.build();
	}
}
