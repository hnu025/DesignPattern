package com.hnu025.ObserverPattern;

public class ObserverImpl implements Observer{

	@Override
	public void watch(Thing t) {
		System.out.println("物品发送变化~~"+"价格："+t.getPrice()+"名字："+t.getName());
	}

}
