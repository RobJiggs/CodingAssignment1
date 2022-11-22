package coding;

public class SwapNumber {
	void Swap1(int a, int b) {
		
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("a is now,"+ a+ " b is now, "+ b);
	}
	void Swap2(int a, int b) {
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is now,"+ a+ " b is now, "+ b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a =15;
        int b=12;
      SwapNumber sn= new SwapNumber();
      sn.Swap1(a, b);
      sn.Swap2(a, b);
		
		
	}

}
