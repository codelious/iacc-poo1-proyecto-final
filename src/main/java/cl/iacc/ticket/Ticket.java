package cl.iacc.ticket;

import cl.iacc.reservation.Reservation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ticket {
    private String id;
    private Reservation reservation;
    private float price;
}
