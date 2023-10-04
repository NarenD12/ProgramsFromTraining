package com.infinite.collconst;

import java.util.Map;

public class MapConstBean {
	private Map<String, String> mp;

	public MapConstBean(Map<String, String> t) {
		mp=t;
	}
	public void display(){
		System.out.println(mp.keySet());
		System.out.println(mp.values());
	}
}
