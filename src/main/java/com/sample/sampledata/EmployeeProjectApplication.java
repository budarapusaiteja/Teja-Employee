package com.sample.sampledata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeProjectApplication.class, args);
	}

}
/*Dependencies : Spring Data JPA, Spring Web, MySQL Driver
 *--spring-boot-starter-tomcat dependency available in Spring web
 * 
 *REST : REpresentational State Transfer
 *--Data exchange format: No Restriction, JSON is popular
 *--Transport : Only http
 * 
 */
