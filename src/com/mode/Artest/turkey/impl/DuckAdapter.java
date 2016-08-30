package com.mode.Artest.turkey.impl;
import java.util.Random;

import com.mode.Artest.duck.Duck;
import com.mode.Artest.turkey.Turkey;

public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;
 
	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}
    
	public void gobble() {
		duck.quack();
	}
  
	public void fly() {
		if (rand.nextInt(5)  == 0) {
		     duck.fly();
		}
	}
}
