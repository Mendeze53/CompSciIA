import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerInfoEntry {
    static JTextField fNameField, lNameField, emailField;
    static JTextField numField;
    public static void displayEngInfo() {
        JFrame InfEnt = new JFrame("Customer Information Entry");
        InfEnt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        InfEnt.setSize(500, 300);
        InfEnt.setLocationRelativeTo(null);

        JPanel labelsPanel = new JPanel(new GridLayout(4, 1));
        JLabel askFName = new JLabel("Enter your first name: ");
        JLabel askLName = new JLabel("Enter your last name: ");
        JLabel askEmail = new JLabel("Enter your email: ");
        JLabel askPhoNum = new JLabel("Enter your US phone number: ");

        fNameField = new JTextField(30);
        lNameField = new JTextField(50);
        emailField = new JTextField(50);
        numField = new JTextField(10);

        labelsPanel.add(askFName);
        labelsPanel.add(fNameField);
        labelsPanel.add(askLName);
        labelsPanel.add(lNameField);
        labelsPanel.add(askEmail);
        labelsPanel.add(emailField);
        labelsPanel.add(askPhoNum);
        labelsPanel.add(numField);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fName = fNameField.getText();
                String lName = lNameField.getText();
                String email = emailField.getText();
                long phoNum;
                try {
                    phoNum = Long.parseLong(numField.getText()); // Parse text to long
                    DataStorage.saveInfo(fName, lName, email, phoNum); // Save customer info
                } catch (NumberFormatException ex) {
                    // Handle invalid phone number input
                    JOptionPane.showMessageDialog(null, "Please enter a valid phone number.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
                }
                InfEnt.dispose();
            }
        });


        InfEnt.getContentPane().setLayout(new BorderLayout());
        InfEnt.getContentPane().add(labelsPanel, BorderLayout.CENTER);
        InfEnt.getContentPane().add(saveButton, BorderLayout.SOUTH);


        InfEnt.setVisible(true);
    }

    public static void displaySpaInfo() {
        JFrame InfEnt = new JFrame("Información del Usuario");
        InfEnt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        InfEnt.setSize(500, 300);
        InfEnt.setLocationRelativeTo(null);

        JPanel labelsPanel = new JPanel(new GridLayout(4, 1));
        JLabel askFName = new JLabel("Ingrese su primer nombre: ");
        JLabel askLName = new JLabel("Ingrese su apellido/nombre familiar: ");
        JLabel askEmail = new JLabel("Ingrese su correo electrónico: ");
        JLabel askPhoNum = new JLabel("Ingrese su número telefónico (E.E.U.U): ");

        fNameField = new JTextField(30);
        lNameField = new JTextField(50);
        emailField = new JTextField(50);
        numField = new JTextField(10);

        labelsPanel.add(askFName);
        labelsPanel.add(fNameField);
        labelsPanel.add(askLName);
        labelsPanel.add(lNameField);
        labelsPanel.add(askEmail);
        labelsPanel.add(emailField);
        labelsPanel.add(askPhoNum);
        labelsPanel.add(numField);

        JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String fName = fNameField.getText();
                String lName = lNameField.getText();
                String email = emailField.getText();
                long phoNum;
                try {
                    phoNum = Long.parseLong(numField.getText()); // Parse text to long
                    DataStorage.saveInfo(fName, lName, email, phoNum); // Save customer info
                } catch (NumberFormatException ex) {
                    // Handle invalid phone number input
                    JOptionPane.showMessageDialog(null, "Por favor ingrese un número valido.", "Entrada Inválida", JOptionPane.ERROR_MESSAGE);
                }
                InfEnt.dispose();
            }
        });


        InfEnt.getContentPane().setLayout(new BorderLayout());
        InfEnt.getContentPane().add(labelsPanel, BorderLayout.CENTER);
        InfEnt.getContentPane().add(saveButton, BorderLayout.SOUTH);


        InfEnt.setVisible(true);
    }

}