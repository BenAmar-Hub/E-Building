package tn.dksoft.ebuilding.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.ProviderDTO;
import tn.dksoft.ebuilding.entities.Provider;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface ProviderMapper extends GenericMapper<ProviderDTO, Provider>{
}
