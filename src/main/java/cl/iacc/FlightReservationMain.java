package cl.iacc;

import cl.iacc.customer.CustomerMaintainer;
import cl.iacc.flight.FlightMaintainer;
import cl.iacc.reservation.ReservationMaintainer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FlightReservationMain extends JFrame implements ActionListener {

    private final JMenuBar menuBar;
    private final JMenu menuCustomer;
    private final JMenu menuFlight;
    private final JMenu menuReservation;

    public FlightReservationMain() {
        setTitle("Sistema de Reservación de Vuelos");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        menuCustomer = new JMenu("Clientes");
        menuBar.add(menuCustomer);

        JMenuItem menuItemCustomer = new JMenuItem("Registrar un cliente");
        menuItemCustomer.addActionListener(this);
        menuCustomer.add(menuItemCustomer);

        menuFlight = new JMenu("Vuelos");
        menuBar.add(menuFlight);

        JMenuItem menuItemFlight = new JMenuItem("Programar un vuelo");
        menuItemFlight.addActionListener(this);
        menuFlight.add(menuItemFlight);

        menuReservation = new JMenu("Reservas");
        menuBar.add(menuReservation);

        JMenuItem menuItemReservation = new JMenuItem("Hacer una reserva");
        menuItemReservation.addActionListener(this);
        menuReservation.add(menuItemReservation);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Registrar un cliente")) {
            CustomerMaintainer clienteMantenedor = new CustomerMaintainer();
            clienteMantenedor.setVisible(true);
        } else if (e.getActionCommand().equals("Programar un vuelo")) {
            FlightMaintainer flightMaintainer = new FlightMaintainer();
            flightMaintainer.setVisible(true);
        }
        else if (e.getActionCommand().equals("Hacer una reserva")) {
            ReservationMaintainer reservaMantenedor = new ReservationMaintainer();
            reservaMantenedor.setVisible(true);
        }
    }

    public static void main(String[] args) {
        FlightReservationMain main = new FlightReservationMain();
        main.setVisible(true);
    }
}