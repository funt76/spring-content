package internal.org.springframework.content.jpa.config;

import java.lang.annotation.Annotation;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.content.commons.config.AbstractStoreBeanDefinitionRegistrar;
import org.springframework.content.jpa.config.EnableJpaContentRepositories;

import internal.org.springframework.content.jpa.operations.JpaContentTemplate;

public class JpaContentRepositoriesRegistrar extends AbstractStoreBeanDefinitionRegistrar {

	@Override
	protected void createOperationsBean(BeanDefinitionRegistry registry) {
		String beanName = "jpaContentTemplate";
	    BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(JpaContentTemplate.class);
	    registry.registerBeanDefinition(beanName, builder.getBeanDefinition());
	}

	@Override
	protected Class<? extends Annotation> getAnnotation() {
		return EnableJpaContentRepositories.class;
	}

}
