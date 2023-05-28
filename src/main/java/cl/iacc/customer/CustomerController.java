package cl.iacc.customer;

import cl.iacc.utils.JsonUtils;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomerController {

    public Customer add(Customer customer) {
        log.info("Adding a new customer: {}", JsonUtils.objectToJsonString(customer));
        return customer;
    }

    public Customer findById(String customerId) {
        log.info("Finding customer by id: {}", customerId);
        return new Customer();
    }
}
