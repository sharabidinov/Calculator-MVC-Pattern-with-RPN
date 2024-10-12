import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Color;

public class Viewer {
    public Viewer() {
        Controller controller = new Controller(this);

        Font font = new Font("Bernardo MT Condensed", Font.PLAIN, 25);

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(100, 250, 50, 50);
        buttonOne.setFont(font);
        buttonOne.setForeground(Color.RED);
        buttonOne.addActionListener(controller);

        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(160, 250, 50, 50);
        buttonTwo.setFont(font);
        buttonTwo.setForeground(Color.BLUE);
        buttonTwo.addActionListener(controller);

        JFrame frame = new JFrame("Calculator MVC Pattern with RPN");
        frame.setSize(800, 500);
        frame.setLayout(null);
        frame.add(buttonOne);
        frame.add(buttonTwo);
        // frame.add(buttonLambdas);
        // frame.add(buttonAnonimous);
        // frame.add(buttonInner);
        // frame.add(buttonMVC);
        // frame.add(buttonThis);
        frame.setLocation(600, 300);
        frame.setVisible(true);
    }
}