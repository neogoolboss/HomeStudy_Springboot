package com.homestudy.jwtsecurity.auth.config;


import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@EnableWebMvc /* Spring MVC 설정을 활성화 함 */
public class WebConfig {

    /* 정적 리소스를 찾을 위치들을 정의하는 상수 배열 */
    private static final String[] CLASSPATH_RESOURCE_LOCATIONS = {
            "classpath:/static/", "classpath:/public/", "classpath:/", "classpath:/resources/",
            "classpath:/META-INF/resources/", "classpath:/META-INF/resources/webjars/"
    };


    // 모든 요청 경로에 대해 정적 리소스를 위에 정의된 위치들에서 제공하도록 설정.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("**").addResourceLocations(CLASSPATH_RESOURCE_LOCATIONS);
    }

    @Bean
    public FilterRegistrationBean<HeaderFilter> getFilterRegistrationBean() {

        // HeaderFilter를 등록하기 위한 FilterRegistrationBean을 생성.
        FilterRegistrationBean<HeaderFilter> registrationBean = new FilterRegistrationBean<HeaderFilter>(createHeaderFilter());

        registrationBean.setOrder(Integer.MIN_VALUE); // 필터의 순서를 설정. Integer.MIN_VALUE는 필터가 가장 먼저 실행되도록 설정.
        registrationBean.addUrlPatterns("/*"); // 필터가 모든 URL 패턴에 대해 적용되도록 설정.

        return registrationBean;
    }

    @Bean
    public HeaderFilter createHeaderFilter() {
        return new HeaderFilter(); // HeaderFilter 빈을 생성하여 Spring 컨텍스트에 등록.
    }

    @Bean
    public JwtTokenInterceptor jwtTokenInterceptor() {
        return new JwtTokenInterceptor(); // JwtTokenInterceptor 빈을 생성하여 Spring 컨텍스트에 등록.
    }
}
