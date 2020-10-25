package com.gwy.map;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapTest {

	@Test
	public void test1(){
		
		User user = new User("zs");
		System.out.println(user.hashCode());
		Map mp = new HashMap();
		mp.put(user, "lisi");
		
		user.setName("wangwu");
		System.out.println(user.hashCode());
		System.out.println(mp.get(new User("zs")));
		
	}
	
}
