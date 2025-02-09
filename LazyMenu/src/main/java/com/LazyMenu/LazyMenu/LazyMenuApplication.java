package com.LazyMenu.LazyMenu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
ไปที่ลิงก์นี้ http://localhost:8090/h2-console เพื่อเข้าถึง H2 database
ไปที่ http://localhost:8090/menu เพื่อดู menu
 */
@SpringBootApplication
public class LazyMenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(LazyMenuApplication.class, args);
	}

}
