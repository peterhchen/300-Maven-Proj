package com.phone.appName;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	public void drive() {
		System.out.println ("Drive Car");
	}
}