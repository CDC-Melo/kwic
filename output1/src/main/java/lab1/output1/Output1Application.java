package lab1.output1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Output1Application {

	public static void main(String[] args) {
		SpringApplication.run(Output1Application.class, args);
	}

}
