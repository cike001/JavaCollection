package com.gwy.stack;

public class Stack {

	Node head;
	Node current;
	
	//入栈操作
	public void push(int data){
		if(head==null){
			head = new Node(data);
			current = head;
		}else{
			Node node = new Node(data);
			node.pre = current;
			current = node;
			
		}
	}
	
	//出栈操作
	public Node pop(){
		if(current==null){
			return null;
		}
		Node node = current;
		current = current.pre;
		return node;
	}
	
	class Node{
		int data;
		Node pre;
		public Node(int data) {
			this.data = data;
		}
		
	}
	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println(stack.pop().data);
		System.out.println(stack.pop().data);
		System.out.println(stack.pop().data);
	}
	
}
