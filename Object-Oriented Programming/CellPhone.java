package objectOrientedProgramming;

public class CellPhone {
	
public void ringing() {
	System.out.println("The Cellphone is Ringing...");
}

public void vibreating() {
	System.out.println("The cellphone is Vibrating...");
}

	public static void main(String[] args) {
		CellPhone realme=new CellPhone();
		realme.ringing();
		realme.vibreating();

	}

}
