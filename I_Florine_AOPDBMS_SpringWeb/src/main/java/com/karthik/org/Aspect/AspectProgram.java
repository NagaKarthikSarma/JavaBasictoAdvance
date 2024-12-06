package com.karthik.org.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectProgram {

    private static final Logger LOGGER = LoggerFactory.getLogger(AspectProgram.class);

//   // @Before("execution(* com.karthik.org.controller.HomeController.getAll(..))")
//    @Before("execution(* com.karthik.org.controller.HomeController.*(..))")
//    public void logBeforeGetAll() {  // Renamed to match @Before
//        LOGGER.info("Data retrieval initiated for 'getAll' method");
//    }
//   
//    @After("execution(* com.karthik.org.controller.HomeController.*(..))")
//    public void logAfterGetAll() {  
//        LOGGER.info("Data retrieval completed for 'getAll' method");
//    }
//    
   @Around("execution(* com.karthik.org.controller.HomeController.*(..))")
    public Object logAroundGetAll(ProceedingJoinPoint jp) throws Throwable {  
    
	      long start = System.currentTimeMillis();
	      Object obj=   jp.proceed();

	      long end= System.currentTimeMillis();
    	
        LOGGER.info("Data processing for  method: "+ jp.getSignature().getName()+ " " + (end-start) + " ms ");
		return obj;
    
   }
    
//   //if I have to send any arguments through the url then 
//   @Around("execution(* com.karthik.org.controller.HomeController.argument(..))&&args(a,b)")
//   public Object argumentPassing(ProceedingJoinPoint jp,String a, String b) throws Throwable {  
//   
//	  Object obr[] = {a,b};
//      long start = System.currentTimeMillis();
// Object obj=   jp.proceed(obr);
//
// long end= System.currentTimeMillis();
//       LOGGER.info("Data processing for  method: "+ jp.getSignature().getName()+ " " + (end-start) + " ms "+ a+b);
//		return obj;
//   
//  }

}
