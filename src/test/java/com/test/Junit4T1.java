package com.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;


@SuppressWarnings("deprecation")
public class Junit4T1 {

	@Test
	public void t()
	{
		System.out.println(1);
		@SuppressWarnings("deprecation")
		BeanFactory bf=new XmlBeanFactory(new ClassPathResource("dispatcher-servlet.xml"));
		com.yhf2015.test.Test t=(com.yhf2015.test.Test)bf.getBean("test");
		System.out.println(t.getStrTest());
	}
}
