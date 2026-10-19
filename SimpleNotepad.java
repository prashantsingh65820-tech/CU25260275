import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class SimpleNotepad extends JFrame implements ActionListener {
    JTextArea textArea;
    JMenuItem newItem, openItem, saveItem, exitItem;

    SimpleNotepad() {
        setTitle("Simple Notepad");
        setSize(600, 400);

        textArea = new JTextArea();
        add(new JScrollPane(textArea));

        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");

        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        fileMenu.addSeparator();
        fileMenu.add(exitItem);

        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            textArea.setText("");

        } else if (e.getSource() == openItem) {
            JFileChooser chooser = new JFileChooser();

            if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                try (BufferedReader br = new BufferedReader(
                        new FileReader(chooser.getSelectedFile()))) {

                    textArea.read(br, null);

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                        "Error opening file: " + ex.getMessage());
                }
            }

        } else if (e.getSource() == saveItem) {
            JFileChooser chooser = new JFileChooser();

            if (chooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                File file = chooser.getSelectedFile();

                if (file.exists()) {
                    int choice = JOptionPane.showConfirmDialog(
                        this,
                        "File already exists. Overwrite?",
                        "Confirm Save",
                        JOptionPane.YES_NO_OPTION
                    );

                    if (choice != JOptionPane.YES_OPTION)
                        return;
                }

                try (BufferedWriter bw = new BufferedWriter(
                        new FileWriter(file))) {

                    bw.write(textArea.getText());

                    JOptionPane.showMessageDialog(this,
                        "File saved successfully.");

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this,
                        "Error saving file: " + ex.getMessage());
                }
            }

        } else if (e.getSource() == exitItem) {
            dispose();
        }
    }

    public static void main(String[] args) {
        new SimpleNotepad();
    }
}