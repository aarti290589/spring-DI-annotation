package com.spring.dependency_injection.di_by_xml.client.impl;

import com.spring.dependency_injection.di_by_xml.client.SmartKitchenClientInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class SmartWaterClient implements SmartKitchenClientInterface{

	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return "Clean water filling in progress";
	}

	@Override
	public String turnOff() {
		// TODO Auto-generated method stub
		return "Clean water filled";
	}

	@Override
	public String timer() {
		// TODO Auto-generated method stub
		return "Clean water timer is on for 15 minutes";
	}

}
