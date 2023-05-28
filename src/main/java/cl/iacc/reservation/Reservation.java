package cl.iacc.reservation;

import cl.iacc.customer.Customer;
import cl.iacc.flight.Flight;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Reservation {
    private String id;
    private Customer customer;
    private Flight flight;
    private LocalDate reservationDate;
    private int seatNumber;
}
