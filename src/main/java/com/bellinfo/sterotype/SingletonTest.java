package com.bellinfo.sterotype;

public class SingletonTest {
	
	private static SingletonTest singletonTest;
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	private SingletonTest(){}
	public static SingletonTest getInstance(){
		if(singletonTest == null){
			singletonTest = new SingletonTest();
		}
		return singletonTest;
	}
	public void display(){
		System.out.println("name: "+name);
	}
	
	
	

}
