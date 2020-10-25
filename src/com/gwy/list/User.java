package com.gwy.list;

import java.util.Comparator;

public class User implements Comparator {

	private String id;
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		User u = (User) o1;
		User u2 = (User) o2;
		
		return u.getId().compareTo(u2.getId());
	}

}
