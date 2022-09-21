package com.spring.dependency_injection.di_by_xml.client.impl;

import com.spring.dependency_injection.di_by_xml.client.SmartKitchenClientInterface;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmartOvenClient implements SmartKitchenClientInterface {

	@Override
	public String turnOn() {
		// TODO Auto-generated method stub
		return "Grilled chicken is being cooked";
	}

	@Override
	public String turnOff() {
		// TODO Auto-generated method stub
		return "Tasty grilled chicken is ready";
	}

	@Override
	public String timer() {
		// TODO Auto-generated method stub
		return "Tasty grilled chicken completed in 25 minutes";
	}

}
