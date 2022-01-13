package io.github.astrapi69.template.controller;

import io.github.astrapi69.template.config.ApplicationConfiguration;
import io.github.astrapi69.template.jpa.entity.Templates;
import io.github.astrapi69.template.mapper.TemplatesMapper;
import io.github.astrapi69.template.service.TemplatesService;
import io.github.astrapi69.template.viewmodel.Template;
import io.github.astrapi69.template.viewmodel.enums.AppRestPath;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(AppRestPath.REST_VERSION + AppRestPath.REST_TEMPLATES)
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class TemplatesController
{
	TemplatesService templatesService;
	TemplatesMapper mapper;

	@RequestMapping(method = RequestMethod.POST)
	public Template newTemplate() {
		Templates entity = templatesService.save(Templates.builder()
			.name("foo").build());
		return mapper.toDto(entity);
	}
}
