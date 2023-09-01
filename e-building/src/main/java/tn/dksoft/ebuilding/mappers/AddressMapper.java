package tn.dksoft.ebuilding.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.AdressDto;
import tn.dksoft.ebuilding.entities.TAddress;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AddressMapper extends GenericMapper<AdressDto, TAddress>{
}
