package com.jikexueyuan.Course17_1;

import org.junit.Test;

import com.jikexueyuan.Course17_common.CreateBinaryTree;
import com.jikexueyuan.Course17_common.TreeNode;

/**
打印每个节点所在的层数
 */
public class PrintTreeLevel {
	public void printLevel(TreeNode root) {
		preOrder(root, 1);
	}
	public void preOrder(TreeNode p, int level) {
		if (p != null) {
			System.out.println(p.val + " " + level);
			preOrder(p.left, level + 1);
			preOrder(p.right, level + 1);
		}
	}
	@Test
	public void test() {
		Integer[] array = {1, 2, 3, 4, 5, null, 6, null, null, null, 7, 8};
		TreeNode root = CreateBinaryTree.arrayToBinaryTree(array);
		preOrder(root, 1);
	}
}
