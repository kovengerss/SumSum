package com.example.kovengerss.myBatis;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
@MapperScan("com.example.kovengerss.mapper") //mapper패키지안에 있는 모든 mapper인터페이스 스캔!
@RequiredArgsConstructor
public class MyBatisConfig {


    private final ApplicationContext applicationContext;

    //코벤져스 히카리 연결
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public HikariConfig hikariConfig() {
        return new HikariConfig();
    }


    @Bean
    public HikariDataSource hikariDataSource(){
//        DataSource 객체에 DBMS 정보 설정
        return new HikariDataSource(hikariConfig());
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws IOException {
//        세션 팩토리 설정 객체
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//        DBMS 정보를 담고 있는 DataSource를 세션 팩토리 설정 객체에 전달
        sqlSessionFactoryBean.setDataSource(hikariDataSource());
//        SQL 쿼리를 작성할 mapper.xml 경로 설정
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath*:/mapper/**/*.xml"));
        sqlSessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:/config/config.xml"));
        try {
//            위에서 설정한 세션 팩토리 빈을 통해 세션 팩토리 생성
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
//            팟홀(언더바) 표기법을 카멜 표기법으로 자동 변경 설정
            sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);
            return sqlSessionFactory;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
