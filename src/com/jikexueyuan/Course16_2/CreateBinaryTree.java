package com.jikexueyuan.Course16_2;

import java.util.ArrayList;
import java.util.List;


public class CreateBinaryTree {
/**
 * 数组表示法转换为二叉链表
 */
public static <T> TreeNode<T> arrayToBinaryTree(T[] array,T nullValue){
	if(array==null||array.length==0){
		return null;
	}else{
		List<TreeNode<T>> tempList=new ArrayList<TreeNode<T>>();
		TreeNode<T> root=new TreeNode<T>(array[0]);
		tempList.add(root);
		int index=1;
		loop:
		while(tempList.size()>0&&index<array.length){
			List<TreeNode<T>> newList=new ArrayList<TreeNode<T>>();
			for(TreeNode<T> node:tempList){
				if(index==array.length){
					break loop;
				}
				if(array[index]!=null&&!array[index].equals(nullValue)){
					node.leftChild=new TreeNode<T>(array[index]);
					newList.add(node.leftChild);
				}
				index++;
				if(index==array.length){
					break loop;
				}
				if(array[index]!=null&&!array[index].equals(nullValue)){
					node.rightChild=new TreeNode<T>(array[index]);
					newList.add(node.rightChild);
				}
				index++;
			}
			tempList=newList;
		}
		return root;
	}
}

}
