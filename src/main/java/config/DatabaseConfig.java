package config;

import database.DBReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
@Lazy
public class DatabaseConfig {

@Bean(initMethod = "read")
@Scope("prototype")
public DBReader actions() {
    return new DBReader();
}
}