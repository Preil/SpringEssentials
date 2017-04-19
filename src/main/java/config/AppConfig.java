package config;

import entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;

/**
 * Ilya 17.04.2017.
 */

@Configuration
@Import(InfrastructureConfig.class)
public class AppConfig {
    @Autowired
    private DataSource dataSource;

    @Bean
    public Game game(){
        BaseballGame baseballGame = new BaseballGame(redSox(), cubs());
        baseballGame.setDataSource(dataSource);
        return baseballGame;
    }

    @Bean
    public Team redSox(){
        return new RedSox();
    }

    @Bean
    public Team cubs() {
        return new Cubs();
    }
}
