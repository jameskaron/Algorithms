package sort;

import java.util.Scanner;

/***
 *   Ͱ����
 */
public class BucketSort {

	public  static void bucketSort(){
		int [] book = new int[10];
		int i,j,t,n;
		//��ʼ������
		for (i = 0; i <= 9; i++) {
			book[i] = 0;
		}
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		//ѭ������n������������Ͱ����
		for (i = 0; i < n; i++) {
			//��ÿһ��������t��
			t = scan.nextInt();
			//���м������Ա��Ϊt��Ͱ��һ������
			book[t]++;
		}
		//�����жϱ��10~1��Ͱ(�Ӵ�С���У�
		for ( i = 9; i >= 0 ; i--) {
			//�����˼��ξͽ�Ͱ�ı�Ŵ�ӡ����
			for ( j = 0; j < book[i]; j++) {
				System.out.println(i+" ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		bucketSort();
	}
}
