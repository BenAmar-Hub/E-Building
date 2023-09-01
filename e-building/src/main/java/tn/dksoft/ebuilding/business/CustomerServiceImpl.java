package tn.dksoft.ebuilding.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.dksoft.ebuilding.dtos.CustomerDTO;
import tn.dksoft.ebuilding.entities.Customer;
import tn.dksoft.ebuilding.mappers.CustomerMapper;
import tn.dksoft.ebuilding.repositories.CustomerRepository;

@Service(value = "customerService")
@Transactional
public class CustomerServiceImpl extends GenericServiceImpl<Customer, Long, CustomerDTO> implements CustomerService {
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        super(customerRepository, customerMapper);
    }
}
