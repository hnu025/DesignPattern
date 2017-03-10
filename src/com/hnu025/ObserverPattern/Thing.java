package com.hnu025.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Thing {

	private int price;
	private String name;

	public void setPrice(int price) {
		this.price = price;
		for (Observer o : list) {
			o.watch(this);
		}
	}

	public void setName(String name) {
		this.name = name;
		for (Observer o : list) {
			o.watch(this);
		}
	}

	public int getPrice() {
		return this.price;
	}

	public String getName() {
		return this.name;
	}

	private List<Observer> list = new ArrayList<Observer>();

	public void addObserver(Observer o) {
		list.add(o);
	}
}
