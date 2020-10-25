package com.gwy.queue;

import java.util.LinkedList;

public class Queue {

	Node head;
	Node cuurent;
	
	
	public void add(int val){
		
		if(head==null){
			head = new Node(val);
			cuurent = head;
		}else{
			cuurent.next = new Node(val);
			cuurent = cuurent.next;
		}
		
	}
	
	public int pop() throws Exception{
		if(head==null){
			throw new Exception("队列不能为空");
		}
		
		Node node = head;
		head = head.next;
		
		return node.val;
	}
	
	public static void main(String[] args) throws Exception{
		Queue queue = new Queue();
		
		for (int i = 0; i <5; i++) {
			queue.add(i);
		}
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		
	}
	
}
