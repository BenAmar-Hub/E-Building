package tn.dksoft.ebuilding.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.HumanResourceDTO;
@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface HumanResource extends GenericMapper<HumanResourceDTO, HumanResource> {
}
