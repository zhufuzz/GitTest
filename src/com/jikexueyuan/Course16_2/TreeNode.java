package com.jikexueyuan.Course16_2;

/**
 * 二叉树的节点
 */
public class TreeNode<T>{
	public T value;
	public TreeNode<T> leftChild;
	public TreeNode<T> rightChild;
	public TreeNode( T value,TreeNode<T> leftChild, TreeNode<T> rightChild) {
		super();
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.value = value;
	}
	public TreeNode(T value) {
		super();
		this.value = value;
	}
	@Override
	public String toString() {
		return "TreeNode [value=" + value + "]";
	}
}