package com.mode.Artest.testCase;

import com.mode.Artest.duck.impl.MallardDuck;
import com.mode.Artest.turkey.Turkey;
import com.mode.Artest.turkey.impl.DuckAdapter;

public class TurkeyTestDrive {
	public static void main(String[] args) {
		MallardDuck duck = new MallardDuck();
		Turkey duckAdapter = new DuckAdapter(duck);
 
		for(int i=0;i<10;i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}
