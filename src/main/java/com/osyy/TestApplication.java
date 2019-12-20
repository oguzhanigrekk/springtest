package com.osyy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;

import com.osyyfile.prog.FileProperties;

@ServletComponentScan
@SpringBootApplication
@EnableConfigurationProperties(value = FileProperties.class)
public class TestApplication {

	public static void main(String[] args) {
		 
		 FileProperties fp = new FileProperties() ;
		 

         SpringApplication.run(TestApplication.class, args);
         System.out.println(fp.getPath());
	}

}
