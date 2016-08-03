package com.jikexueyuan.Course16_2;

import java.util.LinkedList;
import java.util.Queue;

import org.junit.Test;

/**
 * 二叉树的遍历类
 *
 */
public class BinaryTreeTraversal {
/**
 * 先序遍历
 */
public static <T> void preOrder(TreeNode<T> node){
	if(node==null){
		return;
	}else{
	/*	if(node.value.equals(new Integer(7))){
			System.out.println("Hello!");
		}*/
		System.out.println(node.value);
		preOrder(node.leftChild);
		preOrder(node.rightChild);
	}
}
/**
 * 中序遍历
 */
public static <T> void inOrder(TreeNode<T> node){
	if(node!=null){
		inOrder(node.leftChild);
		System.out.println(node.value);
		inOrder(node.rightChild);
	}
}
/**
 * 后序遍历
 */
public static <T> void postOrder(TreeNode<T> node){
	if(node!=null){
		postOrder(node.leftChild);
		postOrder(node.rightChild);
		System.out.println(node.value);
	}
}
/**
 * 层序遍历
 */
public static <T> void levelOrder(TreeNode<T> root){
	Queue<TreeNode<T>> queue=new LinkedList<TreeNode<T>>();
	queue.offer(root);
	while(!queue.isEmpty()){
		TreeNode<T> node=queue.poll();
		System.out.println(node.value);
		if(node.leftChild!=null){
			queue.offer(node.leftChild);
		}
		if(node.rightChild!=null){
			queue.offer(node.rightChild);
		}
	}
}
@Test
public void testPreOrder(){
	Integer[] array={1,2,3,4,5,null,6,null,null,null,null,7};
	Integer nullValue=null;
	TreeNode<Integer> root=CreateBinaryTree.arrayToBinaryTree(array, nullValue);
	preOrder(root);
}
@Test
public void testInOrder(){
	String[] array={"1","2","3","4","5","#","6","#","#","#","#","7"};
	String nullValue="#";
	TreeNode<String> root=CreateBinaryTree.arrayToBinaryTree(array, nullValue);
	inOrder(root);
}
@Test
public void testPostOrder(){
	Department[] array={new Department(1),new Department(2),new Department(3),
			new Department(4),new Department(5),null,new Department(6),
			null,null,null,null,new Department(7)};
	Department nullValue=null;
	TreeNode<Department> root=CreateBinaryTree.arrayToBinaryTree(array, nullValue);
	postOrder(root);
}
@Test
public void testLevelOrder(){
	Integer[] array={1,2,3,4,5,null,6,null,null,null,null,7};
	Integer nullValue=null;
	TreeNode<Integer> root=CreateBinaryTree.arrayToBinaryTree(array, nullValue);
	levelOrder(root);
}
}
