package com.gwy.test;

import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Formatter;

public class Test01 {

	public static void main(String[] args) throws Exception {
		
		User user = new User();
		user.setId("123");
		user.setName("test01");
		//user.setSex("ÄÐ");
		//user.setPhone("156");
		
		etNum(user);
		//System.out.println(etNum);
		
	}
	
	public static String etNum(Object obj) throws Exception{
		
		User user = (User) obj;
		Class clazz = obj.getClass();
		
		int totalNum = 0;
		int hasValNum = 0;
		
		Method[] methods = clazz.getDeclaredMethods();
		for (int i = 0; i < methods.length; i++) {
			Method method = methods[i];
			
			String name = method.getName();
			if(name.startsWith("get")){
				Method method2 = clazz.getDeclaredMethod(name);
				Object invoke = method2.invoke(user);
				if(null!=invoke){
					hasValNum++;
				}
				totalNum++;
			}
		}
		 String s = new Formatter().format("%.0f", (Double.valueOf((float)hasValNum/totalNum)*100)).toString();
		return s+"%";
	}
	
	
}
