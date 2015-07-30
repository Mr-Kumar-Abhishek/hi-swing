import javax.swing.*;

public class hiswing extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public hiswing() {
		// Making sure we have a nice window decorations
		setDefaultLookAndFeelDecorated(true);
		//creating and setting up windows
		setTitle("Hi swing !!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Adding label with the text to be displayed.
		JLabel label =  new JLabel("Hi swinging here !!");
		getContentPane().add(label);
		//displaying window
		pack();
		setVisible(true);
	}
	
	public static void main(String[]args){
		@SuppressWarnings("unused")
		hiswing justswing = new hiswing();
		
	}

}
