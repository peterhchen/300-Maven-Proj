package com.phone.SpringAnno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Apple {
	@Autowired
	MobileProcessor cpu;
	
	public MobileProcessor getCpu() {
		return cpu;
	}

	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}

	public void config() {
		System.out.println ("iPhone X Dual SIM Adaptor, 64 GB, 12MP Camera");
		cpu.process();
	}
}