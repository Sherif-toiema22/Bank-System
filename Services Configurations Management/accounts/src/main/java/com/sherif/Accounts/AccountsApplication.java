package com.sherif.Accounts;

import com.sherif.Accounts.dto.AccountsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")

@OpenAPIDefinition(
		info = @Info(
				title = "Sherif System microservice REST API Documentation",
				description = "Sherif Toi'ema Bank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Sherif Toiema",
						email = "Sherif@gmail.com",
						url = "https://www.SherifToiema22.com"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.SherifToiema22.com"
				)
		),
		externalDocs = @ExternalDocumentation(
				description =  "Sherif Accounts microservice REST API Documentation",
				url = "https://www.SherifToiema22.com/swagger-ui.html"
		)
)
public class AccountsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

}
