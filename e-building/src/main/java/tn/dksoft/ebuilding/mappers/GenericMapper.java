package tn.dksoft.ebuilding.mappers;

import org.mapstruct.Context;
import org.mapstruct.InheritInverseConfiguration;
import tn.dksoft.ebuilding.dtos.ProjectDto;
import tn.dksoft.ebuilding.entities.Project;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.util.List;

public interface GenericMapper<T, I extends AbstractGenericEntity> {


    List<T> fromEntitiesToDtoList(List<I> i);
    List<I> fromDtoListToEntities(List<T> t);
    T toDto(I i);
    I toEntity(T t);

}
