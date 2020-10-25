package com.gwy.likedList;

public class Test {

	public static void main(String[] args) {
		
		LinkedList ld = new LinkedList();
		
		Node node = new Node("张三",45,1);
		Node node2 = new Node("李四",90,2);
		Node node3 = new Node("王五",100,3);
		
		
		ld.insertNode(node);
		ld.print();
		ld.insertNode(node2);
		ld.print();
		ld.insertNode(node3);
		ld.print();
		
	}
	
}
