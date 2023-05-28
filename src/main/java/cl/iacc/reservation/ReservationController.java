package cl.iacc.reservation;

import cl.iacc.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ReservationController {

    public Reservation add(Reservation reservation) {
        log.info("Adding a new customer: {}", JsonUtils.objectToJsonString(reservation));
        return reservation;
    }
}
