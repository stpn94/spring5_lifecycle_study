package spring5_lifecycle_study.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring5_lifecycle_study.spring.Client;
import spring5_lifecycle_study.spring.Client2;

@Configuration
@ComponentScan(basePackages = {"spring5_lifecycle_study.spring"})
public class AppCtx {

	@Bean
	public Client client() {
		Client client=new Client();
		client.setHost("host");
		return client;
	}
	
	@Bean(initMethod = "connect",destroyMethod = "close")
	public Client2 clien2() {
		Client2 client=new Client2();
		return client;
	}
}
