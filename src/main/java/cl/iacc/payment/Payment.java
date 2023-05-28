package cl.iacc.payment;

import cl.iacc.ticket.Ticket;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Payment {
    private String id;
    private Ticket ticket;
    private float amount;
    private String paymentMethod;
}
