package com.jikexueyuan.Course06_5;

import org.junit.Test;

/**
 * http://wiki.jikexueyuan.com/project/kmp-algorithm/define.html
 * 仔细研读、多举例、多调试!
 */
public class _028KMP {
	/**
	 * 时间复杂度O(M+N)
	 */
	public int strStr(String haystack,String needle) {
		if(needle.length()== 0){
			return 0;
		}
		return kmpSearch(haystack,needle);
	}
	/**
	 *求next数组，时间复杂度O(N)，准确来说，不超�?N,N表示模式串p的长�?
	 *k表示前一个指针，j表示后一个指�?
	 2种情况：
	 *情况1：如果k越界，或者p[k]==p[j]，直接赋�?
	 *情况2：否则，将k�?��移动
	 */
	public int[] getNext(String p) {
		int n=p.length();
		int[] next=new int[n];
		next[0]=-1;
		int k=-1;
		int j=0;
		while(j<n-1){
			//情况1
			if(k==-1||p.charAt(k)==p.charAt(j)){
				k++;
				j++;
				/*假设p="ABCDABD",k=1,j=5
				 也就是p的第�?��'B'与第二个'B'相等的情�?那么第二�?D'位置的next值就�?
				�?next[6]=2
				 */
				/*if(p.equals("ABCDABD")&&k==2&&j==6){
					System.out.println("next"+"["+j+"]="+k);
				}*/
				next[j]=k;
			} else{
				//情况2
				/*如果不匹配，由于next[k]<k,将k�?��移动,�?��k位置之前的与j位置的字符是否相�?
				 假设p="AAAAABCD",k=4,j=5
				 */
				/*if(p.equals("AAAAABCD")){
					System.out.println("k="+k+",j="+j+",next["+k+"]="+next[k]);
				}*/
				k=next[k];
			}
		}
		return next;
	}
	/**
	 *KMP算法,时间复杂度O(M)，M表示文本串s的长�?
	 *2种情况：
	 *情况1：如果越界，或�?s[i]==p[j]，则i与j都往后移�?
	 *情况2：否则，将j移动到next[j]位置
	 */
	public int kmpSearch(String s,String p){
		int i=0;
		int j=0;
		int m=s.length();
		int n=p.length();
		int[] next=getNext(p);
		while(i<m&&j<n){
			//情况1
			if(j==-1||s.charAt(i)==p.charAt(j)){
				i++;
				j++;
			}else{
				//情况2
				/*"偷懒"的理解，只�?虑�?前缀与后�?��有重合区间�?的简单情�?
				假设:s="BBC ABCDAB ABCDABCDABDE";p="ABCDABD"
				1、s的第二个“AB”与p的第二个"AB"相等
				2、p的第�?��"AB"与p的第二个"AB"相等
				�?��必然�?s的第二个"AB"与p的第�?��"AB"相等,故�?，下�?��，可以直接检测s的第二个空格与p的�?C’字符是否匹�?
				如果还不理解，看这句话：y=z,x=z --> y=x*/
				/*if(s.equals("BBC ABCDAB ABCDABCDABDE")&&p.equals("ABCDABD")&&i==10&&j==6){
					System.out.println("下一步比较s�?+i+"位置的字符与p�?+next[j]+"位置的字符是否相�?);
				}*/
				j=next[j];
			}
		}
		if(j==n){
			return i-n;
		} else{
			return-1;
		}
	}
	
	@Test
	public void test(){
		String s="AABAABAC AAAAABCD CD";
		String p="AAAAABCD";
		System.out.println(strStr(s, p));
		System.out.println(s.indexOf(p));
		s="BBC ABCDAB ABCDABCDABDE";
		p="ABCDABD";
		System.out.println(strStr(s, p));
		System.out.println(s.indexOf(p));
	}
}
