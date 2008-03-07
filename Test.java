import persistentie.PersistentieController;
import javax.swing.*;

public class Test {
	
	public static void main(String[] args) 
	{
		PersistentieController test = PersistentieController.getInstance();;
		test.geefKlanten();
		System.out.print(test);
	}
	
}
