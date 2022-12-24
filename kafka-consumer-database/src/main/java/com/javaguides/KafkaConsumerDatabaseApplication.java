package com.javaguides;

import com.javaguides.entity.WikimediaData;
import com.javaguides.repository.WikimediaDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaConsumerDatabaseApplication{
    public static void main(String[] args) {
        SpringApplication.run(KafkaConsumerDatabaseApplication.class, args);
    }

}
