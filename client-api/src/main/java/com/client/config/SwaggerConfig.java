package com.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;

import com.client.ClientApiApplication;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage(ClientApiApplication.class.getPackage().getName())).build().apiInfo(apiInfo())
                .useDefaultResponseMessages(false).genericModelSubstitutes(ResponseEntity.class)
                .tags(new Tag("Client", "Client Management"));
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Client Management").build();
    }

}
