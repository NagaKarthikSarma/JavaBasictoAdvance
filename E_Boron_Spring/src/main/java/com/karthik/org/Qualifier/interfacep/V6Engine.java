package com.karthik.org.Qualifier.interfacep;

import org.springframework.stereotype.Component;

@Component()
public class V6Engine implements Engine {

	@Override
	public String engine() {
		
		return "v6karthik";
	}

}
