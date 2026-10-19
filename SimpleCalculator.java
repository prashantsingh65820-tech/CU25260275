import java.awt.*;
import java.awt.event.*;

class SimpleCalculator extends Frame implements ActionListener {
    TextField num1, num2;
    Label result;
    Button add, subtract, multiply, divide;

    SimpleCalculator() {
        setTitle("AWT Calculator");
        setSize(350, 250);
        setLayout(new GridLayout(5, 2, 5, 5));

        add(new Label("First Number:"));
        num1 = new TextField();
        add(num1);

        add(new Label("Second Number:"));
        num2 = new TextField();
        add(num2);

        add = new Button("Addition");
        subtract = new Button("Subtraction");
        multiply = new Button("Multiplication");
        divide = new Button("Division");

        add(add);
        add(subtract);
        add(multiply);
        add(divide);

        result = new Label("Result: ");
        add(result);

        add.addActionListener(this);
        subtract.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(num1.getText());
            double b = Double.parseDouble(num2.getText());
            double r;

            if (e.getSource() == add)
                r = a + b;
            else if (e.getSource() == subtract)
                r = a - b;
            else if (e.getSource() == multiply)
                r = a * b;
            else {
                if (b == 0) {
                    result.setText("Cannot divide by zero!");
                    return;
                }
                r = a / b;
            }

            result.setText("Result: " + r);

        } catch (NumberFormatException ex) {
            result.setText("Enter valid numbers!");
        }
    }

    public static void main(String[] args) {
        new SimpleCalculator();
    }
}