import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CourseSelectionForm extends JFrame implements ActionListener {
    JTextField name;
    JComboBox<String> course;
    JRadioButton male, female;
    ButtonGroup gender;
    JCheckBox java, python, dbms, ai;
    JButton submit, reset;

    CourseSelectionForm() {
        setTitle("Course Selection Form");
        setSize(400, 350);
        setLayout(new GridLayout(6, 2, 8, 8));

        add(new JLabel("Student Name:"));
        name = new JTextField();
        add(name);

        add(new JLabel("Course:"));
        course = new JComboBox<>(new String[]{
            "BCA", "BBA", "B.Tech", "MCA"
        });
        add(course);

        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel();

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
        male.setSelected(true);

        genderPanel.add(male);
        genderPanel.add(female);
        add(genderPanel);

        add(new JLabel("Subjects:"));
        JPanel subjectPanel = new JPanel();

        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        dbms = new JCheckBox("DBMS");
        ai = new JCheckBox("AI");

        subjectPanel.add(java);
        subjectPanel.add(python);
        subjectPanel.add(dbms);
        subjectPanel.add(ai);
        add(subjectPanel);

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
            String selectedGender =
                male.isSelected() ? "Male" : "Female";

            String selectedSubjects = "";

            if (java.isSelected()) selectedSubjects += "Java ";
            if (python.isSelected()) selectedSubjects += "Python ";
            if (dbms.isSelected()) selectedSubjects += "DBMS ";
            if (ai.isSelected()) selectedSubjects += "AI ";

            JOptionPane.showMessageDialog(this,
                "Name: " + name.getText() +
                "\nCourse: " + course.getSelectedItem() +
                "\nGender: " + selectedGender +
                "\nSubjects: " + selectedSubjects);

        } else {
            name.setText("");
            course.setSelectedIndex(0);
            gender.clearSelection();

            java.setSelected(false);
            python.setSelected(false);
            dbms.setSelected(false);
            ai.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new CourseSelectionForm();
    }
}