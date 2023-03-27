import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Container;
import java.awt.FlowLayout;

// Program to greet my family members.
public class HelloFamily extends JFrame
{
	public HelloFamily()
	{
		setTitle("Hello family!");
		Container content = getContentPane();
		content.setLayout(new FlowLayout());
		content.add(new JLabel("Hello Adam!"));
		content.add(new JLabel("Hello Adrian!"));
		content.add(new JLabel("Hello Dorota!"));
		content.add(new JLabel("Hello Grzegorz!"));
		content.add(new JLabel("Hello Jola!"));
		content.add(new JLabel("Hello Lucyna!"));
		content.add(new JLabel("Hello Marek!"));
		content.add(new JLabel("Hello Milena!"));
		content.add(new JLabel("Hello Paulina!"));
		content.add(new JLabel("Hello Paweł!"));
		content.add(new JLabel("Hello Regina!"));
		content.add(new JLabel("Hello Tomek!"));

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();

	} // HelloFamily

	// Generated HelloFamily class and make it appear on screen.
	public static void main(String [] args)
	{
		HelloFamily theHelloFamily = new HelloFamily();
		theHelloFamily.setVisible(true);
	} // main

} // class HelloFamily