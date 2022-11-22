package coding;

import java.util.Arrays;

public class SecondMinMax {
	
	int[] SecondMin(int [] a){
		
		for(int i=0;i<a.length;i++) {
			for(int j=i;j>0;j--) {
				if(a[j-1]>a[j]) {
					int temp;
					temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					
				}
				
				
				
			}
			
			
		}
		int [] temp1= {a[a.length-2],a[1]};
		return temp1;
		
	}
	public static void main(String[] args) {
		int [] arr={10, 20, 5,7,15,22,4};
		
		SecondMinMax smm= new SecondMinMax();
		int [] arr2=smm.SecondMin(arr);
		System.out.println(Arrays.toString(arr2));
		
		
		
		
		
	}

}
