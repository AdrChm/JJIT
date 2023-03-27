import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
// Program to display hello world greeting in a window.
public class HelloWorld extends JFrame{

    // Constructor
    public HelloWorld()
    {
        setTitle("Hello World");
        Container contents = getContentPane();
        contents.add(new JLabel("Bonjour le monde!"));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    } // HelloWorld

    // Create a HelloWorld and make it appear on screen.
    public static void main(String[] args) {
        HelloWorld theHelloWorld = new HelloWorld();
        theHelloWorld.setVisible(true);

        HelloWorld secondWindow = new HelloWorld();
        secondWindow.setVisible(true);
    } // main

} // class HelloWorld
