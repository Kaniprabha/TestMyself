package project1;

public class week2day2 {
	public static void main(String[] args) {
		String test = "I am a Software Tester.", revStr = "";
			
		char[] testArray = test.toCharArray();
		String[] variable = test.split(" ");		
			
		for(int i=0; i<variable.length; i++) {
			char var = test.charAt(i);
			revStr = var+revStr;
		
		
			if(variable[i].length()%2 ==0) {
				//if(variable[i]==i(1) && variable[i]) {
					
				//}
				System.out.println(variable[i]);
		    }
		}		
			
		

	}
}


