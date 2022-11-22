package coding;

import java.util.Arrays;

public class FindBiggerofThree {
	int BiggestNum(int...args) {
		
		for(int i=0;i<args.length;i++) {
			for(int j=i;j>0;j--) {
				if(args[j-1]>args[j]) {
					int temp;
					temp=args[j-1];
					args[j-1]=args[j];
					args[j]=temp;
					
				}
				
				
				
			}
			
			
		}

		
		
		
		return args[args.length-1];
		
		
		
		
	}
	public static void main(String[] args) {
		
		FindBiggerofThree fbt=new FindBiggerofThree();
		System.out.println(fbt.BiggestNum(4, 15,7));
		
		
		
		
	}
}
