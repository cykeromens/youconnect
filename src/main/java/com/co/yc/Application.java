package com.co.yc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * Created by Cyprian on 24/01/2016.
 */
@SpringBootApplication
//public class Application implements WebApplicationInitializer {
//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//
//    }
public class Application extends SpringBootServletInitializer {

    //    public static void main(String[] args) {
//        SpringApplication.run(applicationClass, args);
//    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

    private static Class<Application> applicationClass = Application.class;


    public static void main(String args[]) {
        ApplicationContext context = SpringApplication.run(Application.class);

    }

    private static SpringTemplateEngine templateEngine;

    static {
        initializeTemplateEngine();

    }

    private static void initializeTemplateEngine() {
        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver();
        // XHTML is the default mode, but we set it anyway for better understanding of code
        templateResolver.setTemplateMode("HTML5");
        // This will convert "home" to "/WEB-INF/templates/home.html"
        templateResolver.setPrefix("classpath:/templates/");
        templateResolver.setSuffix(".html");
        // Template cache TTL=1h. If not set, entries would be cached until expelled by LRU
        templateResolver.setCacheTTLMs(3600000L);
        templateResolver.setPrefix("classpath:/templates/");
        templateResolver.setTemplateMode("HTML5");
        //AbstractDialect dialect = new SpringStandardDialect();
        //AbstractMessageResolver messageResolver = new SpringMessageResolver();

        //templateResolver.set
        templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        //templateEngine.setDialect(dialect);
        //templateEngine.setMessageResolver(messageResolver);

    }
}