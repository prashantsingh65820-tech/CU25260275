import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class TemperatureConverter extends JFrame implements ActionListener {
    JTextField temperature;
    JRadioButton cToF, fToC;
    ButtonGroup group;
    JButton convert, clear;
    JLabel result;

    TemperatureConverter() {
        setTitle("Temperature Converter");
        setSize(350, 250);
        setLayout(new GridLayout(5, 2, 10, 10));

        add(new JLabel("Temperature:"));
        temperature = new JTextField();
        add(temperature);

        cToF = new JRadioButton("Celsius to Fahrenheit");
        fToC = new JRadioButton("Fahrenheit to Celsius");

        group = new ButtonGroup();
        group.add(cToF);
        group.add(fToC);
        cToF.setSelected(true);

        add(cToF);
        add(fToC);

        convert = new JButton("Convert");
        clear = new JButton("Clear");

        add(convert);
        add(clear);

        result = new JLabel("Result: ");
        add(result);

        convert.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert) {
            try {
                double temp = Double.parseDouble(temperature.getText());
                double converted;

                if (cToF.isSelected()) {
                    converted = (temp * 9 / 5) + 32;
                    result.setText("Result: " + converted + " °F");
                } else {
                    converted = (temp - 32) * 5 / 9;
                    result.setText("Result: " + converted + " °C");
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this,
                    "Please enter a valid temperature.");
            }

        } else {
            temperature.setText("");
            result.setText("Result: ");
            cToF.setSelected(true);
        }
    }

    public static void main(String[] args) {
        new TemperatureConverter();
    }
}