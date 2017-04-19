package com.oreilly.config;

import com.oreilly.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Ilya 17.04.2017.
 */

@Configuration
@Import(InfrastructureConfig.class)
@ComponentScan(basePackages = "com.oreilly")
public class AppConfig {
    @Autowired
    private DataSource dataSource;

//    @Autowired @Qualifier("redSox")
//    private Team home;

    @Resource
    private Team redSox;

    @Autowired @Qualifier("cubs")
    private Team away;

    @Bean
    public Game game(){
        BaseballGame baseballGame = new BaseballGame(redSox, away);
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }

}
