package collectionandarray;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	
	public static void main(String[] args) {
		
		int[] arr = new int[3];
		arr[0]=3;
		arr[1]=9;
		arr[2]=8;
		//System.out.println(arr);
		//System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		for(int a : arr) {
			System.out.println(a);
		}
		
		int[] as = new int[3];
		for(int i=0;i<as.length;i++) {
			as[i]=i;
		}
		System.out.println(Arrays.toString(as));
		
		int[][] twod = {{1,2,3},
				        {4,5,6},
				        {7,8,9}};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(twod[i][j]+ " ");
			}
			System.out.println();
		}
		
		for(int i=0;i<3;i++) {
		System.out.println(Arrays.toString(twod[i]));
		}
		System.out.println(twod.length);
	
		Scanner sc = new Scanner(System.in);
		
		Array n =new Array();
	int[] array = {3,5,9,2,7,1};
	//n.swaparray(array,3,5);
	n.maxOfArray(array);
    n.revArray(array);
    n.revArray2(array,1,2);
}
	public void swaparray(int[] ar,int i,int j) {
		
		int temp = ar[i];
		ar[i] = ar[j];
		ar[j] = temp;
		System.out.println(Arrays.toString(ar));
		
	}
	
	public void maxOfArray(int[] ar) {
		
		int max = ar[0];
		for(int i=1;i<ar.length;i++) {
			if(ar[i]>max) {
				max = ar[i];
			}
		}
		System.out.println(max);
		}
	
	public void revArray(int[] ar2) {
		
		int[] ar3 = new int[ar2.length];
		int j = 0;
		
		for(int i=(ar2.length-1);i>=0;i--) {
			
			ar3[j] = ar2[i];
			j++;
			
			}
		ar2 = ar3;
		System.out.println(Arrays.toString(ar2));
		}
	
	public void revArray2(int[] ar,int start,int end) {
	
		start = 0;
		end = ar.length-1;
		
		while(start<end) {
		
			int temp = ar[start];
			ar[start] = ar[end];
			ar[end] = temp;
			start++;
			end--;
			}
		System.out.println(Arrays.toString(ar));		
		
		
		
	}
	
	
	
	
}
