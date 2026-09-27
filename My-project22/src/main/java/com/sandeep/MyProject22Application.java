package com.sandeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sandeep.service.PostService;

@SpringBootApplication
public class MyProject22Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=
		SpringApplication.run(MyProject22Application.class, args);
		
		
		PostService post=ctx.getBean(PostService.class);
		
		//post.savePost();
		
		post.updatePost(1);
	}

}
