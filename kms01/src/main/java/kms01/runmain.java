package kms01;

import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class runmain {
	
	public static void main(String[] args) {
		
//		run run = new run();
//		run.run();
		GenericApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		run run = ctx.getBean("run",run.class);
		run.run();
		
		ctx.close();
	}

}
