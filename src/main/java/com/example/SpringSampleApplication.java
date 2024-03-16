package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = {"com.example"})
public class SpringSampleApplication
{
    public static void main( String[] args )
    {
        SpringApplication.run(SpringSampleApplication.class);
    }
}
