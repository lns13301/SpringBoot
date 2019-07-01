package com.example.demo;

import com.example.demo.domain.PlayerData;
import com.example.demo.repository.PlayerDataRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.concurrent.ThreadLocalRandom;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(PlayerDataRepository playerDataRepository){
        return args -> {

            ThreadLocalRandom.current().ints(1,100).boxed().distinct().limit(30).forEach(x->{
                playerDataRepository.save(PlayerData.builder()
                        .name("플레이어"+x)
                        .level(x)
                        .experience(x*4.7d)
                        .money(x*17L)
                        .job("백수 "+x+"년차")
                        .build());
            });
        };
    }

}
