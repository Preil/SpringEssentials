package com.oreilly.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Ilya 17.04.2017.
 */
public class InfrastructureConfig {
    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource();
    }
}
