//package com.co.yc.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.validation.MessageCodesResolver;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
//
///**
// * Created by omens on 7/18/15.
// */
//
//@Configuration
//public class WebMvcConfig extends WebMvcConfigurerAdapter {
//
//
//
//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/home").setViewName("pages/home");
//        registry.addViewController("/").setViewName("pages/home");
//        registry.addViewController("/about").setViewName("pages/about");
//        registry.addViewController("/contact").setViewName("pages/contact");
//        registry.addViewController("/login").setViewName("pages/login");
//        //registry.addViewController("/users/list").setViewName("users/list");
//    }
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        super.addResourceHandlers(registry);
//
//    }
//
//    @Override
//    public MessageCodesResolver getMessageCodesResolver() {
//        return super.getMessageCodesResolver();
//    }
//
//
////    @Bean
////    public TemplateResolver templateResolver(){
////        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
////        templateResolver.setTemplateMode("HTML5");
////        //templateResolver.setPrefix("classpath:/templates/");
////        templateResolver.setSuffix(".html");
////        //templateResolver.setCacheTTLMs(3600000L);
////        return templateResolver;
////    }
////
////    @Bean
////    public SpringTemplateEngine springTemplateEngine(){
////        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
////        templateEngine.setTemplateResolver(templateResolver());
////        return templateEngine;
////    }
////
////    @Bean
////    public ViewResolver viewResolver(){
////        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
////        viewResolver.setOrder(1);
////        viewResolver.setTemplateEngine(springTemplateEngine());
////        return viewResolver;
////    }
//
//}
