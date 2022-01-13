package io.github.astrapi69.template.config;

import io.github.astrapi69.spring.configuration.AbstractSwaggerConfiguration;
import io.github.astrapi69.template.viewmodel.enums.AppRestPath;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@AllArgsConstructor
@EnableSwagger2
public class SwaggerConfiguration extends AbstractSwaggerConfiguration
{
	@Autowired
	ApplicationProperties applicationProperties;

	@Bean
	public Docket api()
	{
		return super.api();
	}

	protected ApiInfo metaData()
	{
		return super.metaData();
	}

	@Override
	public String newBasePackage()
	{
		return applicationProperties.getBasePackage() != null
			? applicationProperties.getBasePackage()
			: "io.github.astrapi69.template";
	}

	@Override
	public String newApiInfoTitle()
	{
		return applicationProperties.getApiInfoTitle() != null
			? applicationProperties.getApiInfoTitle()
			: "template REST API";
	}

	@Override
	public String newApiInfoDescription()
	{
		return applicationProperties.getApiInfoDescription() != null
			? applicationProperties.getApiInfoDescription()
			: "description of REST API of this spring-boot-template application";
	}

	@Override
	public String newApiInfoVersion()
	{
		return applicationProperties.getApiInfoVersion() != null
			? applicationProperties.getApiInfoVersion()
			: AppRestPath.REST_API_VERSION_1;
	}

	@Override
	public String newApiInfoLicense()
	{
		return applicationProperties.getApiInfoLicense() != null
			? applicationProperties.getApiInfoLicense()
			: "MIT";
	}

	@Override
	public String newApiInfoLicenseUrl()
	{
		return applicationProperties.getApiInfoLicenseUrl() != null
			? applicationProperties.getApiInfoLicenseUrl()
			: "https://opensource.org/licenses/MIT";
	}

	@Override
	public String newContactName()
	{
		return applicationProperties.getContactName() != null
			? applicationProperties.getContactName()
			: "template inc.";
	}

	@Override
	public String newContactUrl()
	{
		return applicationProperties.getContactUrl() != null
			? applicationProperties.getContactUrl()
			: "www.template.org";
	}

	@Override
	public String newDocketPathsRegex()
	{
		return applicationProperties.getDocketPathsRegex() != null
			? applicationProperties.getDocketPathsRegex()
			: AppRestPath.REST_DOCKET_PATHS_REGEX;
	}
}
