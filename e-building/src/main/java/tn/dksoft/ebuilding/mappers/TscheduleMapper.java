package tn.dksoft.ebuilding.mappers;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.TscheduleDTO;
import tn.dksoft.ebuilding.entities.Tschedule;
@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR,uses = {ProjectMapper.class})
public interface TscheduleMapper extends GenericMapper<TscheduleDTO, Tschedule> {
    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    Tschedule toEntity(TscheduleDTO tscheduleDTO);
}
