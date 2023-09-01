package tn.dksoft.ebuilding.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.CustomerDTO;
import tn.dksoft.ebuilding.entities.Customer;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface CustomerMapper extends GenericMapper<CustomerDTO, Customer>{
}
