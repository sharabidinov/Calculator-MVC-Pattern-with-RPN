import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;

public class Viewer {
    private JTextField textField;

    public Viewer() {
        Controller controller = new Controller(this);

        Font fontTextField = new Font("Bernardo MT Condensed", Font.PLAIN, 25);

        textField = new JTextField();
        textField.setBounds(100, 100, 340, 50);
        textField.setFont(fontTextField);
        textField.setForeground(Color.RED);
        textField.setHorizontalAlignment(JTextField.RIGHT);

        Font font = new Font("Bernardo MT Condensed", Font.PLAIN, 25);

        JButton buttonOne = new JButton("1");
        buttonOne.setBounds(100, 250, 50, 50);
        buttonOne.setFont(font);
        buttonOne.setForeground(Color.RED);
        buttonOne.addActionListener(controller);
        buttonOne.setActionCommand("One");

        JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(160, 250, 50, 50);
        buttonTwo.setFont(font);
        buttonTwo.setForeground(Color.BLUE);
        buttonTwo.addActionListener(controller);
        buttonTwo.setActionCommand("Two");

        JButton buttonPlus = new JButton("+");
        buttonPlus.setBounds(100, 180, 100, 50);
        buttonPlus.setFont(font);
        buttonPlus.setForeground(Color.BLACK);
        buttonPlus.addActionListener(controller);
        buttonPlus.setActionCommand("Plus");

        JButton buttonMinus = new JButton("-");
        buttonMinus.setBounds(210, 180, 100, 50);
        buttonMinus.setFont(font);
        buttonMinus.setForeground(Color.RED);
        buttonMinus.addActionListener(controller);
        buttonMinus.setActionCommand("Minus");

        JButton buttonEqual = new JButton("=");
        buttonEqual.setBounds(340, 180, 100, 100);
        buttonEqual.setFont(font);
        buttonEqual.setForeground(Color.RED);
        buttonEqual.addActionListener(controller);
        buttonEqual.setActionCommand("Equal");

        JButton buttonClear = new JButton("C");
        buttonClear.setBounds(220, 250, 90, 50);
        buttonClear.setFont(font);
        buttonClear.setForeground(Color.MAGENTA);
        buttonClear.addActionListener(controller);
        buttonClear.setActionCommand("Clear");

        JFrame frame = new JFrame("Calculator MVC Pattern with RPN");
        frame.setSize(800, 500);
        frame.setLayout(null);
        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonClear);
        frame.add(buttonPlus);
        frame.add(buttonMinus);
        frame.add(buttonEqual);
        frame.add(textField);

        frame.setLocation(600, 300);
        frame.setVisible(true);
    }

    public void update(String value) {
        textField.setText(value);
    }
}