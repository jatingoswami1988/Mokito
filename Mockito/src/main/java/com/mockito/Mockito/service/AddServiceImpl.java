package com.mockito.Mockito.service;

public class AddServiceImpl implements AddService {

	public int add(int num1, int num2) {
		System.out.println("**--- AddServiceImpl add executed ---**");
		return num1 + num2;
	}

}
