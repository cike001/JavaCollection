package com.gwy.likedList;

public class LinkedList {

	Node first;
	Node last;
	
	//链表是否为空
	public boolean isEmpty(){
		return first==null;
	}
	//打印节点
	public void print(){
		Node current = first;
		while(current!=null){
			System.out.println("["+current.xh+","+current.name+","+current.score+"]");
			current = current.next;
		}
		System.out.println();
	}
	//插入节点
	public void insertNode(Node node){
		if(this.isEmpty()){
			first = node;
			last = node;
		}else{
			last.next = node;
			last = node;
		}
	}
	
	
}
