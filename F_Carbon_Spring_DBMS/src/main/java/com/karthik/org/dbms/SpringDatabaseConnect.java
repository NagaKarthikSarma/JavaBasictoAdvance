package com.karthik.org.dbms;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.karthik.org.dbms.model.LumenComp;


public class SpringDatabaseConnect {

	public static void main(String[] args) {
		
		ApplicationContext  context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		JdbcCon jc = context.getBean(JdbcCon.class);
		
		List<LumenComp> li = jc.findAll();
		for (LumenComp list: li) {
			
			System.out.println(list.getEid()+" -- "+list.getEname()+" -- "+list.getExp());
		}
		
	LumenComp lc = new LumenComp();
    lc.setEid(343929);
    lc.setEname("naga karthik sarma");
    lc.setExp(1);
    
   // int result = jc.save(lc);
   // System.out.println(result);
		
		((ConfigurableApplicationContext) context).close();
		

	}

}
