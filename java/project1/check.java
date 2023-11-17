package project1;

public class check { 
	static void CheckNumber(int num){
		if(num>0)
		    System.out.println("Number is Possitive(+ve)");
		else if(num<0)
		    System.out.println("Number is Negative(-ve)");
		else
		    System.out.println("It's Zero(0)");
	}

	public static void main(String[] args) {
		int no1 = 0;
		int no2 = -4;
		int no3 = 0;
		int no4 = 100;
		
		CheckNumber(no1);
		CheckNumber(no2);
		CheckNumber(no3);
		CheckNumber(no4);
		

	}

}
