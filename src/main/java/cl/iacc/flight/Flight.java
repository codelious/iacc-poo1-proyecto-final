package cl.iacc.flight;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Flight {
    private String id;
    private String aircraftCode;
    private String origin;
    private String destination;
    private LocalDate date;
    private LocalTime time;
    private int numberOfSeats;
}
