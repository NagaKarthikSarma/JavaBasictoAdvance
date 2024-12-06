package com.karthik.org.Qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.karthik.org.Qualifier.interfacep.V6Engine;



@Component
public class CarEngine {

	@Autowired         //V6Engine.engine()" because "this.engine" is null
//	@Qualifier("karthik")    // if i wont use autowired then i will get exception that the constructor is null
	   
	V6Engine engine;
	
	public void carModel() {
		System.out.println("the engine is: "+engine.engine());
	}
	
}
