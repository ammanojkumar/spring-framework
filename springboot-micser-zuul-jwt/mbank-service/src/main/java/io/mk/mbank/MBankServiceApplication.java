
package io.mk.mbank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MBankServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MBankServiceApplication.class, args);
	}

}