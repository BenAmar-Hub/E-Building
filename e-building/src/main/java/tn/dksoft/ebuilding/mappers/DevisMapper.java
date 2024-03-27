package tn.dksoft.ebuilding.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.DevisDTO;
import tn.dksoft.ebuilding.entities.Devis;
@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = {CustomerMapper.class})
public interface DevisMapper extends GenericMapper<DevisDTO, Devis> {
    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    Devis toEntity(DevisDTO devisDTO);
}
