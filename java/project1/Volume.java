package project1;

public class Volume {
	static int volume(int len, int hei, int bth){
		int vol = len*hei*bth;
		return vol;
	}
	static void recvol(int length, int bredth){
		int rec = length*bredth;
		System.out.println("Rectangle: "+ rec);
	}

	public static void main(String[] args) {
	    int var = volume(10,5,4);
	    System.out.println("Volume: "+var);
	    recvol(10,5);
	    int n=10, sum=0;
	    for(int i=0; i<=n; i++)
	    {
	    	sum = sum+i;
	    }
	    System.out.println("Sum -of-NaturalNumbers: "+sum);
	}
}


