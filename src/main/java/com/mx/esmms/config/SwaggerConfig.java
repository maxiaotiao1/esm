package com.mx.esmms.config;


import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableKnife4j
@Import(BeanValidatorPluginsConfiguration.class)
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean(value = "defaultApi2")
    public Docket defaultApi2() {
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //分组名称
                .groupName("2.X版本")
                .select()
                //这里指定Controller扫描包路径
                .apis(RequestHandlerSelectors.basePackage("com.mx.esmms"))
                .paths(PathSelectors.any())
                .build();
        return docket;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("接口测试")
                .contact(new Contact("马骁", "www.mx.com", "2864552619@qq.com"))
                .description("esmms测试接口")
                .termsOfServiceUrl("http://localhost:8090/")
                .version("1.0")
                .build();
    }

//    @Bean
//    public Docket webApiConfig() {
//
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("webApi")
//                .apiInfo(webApiInfo())
//                .select()
//                .paths(Predicates.not(PathSelectors.regex("/admin/.*")))
//                .paths(Predicates.not(PathSelectors.regex("/error.*")))
//                .build();
//
//    }
//
//    private ApiInfo webApiInfo() {
//
//        return new ApiInfoBuilder()
//                .title("API文档")
//                .description("微服务接口定义")
//                .version("1.0")
//                .contact(new Contact("MaXiao", "http://kongbenfitness.com", "maxiao_1996@163.com"))
//                .build();
//    }
}