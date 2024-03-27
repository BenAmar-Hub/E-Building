package tn.dksoft.ebuilding.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.OrderItemDTO;
import tn.dksoft.ebuilding.entities.OrderItem;
@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = {ConsumableMapper.class, TOrderMapper.class})

public interface OrderItemMapper extends GenericMapper<OrderItemDTO, OrderItem> {
    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    OrderItem toEntity(OrderItemDTO orderItemDTO);
}
