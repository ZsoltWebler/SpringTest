package org.webler.zsolt.springtest;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTestApplication.class, args);
    }

    @Bean
    InitializingBean initDatabase() {
        return () -> {

            //TODO Az adatbázis adatokkal való feltöltéséhez, használhatjátok ezt a Bean-t.

        };
    }

}
