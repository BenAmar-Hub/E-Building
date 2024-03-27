package tn.dksoft.ebuilding.mappers;

import org.mapstruct.*;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.CustomerDTO;
import tn.dksoft.ebuilding.entities.Customer;

import java.util.List;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = {AddressMapper.class})
public interface CustomerMapper extends GenericMapper<CustomerDTO, Customer> {
    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    Customer toEntity(CustomerDTO customerDTO);

    @Override
    @Mapping(ignore = true,target = "type")
    CustomerDTO toDto(Customer customer);
}
