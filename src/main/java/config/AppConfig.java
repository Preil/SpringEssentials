package config;

import entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Ilya 17.04.2017.
 */

@Configuration
public class AppConfig {
    @Bean
    public Game game(){
        return new BaseballGame(redSox(), cubs());
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
