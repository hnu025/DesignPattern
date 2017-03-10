package com.hnu025.ObserverPattern;

public class Test {
	public static void main(String[] args) {
		Thing t = new Thing();
		Observer o = new ObserverImpl();
		t.addObserver(o);
		t.setName("Bob");
		t.setPrice(12);
	}
}
