package com.karthik.org.Qualifier.interfacep;

import org.springframework.stereotype.Component;

@Component
public class V8Engine implements Engine {

	@Override
	public String engine() {
		
		return "v8sarma";
	}

}
