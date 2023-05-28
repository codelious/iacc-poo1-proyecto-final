package cl.iacc.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    private String id;
    private String name;
    private String address;
    private String phone;
    private String email;
}
