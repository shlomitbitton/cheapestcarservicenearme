package com.cheapestcarservicenearme;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

  

@Configuration
public class AppConfig extends WebMvcConfigurationSupport {
   
   // @Autowired
   // LoggingInterceptor loggingInterceptor;

   @Override
   protected void addInterceptors(InterceptorRegistry registry) {
     // registry.addInterceptor(new LoggingInterceptor());
   }

   @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        // registry.addResourceHandler("css/**", "img/**")
        //         .addResourceLocations("classpath:/static/css/", "classpath:/static/img/");
    }
}