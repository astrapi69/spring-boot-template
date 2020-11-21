package io.github.astrapi69.template;

import io.github.astrapi69.template.config.ApplicationConfiguration;
import io.github.astrapi69.template.config.ApplicationProperties;
import io.github.astrapi69.template.config.SwaggerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@Import({ ApplicationConfiguration.class, SwaggerConfiguration.class })
@EnableConfigurationProperties({ ApplicationProperties.class })
@SpringBootApplication
public class SpringTemplateApplication
{

	public static void main(String[] args) {
		SpringApplication.run(SpringTemplateApplication.class, args);
	}

}
