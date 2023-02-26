package com.infra.model;

import com.infra.annotations.Init;

public class A {
	
	public A() {
	}
	
	@Init
	public void showViewA() {
		System.out.println("test A");
	}
	
	@Init
	public void showViewB() {
		System.out.println("test B");
	}
	
	@Init
	public void showViewC() {
		System.out.println("test C");
	}
	@Init(runOninstantiation = false)
	public void showViewD() {
		System.out.println("test D");
	}
	
	public void testMain() {
		System.out.println("Test Main");
	}

}
