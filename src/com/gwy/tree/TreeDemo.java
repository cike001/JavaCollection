package com.gwy.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import org.junit.Test;

public class TreeDemo {
	static TreeNode node = null;
	static{
		//������
		/**
		 * 		1
		 *     / \
		 *    2   3
		 *   / \   
		 *  4   5   
		 * ǰ��1 2 4 5 3
		 * ����4 2 5 1 3
		 * ����4 5 2 3 1
		 */
		 node = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		TreeNode node4 = new TreeNode(4);
		TreeNode node5 = new TreeNode(5);
		//TreeNode node6 = new TreeNode(6);
		
		node.left = node2;
		node.right = node3;
		
		node2.left = node4;
		node2.right = node5;
		
		//node3.right = node6;
		
	}
	
	@Test
	public void test(){
		System.out.println(getTreeDepth(node));
		System.out.println(getTreeNodeNum(node));
		System.out.println(getTreeMinDepth(node));
		System.out.println(getLeafNodeNum(node));
		
		getTreeQxBl(node);
		System.out.println("----------");
		getTreeZxBl(node);
		System.out.println("-------");
		getTreeHxBl(node);
		System.out.println("--------");
		
		System.out.println(getTreeNodeNumByLevel(node,3));
		
		System.out.println("-------");
		
		getTreeLevelBl(node);
		
		System.out.println("----------");
		
		System.out.println(isAvlRec(node));
		
	}

	//1.���������������
	public static int getTreeDepth(TreeNode root){
		if(root==null){
			return 0;
		}
		
		int l = getTreeDepth(root.left);
		int r = getTreeDepth(root.right);
		
		return Math.max(l, r)+1;
		
	}
	
	
	
	//2.�����������С���
	public static int getTreeMinDepth(TreeNode root){
		if(root==null){
			return 0;
		}
		
		return getMin(root);
		
	}
	
	static int getMin(TreeNode root){
		if(root==null){
			return Integer.MAX_VALUE;
		}
		if(root.left==null && root.right==null){
			return 1;
		}
		return Math.min(getMin(root.left), getMin(root.right))+1;
	}
	
	//3,��������нڵ�ĸ���
	public static int getTreeNodeNum(TreeNode root){
		if(root==null){
			return 0;
		}
		
		return getTreeNodeNum(root.left)+getTreeNodeNum(root.right)+1;
		
	}
	
	//4,���������Ҷ�ӽڵ�ĸ���
	public static int getLeafNodeNum(TreeNode root){
		if(root==null){
			return 0;
		}
		if(root.left==null && root.right==null){
			return 1;
		}
		
		return getLeafNodeNum(root.left)+getLeafNodeNum(root.right);
		
	}
	
	//5.��������е�k��ڵ�ĸ��� 
	public static int getTreeNodeNumByLevel(TreeNode root,int level){
		if(root==null || level < 1){
			return 0;
		}
		
		if(level==1){
			return 1;
		}
		
		int leftNodeNum = getTreeNodeNumByLevel(root.left,level-1);
		int rightNodeNum = getTreeNodeNumByLevel(root.right,level-1);
		
		return leftNodeNum + rightNodeNum;
	}
	
	
	//6.�ж϶������Ƿ���ƽ�������
	public static boolean isAvlRec(TreeNode root){
		if(root==null){
			return true;
		}
		
		if(Math.abs(getTreeDepth(root.left)-getTreeDepth(root.right))>1){
			return false;
		}
		
		return isAvlRec(root.left) && isAvlRec(root.right);
		
	}
	
	//7.�ж϶������Ƿ�����ȫ������
	//8.�����������Ƿ���ȫ��ͬ
	public static boolean isSameTree(TreeNode t1,TreeNode t2){
		if(t1==null && t2==null){
			return true;
		}else if(t1==null || t2==null){
			return false;
		}
		
		if(t1.val != t2.val){
			return false;
		}
		boolean b1 = isSameTree(t1.left, t2.left);
		boolean b2 = isSameTree(t2.right, t2.right);
		
		return b1 && b2;
	}
	
	//9.�����������Ƿ�Ϊ����
	//10.��ת������or���������
	//11.����������������͹������Ƚڵ�
	//12.��������ǰ�����:������
	public static void getTreeQxBl(TreeNode root){
		if(root==null){
			return;
		}
		
		System.out.print(root.val+" ");
		getTreeQxBl(root.left);
		getTreeQxBl(root.right);
	}
	
	
	//13.���������������
	public static void getTreeZxBl(TreeNode root){
		if(root == null){
			return;
		}
		
		getTreeZxBl(root.left);
		System.out.print(root.val+" ");
		getTreeZxBl(root.right);
		
	}
	
	
	
	//14.�������ĺ������
	public static void getTreeHxBl(TreeNode root){
		if(root == null){
			return;
		}
		
		getTreeHxBl(root.left);
		getTreeHxBl(root.right);
		System.out.print(root.val+" ");
		
	}
	
	
	//15.ǰ������ͺ���������������
	//16.�ڶ������в���ڵ�
	//17.����һ����������һ����������ӡ���������нڵ�ֵ�ĺ͵��������������е�·��
	//18.����������������
	//19.�������Ĳ�α���:����
	public static void getTreeLevelBl(TreeNode root){
		if(root==null){
			return;
		}
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			TreeNode node = queue.remove();
			System.out.print(node.val+" ");
			if(node.left!=null){
				queue.add(node.left);
			}
			if(node.right!=null){
				queue.add(node.right);
			}
			
		}
		
		
		
		
	}
	
	
	//20.�������������ڵ�������
	//21.��ͬ�Ķ�����
	//22.�ж϶������Ƿ��ǺϷ��Ķ��������(BST)
	
}
