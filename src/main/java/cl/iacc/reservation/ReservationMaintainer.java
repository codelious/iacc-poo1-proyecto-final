package cl.iacc.reservation;

import cl.iacc.customer.Customer;
import cl.iacc.customer.CustomerController;
import cl.iacc.flight.Flight;
import cl.iacc.flight.FlightController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.UUID;

public class ReservationMaintainer extends JFrame implements ActionListener {

    private final JTextField txtCustomerId;
    private final JTextField txtFlightId;
    private final JTextField txtReservationDate;
    private final JTextField txtSeatNumber;
    private final JButton btnAdd;

    private final ReservationController reservationController;
    private final FlightController flightController;
    private final CustomerController customerController;

    public ReservationMaintainer() {
        reservationController = new ReservationController();
        flightController = new FlightController();
        customerController = new CustomerController();

        setTitle("Mantenedor de Reservas");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblCustomer = new JLabel("Cliente ID:");
        lblCustomer.setBounds(20, 20, 140, 25);
        add(lblCustomer);

        txtCustomerId = new JTextField();
        txtCustomerId.setBounds(150, 20, 200, 25);
        add(txtCustomerId);

        JLabel lblFlight = new JLabel("Vuelo ID:");
        lblFlight.setBounds(20, 60, 140, 25);
        add(lblFlight);

        txtFlightId = new JTextField();
        txtFlightId.setBounds(150, 60, 200, 25);
        add(txtFlightId);

        JLabel lblReservationDate = new JLabel("Fecha de Reserva:");
        lblReservationDate.setBounds(20, 100, 140, 25);
        add(lblReservationDate);

        txtReservationDate = new JTextField();
        txtReservationDate.setBounds(150, 100, 200, 25);
        add(txtReservationDate);

        JLabel lblSeatNumber = new JLabel("Número de Asiento:");
        lblSeatNumber.setBounds(20, 140, 140, 25);
        add(lblSeatNumber);

        txtSeatNumber = new JTextField();
        txtSeatNumber.setBounds(150, 140, 200, 25);
        add(txtSeatNumber);

        btnAdd = new JButton("Agregar");
        btnAdd.setBounds(150, 180, 100, 25);
        btnAdd.addActionListener(this);
        add(btnAdd);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnAdd) {
            String id = UUID.randomUUID().toString();
            String customerId = txtCustomerId.getText();
            String flightId = txtFlightId.getText();
            LocalDate date = LocalDate.parse(txtReservationDate.getText());
            int seatNumber = Integer.parseInt(txtSeatNumber.getText());

            // find the customer and flight objects by their IDs
            Customer customer = customerController.findById(customerId);
            Flight flight = flightController.findById(flightId);

            Reservation reservation = new Reservation(id, customer, flight, date, seatNumber);
            reservationController.add(reservation);

            JOptionPane.showMessageDialog(this, "Reserva agregada correctamente.");

            cleanFields();
        }
    }

    private void cleanFields() {
        txtCustomerId.setText("");
        txtFlightId.setText("");
        txtReservationDate.setText("");
        txtSeatNumber.setText("");
    }
}
