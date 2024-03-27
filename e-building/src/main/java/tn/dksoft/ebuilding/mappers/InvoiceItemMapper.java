package tn.dksoft.ebuilding.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.InvoiceItemDTO;
import tn.dksoft.ebuilding.entities.InvoiceItem;
@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = {InvoiceMapper.class, ConsumableMapper.class})

public interface InvoiceItemMapper extends GenericMapper<InvoiceItemDTO, InvoiceItem> {
    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    InvoiceItem toEntity(InvoiceItemDTO invoiceItemDTO);
}
