package com.cloudhubs.trainticket.adminservice.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author fdse
 */
@Configuration
//@EnableSwagger2
public class SwaggerConfig {

    //@Value("${swagger.controllerPackage}")
    private String controllerPackagePath = "edu.fudanselab.trainticket.controller";

    private static final Logger LOGGER = LoggerFactory.getLogger(SwaggerConfig.class);

    @Bean
    public Docket createRestApi() {
        SwaggerConfig.LOGGER.info("[createRestApi][create][controllerPackagePath: {}]", controllerPackagePath);
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage(controllerPackagePath))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Springboot builds the API documentation with swagger")
                .description("Simple and elegant restful style")
                .termsOfServiceUrl("https://github.com/FudanSELab/train-ticket")
                .version("1.0")
                .build();
    }

}
