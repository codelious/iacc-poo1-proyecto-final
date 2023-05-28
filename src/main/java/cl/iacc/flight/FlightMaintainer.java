package cl.iacc.flight;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalTime;

public class FlightMaintainer extends JFrame implements ActionListener {

    private final JTextField txtId;
    private final JTextField txtAircraftCode;
    private final JTextField txtOrigin;
    private final JTextField txtDestination;
    private final JTextField txtDate;
    private final JTextField txtTime;
    private final JTextField txtNumberOfSeats;
    private final JButton btnAdd;

    private FlightController flightController;

    public FlightMaintainer() {
        flightController = new FlightController();

        setTitle("Mantenedor de Vuelos");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblFlightId = new JLabel("ID de Vuelo:");
        lblFlightId.setBounds(20, 20, 140, 25);
        add(lblFlightId);

        txtId = new JTextField();
        txtId.setBounds(160, 20, 200, 25);
        add(txtId);

        JLabel lblAircraftCode = new JLabel("Código de aeronave:");
        lblAircraftCode.setBounds(20, 60, 140, 25);
        add(lblAircraftCode);

        txtAircraftCode = new JTextField();
        txtAircraftCode.setBounds(160, 60, 200, 25);
        add(txtAircraftCode);

        JLabel lblOrigin = new JLabel("Origen:");
        lblOrigin.setBounds(20, 100, 140, 25);
        add(lblOrigin);

        txtOrigin = new JTextField();
        txtOrigin.setBounds(160, 100, 200, 25);
        add(txtOrigin);

        JLabel lblDestination = new JLabel("Destino:");
        lblDestination.setBounds(20, 140, 140, 25);
        add(lblDestination);

        txtDestination = new JTextField();
        txtDestination.setBounds(160, 140, 200, 25);
        add(txtDestination);

        JLabel lblDate = new JLabel("Fecha:");
        lblDate.setBounds(20, 180, 140, 25);
        add(lblDate);

        txtDate = new JTextField();
        txtDate.setBounds(160, 180, 200, 25);
        add(txtDate);

        JLabel lblTime = new JLabel("Hora:");
        lblTime.setBounds(20, 220, 140, 25);
        add(lblTime);

        txtTime = new JTextField();
        txtTime.setBounds(160, 220, 200, 25);
        add(txtTime);

        JLabel lblNumerOfSeats = new JLabel("Numero de asientos");
        lblNumerOfSeats.setBounds(20, 260, 140, 25);
        add(lblNumerOfSeats);

        txtNumberOfSeats = new JTextField();
        txtNumberOfSeats.setBounds(160, 260, 200, 25);
        add(txtNumberOfSeats);

        btnAdd = new JButton("Agregar");
        btnAdd.setBounds(160, 300, 100, 25);
        btnAdd.addActionListener(this);
        add(btnAdd);
    }


    private void cleanFields() {
        txtId.setText("");
        txtAircraftCode.setText("");
        txtOrigin.setText("");
        txtDestination.setText("");
        txtDate.setText("");
        txtTime.setText("");
        txtNumberOfSeats.setText("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            String id = txtId.getText();
            String aircraftCode = txtAircraftCode.getText();
            String origin = txtOrigin.getText();
            String destination = txtDestination.getText();
            String date = txtDate.getText();
            String time = txtTime.getText();
            int numberOfSeats = Integer.parseInt(txtNumberOfSeats.getText());

            // parse dates from strings like '"2011-09-01"' and "10:15:00"
            LocalDate localDate = LocalDate.parse(date);
            LocalTime localTime = LocalTime.parse(time);

            Flight flight = new Flight(id, aircraftCode, origin, destination, localDate, localTime, numberOfSeats);
            flightController.add(flight);

            JOptionPane.showMessageDialog(this, "Vuelo agregado correctamente.");

            cleanFields();
        }
    }
}
