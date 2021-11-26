package com.example.web.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;

@Configuration
public class ThymeleafTemplateEngineConfig {
    private final ClassLoaderTemplateResolver templateResolver;

    @Autowired
    public ThymeleafTemplateEngineConfig(ClassLoaderTemplateResolver templateResolver) {
        this.templateResolver = templateResolver;
    }

    @Bean
    @Description("Thymeleaf template engine with Spring integration")
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        return templateEngine;
    }

}
