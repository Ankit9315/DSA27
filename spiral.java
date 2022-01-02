package DSAFUNDAMENTALS;

import java.util.Scanner;

public class spiral {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int top=0;
		int left=0;
		int bottom=arr.length-1;
		int right=arr[0].length-1;
		int dir=0;
		while(top<=bottom && left<=right) {
			if(dir==0) {
				for(int i=left;i<right;i++) {
					System.out.print(arr[top][i]);
					top++;
						
				}
			}
			else if(dir==1) {
				for(int i=top;i>bottom;i++) {
					System.out.print(arr[i][right]);
					right--;
						
				}
			}
			else if(dir==2) {
				for(int i=right;i>left;i++) {
					System.out.print(arr[bottom][i]);
					bottom--;
						
				}
			}else if(dir==3) {
				for(int i=bottom;i<top;i++) {
					System.out.print(arr[i][left]);
					left++;
						
				}
			}
			dir=(dir+1)%4;
		}

	}

}
