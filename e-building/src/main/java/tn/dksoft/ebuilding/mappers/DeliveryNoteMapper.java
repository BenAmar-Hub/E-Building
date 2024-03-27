package tn.dksoft.ebuilding.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.DeliveryNoteDTO;
import tn.dksoft.ebuilding.entities.DeliveryNote;
@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = {InvoiceMapper.class, DevisMapper.class})
public interface DeliveryNoteMapper extends GenericMapper<DeliveryNoteDTO, DeliveryNote> {
    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    DeliveryNote toEntity(DeliveryNoteDTO deliveryNoteDTO);
}
