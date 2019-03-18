package com.liujl.purchasesalestorage.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 * <p>
 * Druid 数据源配置
 * </p>
 *
 * @author: Liu Junlong
 * @date: 2019/3/17 11:42
 */
@Configuration
public class DruidConfig {
    /**
     * 主要实现WEB监控的配置处理
     *
     * @return
     */
    @Bean
    public ServletRegistrationBean druidServlet() {
        //进行druid监控的配置处理操作
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        servletRegistrationBean.addInitParameter("allow",
                "127.0.0.1"); // 白名单
//        servletRegistrationBean.addInitParameter("deny","ip"); // 黑名单
        servletRegistrationBean.addInitParameter("loginUsername", "liu"); // 用户名
        servletRegistrationBean.addInitParameter("loginPassword", "123321");// 密码
        servletRegistrationBean.addInitParameter("resetEnable", "false");// 是否可以重置数据源
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new WebStatFilter());

        filterRegistrationBean.addUrlPatterns("/*"); // 所有请求进行监控处理
        filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.css,/druid/*");
        return filterRegistrationBean;
    }

    /**
     * Jpa引入 @Bean("duridDatasource")
     * mybatis引用 @Bean(destroyMethod = "close", initMethod = "init")
     */
    @Bean(destroyMethod = "close", initMethod = "init")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        return new DruidDataSource();
    }
}
