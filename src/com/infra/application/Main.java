package com.infra.application;

import com.infra.model.A;
import com.infra.reflection.ObjectCreator;

public class Main {
	
	public static void main(String[] args) throws Exception  {
		
		A testA = ObjectCreator.create(A.class);
		testA.testMain();
		testA.showViewA();
		testA.showViewB();
		testA.showViewC();
		
	}

}
