package cz.zonky.marketplace.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Main application class.
 * 
 * @author Daniel Ficek
 */
@SpringBootApplication
@ComponentScan(basePackages = {"cz.zonky.marketplace.loan.component"})
@EnableScheduling
public class ZonkyLoanApplication extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ZonkyLoanApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ZonkyLoanApplication.class);
	}
	
}
