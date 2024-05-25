package com.example.demo;

import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@SpringBootApplication
public class TodoCalanderApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoCalanderApplication.class, args);
	}

}
@Configuration
@ComponentScan(basePackages = "services")
class ProjectConfig{

	@Value("${spring.datasource.url}")
	private String datasourceUrl;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.password}")
	private String password;
	@Bean
	public DataSource dataSource(){
		HikariDataSource dataSource=new HikariDataSource();
		dataSource.setJdbcUrl(datasourceUrl);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setConnectionTimeout(1000);
		return dataSource;
	}
}

