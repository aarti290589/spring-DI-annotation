package com.spring.dependency_injection.di_by_xml.service.impl;

import com.spring.dependency_injection.di_by_xml.client.SmartKitchenClientInterface;
import com.spring.dependency_injection.di_by_xml.service.SmartKitchenServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SmartStoveService implements SmartKitchenServiceInterface{
	@Autowired
	private SmartKitchenClientInterface smartClientInterface;
	@Override
	public String turnOn() {
		
		return smartClientInterface.turnOn();
	}

	@Override
	public String turnOff() {
		// TODO Auto-generated method stub
		return smartClientInterface.turnOff();
	}

	@Override
	public String timer() {
		// TODO Auto-generated method stub
		return smartClientInterface.timer();
	}

}
