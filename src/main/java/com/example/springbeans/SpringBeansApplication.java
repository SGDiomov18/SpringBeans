package com.example.springbeans;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class SpringBeansApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBeansApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner (ApplicationContext ctx){
		return args -> {
			System.out.println("Some beans provided by Spring Boot:");
			String[] beansNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beansNames);
			for(String beanName: beansNames)
			{
				System.out.println(beanName);
			}
		};
	}
}
