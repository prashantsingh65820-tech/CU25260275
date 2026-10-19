import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentMarksheet extends JFrame implements ActionListener {
    JTextField[] marks = new JTextField[5];
    String[] subjects = {
        "English", "Mathematics", "Java", "DBMS", "Computer Networks"
    };
    JButton calculate;

    StudentMarksheet() {
        setTitle("Student Marksheet");
        setSize(400, 350);
        setLayout(new GridLayout(6, 2, 10, 10));

        for (int i = 0; i < 5; i++) {
            add(new JLabel(subjects[i] + " Marks:"));
            marks[i] = new JTextField();
            add(marks[i]);
        }

        calculate = new JButton("Calculate Result");
        add(calculate);

        calculate.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int total = 0;

            for (JTextField field : marks) {
                int m = Integer.parseInt(field.getText());

                if (m < 0 || m > 100) {
                    JOptionPane.showMessageDialog(
                        this, "Marks must be between 0 and 100."
                    );
                    return;
                }

                total += m;
            }

            double percentage = total / 5.0;
            boolean pass = true;

            for (JTextField field : marks) {
                if (Integer.parseInt(field.getText()) < 33)
                    pass = false;
            }

            String grade;

            if (!pass)
                grade = "F";
            else if (percentage >= 90)
                grade = "A+";
            else if (percentage >= 80)
                grade = "A";
            else if (percentage >= 70)
                grade = "B";
            else if (percentage >= 60)
                grade = "C";
            else if (percentage >= 50)
                grade = "D";
            else
                grade = "E";

            String status = pass ? "Pass" : "Fail";

            JOptionPane.showMessageDialog(this,
                "Total Marks: " + total + "/500\n" +
                "Percentage: " + percentage + "%\n" +
                "Grade: " + grade + "\n" +
                "Result: " + status);

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter valid marks!");
        }
    }

    public static void main(String[] args) {
        new StudentMarksheet();
    }
}