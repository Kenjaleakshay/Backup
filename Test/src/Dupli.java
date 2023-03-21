import java.util.ArrayList;
	import java.util.Scanner;
public class Dupli {
	
	public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int cap = sc.nextInt();
			
			
			ArrayList<Integer> al = new ArrayList<>();
			
			int[] ar = new int[cap];
			
			for(int i=0;i<ar.length;i++) {
				
				ar[i]=sc.nextInt();
			}
			
			for(int i=0;i<ar.length;i++) {
				
				
				for(int j=i+1;j<ar.length;j++) {
					
					if(ar[i]==ar[j]) {
						
						al.add(ar[i]);
						
						
						
					}
				}
			}
			System.out.println(al);
			
			
			
			
		}
		
		
		
	}



