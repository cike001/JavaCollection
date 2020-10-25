package com.gwy.likedList;

public class LinkedList {

	Node first;
	Node last;
	
	//�����Ƿ�Ϊ��
	public boolean isEmpty(){
		return first==null;
	}
	//��ӡ�ڵ�
	public void print(){
		Node current = first;
		while(current!=null){
			System.out.println("["+current.xh+","+current.name+","+current.score+"]");
			current = current.next;
		}
		System.out.println();
	}
	//����ڵ�
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
