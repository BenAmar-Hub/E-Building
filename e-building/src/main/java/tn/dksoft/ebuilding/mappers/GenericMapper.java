package tn.dksoft.ebuilding.mappers;

import org.mapstruct.*;
import tn.dksoft.ebuilding.entities.auditing.AbstractGenericEntity;

import java.util.List;

public interface GenericMapper<T, I extends AbstractGenericEntity> {

        List<T> fromEntitiesToDtoList(List<I> i);

        List<I> fromDtoListToEntities(List<T> t);

        T fromEntityToDto(I i);

        I fromDtoToEntity(T t);

        @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
        void updateFromTToI(T t, @MappingTarget I i);

}
