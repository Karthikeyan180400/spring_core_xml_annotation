package com.ty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	
	Sim sim;

	public Mobile(@Autowired Sim sim) {
		this.sim = sim;
	}
	
	

}
