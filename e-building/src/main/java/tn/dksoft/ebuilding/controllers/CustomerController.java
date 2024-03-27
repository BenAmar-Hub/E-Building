package tn.dksoft.ebuilding.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.dksoft.ebuilding.business.CustomerService;
import tn.dksoft.ebuilding.business.GenericService;
import tn.dksoft.ebuilding.dtos.CustomerDTO;
import tn.dksoft.ebuilding.entities.Customer;
@RestController
@RequestMapping("/api/customer")
public class CustomerController extends GenericController<Customer, Long, CustomerDTO> {
@Autowired
    public CustomerController(CustomerService service) {
        super(service);
    }
}
