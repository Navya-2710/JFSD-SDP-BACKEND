package com.klef.jfsd.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Allow CORS for all endpoints
                .allowedOrigins("http://localhost:3000")  // Your React frontend URL
                .allowedMethods("GET", "POST", "PUT", "DELETE")  // Allowed HTTP methods
                .allowedHeaders("*")  // Allow any headers
                .allowCredentials(true);
       // Allow credentials (cookies, authentication)
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // Map the '/images/**' path to the static folder where images are located
        registry.addResourceHandler("/images/**")
                .addResourceLocations("classpath:/static/images/");  // Resource folder location
    }
    
   
}


