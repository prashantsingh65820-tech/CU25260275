import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StudentFeedbackForm extends JFrame implements ActionListener {
    JTextField name, roll, course;
    JRadioButton excellent, veryGood, good, average, poor;
    ButtonGroup rating;
    JCheckBox teaching, laboratory, material, assignments;
    JTextArea comments;
    JButton submit, reset;

    StudentFeedbackForm() {
        setTitle("Student Feedback Form");
        setSize(500, 500);
        setLayout(new GridLayout(8, 2, 5, 5));

        add(new JLabel("Student Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Roll Number:"));
        roll = new JTextField();
        add(roll);

        add(new JLabel("Course:"));
        course = new JTextField();
        add(course);

        add(new JLabel("Rating:"));
        JPanel ratingPanel = new JPanel(new FlowLayout());

        excellent = new JRadioButton("Excellent");
        veryGood = new JRadioButton("Very Good");
        good = new JRadioButton("Good");
        average = new JRadioButton("Average");
        poor = new JRadioButton("Poor");

        rating = new ButtonGroup();
        rating.add(excellent);
        rating.add(veryGood);
        rating.add(good);
        rating.add(average);
        rating.add(poor);

        ratingPanel.add(excellent);
        ratingPanel.add(veryGood);
        ratingPanel.add(good);
        ratingPanel.add(average);
        ratingPanel.add(poor);

        add(ratingPanel);

        add(new JLabel("Feedback Areas:"));
        JPanel areas = new JPanel(new FlowLayout());

        teaching = new JCheckBox("Teaching");
        laboratory = new JCheckBox("Laboratory");
        material = new JCheckBox("Course Material");
        assignments = new JCheckBox("Assignments");

        areas.add(teaching);
        areas.add(laboratory);
        areas.add(material);
        areas.add(assignments);
        add(areas);

        add(new JLabel("Comments:"));
        comments = new JTextArea(3, 20);
        add(new JScrollPane(comments));

        submit = new JButton("Submit");
        reset = new JButton("Reset");
        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String selectedRating = "Not selected";

            if (excellent.isSelected()) selectedRating = "Excellent";
            else if (veryGood.isSelected()) selectedRating = "Very Good";
            else if (good.isSelected()) selectedRating = "Good";
            else if (average.isSelected()) selectedRating = "Average";
            else if (poor.isSelected()) selectedRating = "Poor";

            String areas = "";

            if (teaching.isSelected()) areas += "Teaching, ";
            if (laboratory.isSelected()) areas += "Laboratory, ";
            if (material.isSelected()) areas += "Course Material, ";
            if (assignments.isSelected()) areas += "Assignments, ";

            if (areas.isEmpty())
                areas = "None selected";

            JOptionPane.showMessageDialog(this,
                "Student: " + name.getText() +
                "\nRoll Number: " + roll.getText() +
                "\nCourse: " + course.getText() +
                "\nRating: " + selectedRating +
                "\nFeedback Areas: " + areas +
                "\nComments: " + comments.getText());

        } else {
            name.setText("");
            roll.setText("");
            course.setText("");
            rating.clearSelection();

            teaching.setSelected(false);
            laboratory.setSelected(false);
            material.setSelected(false);
            assignments.setSelected(false);

            comments.setText("");
        }
    }

    public static void main(String[] args) {
        new StudentFeedbackForm();
    }
}