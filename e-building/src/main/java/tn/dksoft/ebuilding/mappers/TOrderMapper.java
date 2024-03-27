package tn.dksoft.ebuilding.mappers;

import org.mapstruct.*;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.TorderDTO;
import tn.dksoft.ebuilding.entities.Entreprise;
import tn.dksoft.ebuilding.entities.Torder;
@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = {HumanResourceMapper.class})

public interface TOrderMapper extends GenericMapper<TorderDTO, Torder> {
    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    Torder toEntity(TorderDTO torderDTO);
}
