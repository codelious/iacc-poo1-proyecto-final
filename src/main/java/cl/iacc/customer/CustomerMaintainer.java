package cl.iacc.customer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerMaintainer extends JFrame implements ActionListener {

    private final JTextField txtId;
    private final JTextField txtName;
    private final JTextField txtAddress;
    private final JTextField txtPhone;
    private final JTextField txtEmail;
    private final JButton btnAdd;

    private final CustomerController customerController;

    public CustomerMaintainer() {
        customerController = new CustomerController();

        setTitle("Mantenedor de Clientes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblId = new JLabel("ID:");
        lblId.setBounds(20, 20, 80, 25);
        add(lblId);

        txtId = new JTextField();
        txtId.setBounds(100, 20, 200, 25);
        add(txtId);

        JLabel lblName = new JLabel("Nombre:");
        lblName.setBounds(20, 60, 80, 25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(100, 60, 200, 25);
        add(txtName);

        JLabel lblAddress = new JLabel("Dirección:");
        lblAddress.setBounds(20, 100, 80, 25);
        add(lblAddress);

        txtAddress = new JTextField();
        txtAddress.setBounds(100, 100, 200, 25);
        add(txtAddress);

        JLabel lblPhone = new JLabel("Teléfono:");
        lblPhone.setBounds(20, 140, 80, 25);
        add(lblPhone);

        txtPhone = new JTextField();
        txtPhone.setBounds(100, 140, 200, 25);
        add(txtPhone);

        txtEmail = new JTextField();
        txtEmail.setBounds(100, 140, 200, 25);
        add(txtEmail);

        btnAdd = new JButton("Agregar");
        btnAdd.setBounds(150, 180, 100, 25);
        btnAdd.addActionListener(this);
        add(btnAdd);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            String id = txtId.getText();
            String name = txtName.getText();
            String address = txtAddress.getText();
            String phone = txtPhone.getText();
            String email = txtEmail.getText();

            Customer customer = new Customer(id, name, address, phone, email);
            customerController.add(customer);

            JOptionPane.showMessageDialog(this, "Cliente agregado correctamente.");

            cleanFields();
        }
    }

    private void cleanFields() {
        txtId.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
    }
}
