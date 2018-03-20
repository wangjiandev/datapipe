package com.wangjian.galaxy.datapipe.config;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * @Description:
 * 数据源配置
 * @Author: wangjian
 * @CreateDate: 2018/3/20 下午5:40
 * @Version:
 */
@Configuration
public class DataSourceConfig {

    @Bean(name = "dataSource")
    public DataSource datasource(Environment env) {
        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setJdbcUrl(env.getProperty("spring.datasource.url"));
        dataSource.setUsername(env.getProperty("spring.datasource.username"));
        dataSource.setPassword(env.getProperty("spring.datasource.password"));
        dataSource.setDriverClassName(env.getProperty("spring.datasource.driver-class-name"));
        return dataSource;
    }

}