package com.sherif.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
/*@ComponentScans({ @ComponentScan("com.sherif.cards.controller") })
@EnableJpaRepositories("com.sherif.cards.repository")
@EntityScan("com.sherif.cards.model")*/
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API Documentation",
				description = "Sherif Toiema System Cards microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Sherif Abdelkader",
						email = "Sherif@gmail.com",
						url = "https://www.sherifToiema.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.sherifToiema.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Sherif Toiema System Cards microservice REST API Documentation",
				url = "https://www.sherifToiema.com/swagger-ui.html"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}
