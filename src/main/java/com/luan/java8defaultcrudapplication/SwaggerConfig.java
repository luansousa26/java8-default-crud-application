package com.luan.java8defaultcrudapplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
public class SwaggerConfig {
	@Bean
		public Docket detalheApi() {
	 
			Docket docket = new Docket(DocumentationType.SWAGGER_2);
	 
			docket
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.luan"))
			.paths(PathSelectors.any())
			.build()
			.apiInfo(this.informacoesApi().build());
	 
			return docket;
		}
	 
		private ApiInfoBuilder informacoesApi() {
	 
			ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();
	 
			apiInfoBuilder.title("Api-Crud");
			apiInfoBuilder.description("Default Crud API for Study proposes.");
			apiInfoBuilder.version("1.0");
			apiInfoBuilder.termsOfServiceUrl("Free use.");
			apiInfoBuilder.license("License - Open Source");
			apiInfoBuilder.licenseUrl("https://github.com/luansousa26");
	 
			return apiInfoBuilder;
	 
		}
	}

