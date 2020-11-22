package io.github.astrapi69.template.mapper;

import io.github.astrapi69.template.jpa.entity.Templates;
import io.github.astrapi69.template.viewmodel.Template;
import org.springframework.stereotype.Component;

import de.alpharogroup.bean.mapper.AbstractGenericMapper;

@Component
public class TemplatesMapper extends AbstractGenericMapper<Templates, Template>
{
}
