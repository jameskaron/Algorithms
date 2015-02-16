package sort;

import java.util.Scanner;

/***
 *   桶排序
 */
public class BucketSort {

	public  static void bucketSort(){
		int [] book = new int[10];
		int i,j,t,n;
		//初始化数组
		for (i = 0; i <= 9; i++) {
			book[i] = 0;
		}
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		//循环读入n个数，并进行桶排序
		for (i = 0; i < n; i++) {
			//把每一个数读到t中
			t = scan.nextInt();
			//进行计数，对编号为t的桶放一个棋子
			book[t]++;
		}
		//依次判断编号10~1的桶(从大到小排列）
		for ( i = 9; i >= 0 ; i--) {
			//出现了几次就将桶的编号打印几次
			for ( j = 0; j < book[i]; j++) {
				System.out.println(i+" ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		bucketSort();
	}
}
