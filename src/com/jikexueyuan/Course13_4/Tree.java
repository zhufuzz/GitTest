package com.jikexueyuan.Course13_4;
class TreeNode<T> {
	T value;
	TreeNode<T> left;
	TreeNode<T> right;
	public TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}
	public TreeNode(T value) {
		super();
		this.value = value;
	}
}
public class Tree {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Integer[] array = {6, 3, 7, 8, 2, 5, 4};
		TreeNode<Integer> root = new TreeNode<Integer>(6,
				new TreeNode<Integer>(3, new TreeNode<Integer>(8),
						new TreeNode<Integer>(2)), new TreeNode<Integer>(7,
						new TreeNode<Integer>(5), new TreeNode<Integer>(4)));
	}
}
