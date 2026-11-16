package com.sherif.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.sheriftoiema.loans.controller") })
@EnableJpaRepositories("com.sheriftoiema.loans.repository")
@EntityScan("com.sheriftoiema.loans.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Loans microservice REST API Documentation",
				description = "sherif toiema System Loans microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Sherif Toiema",
						email = "sherif@gmail.com",
						url = "https://www.sheriftoiema.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.sheriftoiema.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Sherif Toiema System Loans microservice REST API Documentation",
				url = "https://www.sheriftoiema.com/swagger-ui.html"
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}
}
