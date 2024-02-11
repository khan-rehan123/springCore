package com.springcore.alone.collection;

import java.util.List;
import java.util.Map;

public class Person {
	private List<String> friends;
	private Map<String, Integer> fessStructure;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	

	public Map<String, Integer> getFessStructure() {
		return fessStructure;
	}

	public void setFessStructure(Map<String, Integer> fessStructure) {
		this.fessStructure = fessStructure;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fessStructure=" + fessStructure + "]";
	}

	
}
