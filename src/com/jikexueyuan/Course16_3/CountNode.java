package com.jikexueyuan.Course16_3;

import java.util.LinkedList;
import java.util.Queue;

import com.jikexueyuan.Course16_2.TreeNode;

public class CountNode<T> {
public int count=0;
/**
 * 统计结点个数，先序遍历法
 */
public void preOrder(TreeNode<T> node){
	if(node!=null){
		count++;
		preOrder(node.leftChild);
		preOrder(node.rightChild);
	}
}
/**
 * 统计结点个数，后序遍历法
 */
public int postOrder(TreeNode<T> node){
	if(node==null){
		return 0;
	}else{
		int leftCnt=postOrder(node.leftChild);
		int rightCnt=postOrder(node.rightChild);
		return leftCnt+rightCnt+1;
	}
}
/**
 * 统计叶子节点个数，中序遍历法
 */
public void inOrder(TreeNode<T> node){
	if(node!=null){
		inOrder(node.leftChild);
		if(node.leftChild==null&&node.rightChild==null){
			count++;
		}
		inOrder(node.rightChild);
	}
}
/**
 * 统计叶子节点个数，先序遍历法
 */
public int countLeaf(TreeNode<T> node){
	if(node==null){
		return 0;
	}else if(node.leftChild==null&&node.rightChild==null){
		return 1;
	}else{
		int leftLeaf=countLeaf(node.leftChild);
		int rightLeaf=countLeaf(node.rightChild);
		return leftLeaf+rightLeaf;
	}
}
/**
 * 统计值为x的节点个数，层序遍历法
 */
public void levelOrder(TreeNode<T> root,T x){
	Queue<TreeNode<T>> queue=new LinkedList<TreeNode<T>>();
	queue.offer(root);
	int cnt=0;
	while(!queue.isEmpty()){
		TreeNode<T> node=queue.poll();
		if(node.value.equals(x)){
			cnt++;
		}
		if(node.leftChild!=null){
			queue.offer(node.leftChild);
		}
		if(node.rightChild!=null){
			queue.offer(node.rightChild);
		}
	}
	System.out.println(cnt);
}
}
