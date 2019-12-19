package com.osyyfile.prog;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FileConfiguration {

	@Autowired
	private FileProperties fileProperties;
	
	@PostConstruct
	public void init() {
		System.out.println("------------" + fileProperties.getPath());
	}
	
}
