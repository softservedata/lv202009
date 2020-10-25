package com.softserve.edu09.tain2;

import com.softserve.edu09.train.Parent;

public class Child extends Parent {

	//@Override
	public int f() {
		return 2;
	}

	public int useF2() {
		return useF();
	}
}
