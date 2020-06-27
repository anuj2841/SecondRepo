package com.anuj.springboot.aop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.anuj.springboot.aop.model.Strudent;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class SpringBootAopIntegrationApplication implements CommandLineRunner{

	@Autowired 
	Strudent s;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAopIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("Inside run");
		s.setName("Anuj Singh");
		s.getName();
		s.setAge("25");
		
	}

}
