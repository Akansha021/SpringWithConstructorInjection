package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigJava {

    @Bean(name = "person")
    public Person person(){
        return new Person("ABC",1);
    }
}
