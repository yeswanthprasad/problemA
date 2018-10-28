package exam;

import java.util.Scanner;

public class ProblemA {
  public static void main(String[] args) {
	  int array[] = new int[100];
	  int n;
	  int m;
	  boolean flag = false;
	  Scanner sc = new Scanner(System.in);
	  n = sc.nextInt();
	  m = sc.nextInt();
	  while(flag == false) {
		  for(int i=1; i<=n; i++) {
	            for(int j=1; j<=m; j++) {
	                array[i+j]++;
	            }
	        }
		  if (flag) {
			  System.out.println("/n");
		  }
		  flag = true;
		  int ma = 0;
		  for(int i=0; i<=n+m; i++) 
			  ma = Math.max(ma, array[i]);
	        for(int i=0; i<=n+m; i++) {
	            if(array[i] == ma)
	            	System.out.println(+i);
	            }
		  
	  }
	  
  }
}
