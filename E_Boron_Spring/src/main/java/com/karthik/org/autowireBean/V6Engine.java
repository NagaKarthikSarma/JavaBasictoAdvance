package com.karthik.org.autowireBean;

import org.springframework.stereotype.Component;

import com.karthik.org.javabasedBean.Engine;

@Component
public class V6Engine implements Engine {

	@Override
	public String engine() {
		
		return "V6 EngineModel";
	}

}
