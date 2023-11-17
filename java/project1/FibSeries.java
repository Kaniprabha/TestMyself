package project1;

public class FibSeries {

	public static void main(String[] args) {
		int n = 10, first = 0, sec = 1;
		System.out.println("FibSeries till "+ n+"terms.");
		System.out.println();
		for(int i=1;i<=n;++i) {
			System.out.println(first+",");
			int c = first+sec;
			first = sec;
			sec = c;
		}
		//palindrome
		int palin= 12521, reversed= 0, remainder;
		while(palin!=0) {
			remainder = palin%10;
			reversed = reversed*10+remainder;
			palin/=10;			
		}
		if(palin == reversed) {
			System.out.println("Given Number is Palindrome.");
		}
		else {
			System.out.println("Given Number is Not Palidrome.");
		}
	}
}
