package com.gwy.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

import org.junit.Test;

/**
 * 有序、可重复
 * ArrayList:动态数组
 * LinkedList：链表
 * @author Administrator
 *
 */
public class ListTest {
	
	
	static List<String> list =  new ArrayList<>(); 
	List l = new LinkedList<>();
	
	
	public void showList(List list){
		//循环：1、迭代器 2、foreach 3、for
		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			String str2 = iterator.next();
			System.out.println(str2);
		}
	}
	
	@Test
	public void test1(){
				
		list.add("D");
		//list.add("A");
		//list.add("D");
		
		showList(list);
		
		int i =list.size();
		System.out.println(i);
		
		System.out.println(list.indexOf("D"));
		
		//list.add(1, "C");
		showList(list);
		
		System.out.println(list.lastIndexOf("D"));
		
		int hashCode = list.hashCode();
		System.out.println("hashCode:"+hashCode);
		
		ListIterator<String> iterator = list.listIterator();
		//iterator.add("B");
		
		showList(list);
		
		
		//iterator.set("U");
		
		System.out.println("-------------");
		showList(list);
		
		
		String test = "hello";
		
		if(test instanceof String){
			System.out.println("this is String type");
		}
		
		
	}	
	
	
	@Test
	public void test2(){
		List li = new ArrayList();
		li.add(1);
		li.add(2);
		
		Object object = li.get(0);
		System.out.println(object instanceof Integer);
		int i = (int) li.get(0);
		System.out.println(i);
	}
	
	@Test
	public void test3(){
		Queue queue = new ArrayBlockingQueue<>(4);
		queue.add("a");
		queue.add("b");
		queue.add("c");
		
		//获取并移除此队列的头
		//Object poll = queue.poll();
		//System.out.println(poll);
		
		//获取但不移除此队列的头
		Object peek = queue.peek();
		System.out.println(peek);
		
		Object poll = queue.poll();
		System.out.println(poll);
	}
	
	@Test
	public void test4(){
		
		String str = "2";
		int i = str.compareTo("1");
		System.out.println(i);
		
	}
	
	@Test
	public void test5(){
		
		User user = new User();
		user.setId("2");
		
		User user2 = new User();
		user2.setId("1");
		
		int i = user.compare(user, user2);
		System.out.println(i);
	}
	
	@Test
	public void test6(){
		List li = new ArrayList();
		li.add("a");
		li.add("b");
		li.add("c");
		
		List list2 = Collections.unmodifiableList(li);
		testList(list2);
		
		
	}
	
	public void testList(List li){
		li.remove(0);
	}
	
}
