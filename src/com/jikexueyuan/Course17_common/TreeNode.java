package com.jikexueyuan.Course17_common;

public class TreeNode {
	public int val;
	public TreeNode left;
	public TreeNode right;
	public TreeNode(int val, TreeNode left, TreeNode right) {
		super();
		this.val = val;
		this.left = left;
		this.right = right;
	}
	public TreeNode(int val) {
		super();
		this.val = val;
	}
	@Override
	public String toString() {
		return "TreeNode [val=" + val + "]";
	}

}
