package com.jikexueyuan.Course17_3;

import com.jikexueyuan.Course17_common.TreeNode;

/**
 * 最小深度
 */
public class _111MinimumDepth {
	public int min = Integer.MAX_VALUE / 2;
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		preOrder(root, 1);
		return min;
	}
	public void preOrder(TreeNode p, int level) {
		if (p != null) {
			if (p.left == null && p.right == null) {
				if (level < min) {
					min = level;
				}
			}
			preOrder(p.left, level + 1);
			preOrder(p.right, level + 1);
		}
	}
}
