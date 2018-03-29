package com.viewfunction.servicesRegistrationAndDiscovery;

import com.viewfunction.servicesRegistrationAndDiscovery.util.ApplicationLauncherUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServicesRegistrationAndDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesRegistrationAndDiscoveryApplication.class, args);
        ApplicationLauncherUtil.printApplicationConsoleBanner();
	}
}
