package org.lrf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDubboProvideApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboProvideApplication.class, args);
		try {  
            System.in.read();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }
	}
}
