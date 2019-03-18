package com.liujl.purchasesalestorage.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>
 * </p>
 *
 * @author: Liu Junlong
 * @date: 2019/3/17 11:50
 */
@Configuration
public class MyWebAppConfig {
    /**
     * CORS 全局配置
     * 解决跨域
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") //配置支持跨域的路径
                        //配置允许的源
                        .allowedOrigins("*")
                        //配置是否允许发送Cookie, 用于 凭证请求
                        .allowCredentials(true)
                        //配置支持跨域请求的方法,如：GET、POST，一次性返回
                        .allowedMethods("GET", "POST", "DELETE", "PUT","PATCH")
                        //配置预检请求的有效时间
                        .maxAge(3600);
            }
        };
    }
}

