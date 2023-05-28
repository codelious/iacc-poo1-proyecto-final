package cl.iacc.flight;

import cl.iacc.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlightController {
    public Flight add(Flight flight) {
        log.info("Adding a new customer: {}", JsonUtils.objectToJsonString(flight));
        return flight;
    }

    public Flight findById(String id) {
        log.info("Finding flight by id: {}", id);
        return new Flight();
    }
}
