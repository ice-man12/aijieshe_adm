package com.aijieshe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;

import java.util.UUID;

@SpringBootApplication
@ServletComponentScan
public class AijiesheApplication {

	public static void main(String[] args) {

		SpringApplication.run(AijiesheApplication.class, args);

	}

}
