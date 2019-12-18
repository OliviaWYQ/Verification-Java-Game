import javax.swing.JFrame;

/**
 * The main class for your arcade game.
 * 
 * You can design your game any way you like, but make the game start
 * by running main here.
 * 
 * Also don't forget to write javadocs for your classes and functions!
 * 
 * @author Buffalo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Write your cool arcade game here!");

//		------ test null pointer start ------

//		// Initializing String variable with null value
//		String ptr = null;
//
//		// Checking if ptr.equals null or works fine.
//		try
//		{
//			// This line of code throws NullPointerException
//			// because ptr is null
//			if (ptr.equals("gfg"))
//				System.out.print("Same");
//			else
//				System.out.print("Not Same");
//		}
//		catch(NullPointerException e)
//		{
//			System.out.print("NullPointerException Caught");
//		}

//		------ test null pointer end  ------


//		------test start------
//		add a simple bug
//
//		String string1="test1";
//		String string2="test1";
//
//		if(string1.equals(string2)) {
//			throw new RuntimeException("string1 is equal to string2");
//		}
//		------test end------


		JFrame frame = new JFrame("Centipede");

		CentipedeComponent game = new CentipedeComponent();
		game.setFocusable(true);
		game.requestFocusInWindow();
		frame.add(game);
		Thread thread = new Thread(game);
		thread.start();

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
