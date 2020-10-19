package com.school.project_dev.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//EnableSwagger2的配置类
@Configuration
@EnableSwagger2  //打开swagger功能
public class SwaggerConfig {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.school.project_dev.Controller")) //扫描接口的包
                .paths(PathSelectors.any())
                .build().apiInfo(new ApiInfoBuilder()
                        .title("project的Controller接口")   // swagger文档的标题
                        .build());

    }
}