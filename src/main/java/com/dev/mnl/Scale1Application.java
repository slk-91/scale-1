package com.dev.mnl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication /* 메인 어플리케이션임을 명시 */
/*https://yonguri.tistory.com/12?category=359079*/
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = "com.dev.main")

public class Scale1Application {

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled","false");
		System.setProperty("spring.devtools.livereload.enabled","true");
		SpringApplication.run(Scale1Application.class, args);
	}

}
