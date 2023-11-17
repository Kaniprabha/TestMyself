package project1;


public class Chocolate {
	String myorder;
	// 1method:
    public void cadbury(int cadburycount) {
    	System.out.println("I want " +cadburycount+ " Chocolates." );
    	
    }
    public String cadbury(int cadbury, String cadburyType) {
    	String var = cadbury+cadburyType;
    	return var;
    }
    
    // 2method:
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Chocolate obj = new Chocolate();
        obj.cadbury(10);
        String varname = obj.cadbury(5, "DairyMilk");
        System.out.println("Prefer: I need "+ varname);
	}

}
