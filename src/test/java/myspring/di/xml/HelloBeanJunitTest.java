package myspring.di.xml;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloBeanJunitTest {
	ApplicationContext context;
	
	@BeforeEach
	void init() {
		context = new GenericXmlApplicationContext("classpath:hello-bean.xml");
		
	}
	
	
	@Test
	void helloBean() {
		
	}
}
