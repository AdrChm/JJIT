import java.awt.GridLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Program to display greetings to all 9 planets, in a window.
public class HelloSolarSystem extends JFrame{

	// Constructor
	public HelloSolarSystem()
	{
		setTitle("Hello Solar System");
		Container contents = getContentPane();
		// Set layout to be a grid of 3 columns.
		// This will also give 3 rows, as there are 9 items.
		contents.setLayout( new GridLayout(0, 3,20, 10));

		contents.add(new JLabel("Hello Mercury!"));
		contents.add(new JLabel("Hello Venus!"));
		contents.add(new JLabel("Hello Earth!"));
		contents.add(new JLabel("Hello Mars!"));
		contents.add(new JLabel("Hello Jupiter!"));
		contents.add(new JLabel("Hello Saturn!"));
		contents.add(new JLabel("Hello Uranus!"));
		contents.add(new JLabel("Hello Neptune!"));
		contents.add(new JLabel("Goodbye Pluto!"));

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
	} // HelloSolarSystem

	// Create a HelloSolarSystem and make it appear on screen.
	public static void main(String [] args){
		HelloSolarSystem theHelloSolarSystem = new HelloSolarSystem();
		theHelloSolarSystem.setVisible(true);
	} // main

} // class HelloSolarSystem