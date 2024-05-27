package com.homestudy.jwtsecurity.auth.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(basePackages = "com.homestudy.jwtsecurity", annotationClass = Mapper.class)
/* com.homestudy.jwtsecurity 패키지 내에 있는 모든 @Mapper 인터페이스를 검색하도록 MyBatis에 지시 */
public class MybatisConfig {
    /* 설정클래스이므로 별도의 메서드나 필드는 없다.*/
}
