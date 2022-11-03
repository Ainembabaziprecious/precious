import java.util.Scanner;

public class Ainembabazi {

	public static void main(String[] args) {
	
int ans =0;
		
		Scanner input =new Scanner(System.in);
	System.out.println("Enter the first and second number");
	
	int a =input.nextInt();
	int b =input.nextInt();
	System.out.println("Enter the operator:+,*,/,_,");
	char op =input.next().charAt(0);
	
	if( op == '+') {
		ans = a+b;
		
	}
	else if(op=='-') {
		
		ans =a-b;
	}
	
else if(op=='*') {
		
		ans =a*b;
	}
	
	
	
else if(op=='/') {
	
	ans =a/b;
}
			
	System.out.println("answer is"+""+ans);		
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
