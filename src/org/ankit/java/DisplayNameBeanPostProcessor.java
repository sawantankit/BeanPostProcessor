package org.ankit.java;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DisplayNameBeanPostProcessor implements BeanPostProcessor {
	
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException
	{
		
		System.out.println("In After Bean Initializaiton, Bean name is " + beanName  );
		return bean;
		
		
	}	
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)  throws BeansException
	{
		
		System.out.println("In Before Bean Initializaiton, Bean name is " + beanName  );
		return bean;
		
	}	

}
