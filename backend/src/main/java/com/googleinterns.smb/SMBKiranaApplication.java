package com.googleinterns.smb;

import org.springframework.web.bind.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
@RestController
@SpringBootApplication
public class SMBKiranaApplication {
	public static void main(String[] args)
	{
		SpringApplication.run(SMBKiranaApplication.class,args);
	}
	@RequestMapping("/about")
	public Map<String,String> hello()
	{
		HashMap<String,String> temp=new HashMap<>();
		temp.put("A","B");
		return temp;
	}
}

