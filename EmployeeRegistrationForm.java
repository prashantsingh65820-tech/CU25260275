import java.awt.*;
import java.awt.event.*;

class EmployeeRegistrationForm extends Frame implements ActionListener {
    TextField id, name, designation, salary;
    Choice department;
    Checkbox male, female;
    CheckboxGroup gender;
    TextArea result;
    Button submit, clear;

    EmployeeRegistrationForm() {
        setTitle("Employee Registration");
        setSize(450, 450);
        setLayout(new GridLayout(8, 2, 8, 8));

        add(new Label("Employee ID:"));
        id = new TextField();
        add(id);

        add(new Label("Employee Name:"));
        name = new TextField();
        add(name);

        add(new Label("Department:"));
        department = new Choice();
        department.add("IT");
        department.add("HR");
        department.add("Finance");
        department.add("Sales");
        add(department);

        add(new Label("Designation:"));
        designation = new TextField();
        add(designation);

        add(new Label("Salary:"));
        salary = new TextField();
        add(salary);

        add(new Label("Gender:"));
        gender = new CheckboxGroup();
        male = new Checkbox("Male", gender, true);
        female = new Checkbox("Female", gender, false);

        Panel p = new Panel();
        p.add(male);
        p.add(female);
        add(p);

        submit = new Button("Submit");
        clear = new Button("Clear");
        add(submit);
        add(clear);

        result = new TextArea("", 4, 30, TextArea.SCROLLBARS_VERTICAL_ONLY);
        add(result);

        submit.addActionListener(this);
        clear.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            try {
                double pay = Double.parseDouble(salary.getText());

                if (pay < 0) {
                    result.setText("Salary cannot be negative.");
                    return;
                }

                result.setText(
                    "Employee ID: " + id.getText() +
                    "\nName: " + name.getText() +
                    "\nDepartment: " + department.getSelectedItem() +
                    "\nDesignation: " + designation.getText() +
                    "\nSalary: " + pay +
                    "\nGender: " + gender.getSelectedCheckbox().getLabel()
                );

            } catch (NumberFormatException ex) {
                result.setText("Enter a valid salary.");
            }

        } else {
            id.setText("");
            name.setText("");
            designation.setText("");
            salary.setText("");
            department.select(0);
            gender.setSelectedCheckbox(male);
            result.setText("");
        }
    }

    public static void main(String[] args) {
        new EmployeeRegistrationForm();
    }
}