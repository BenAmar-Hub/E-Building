package tn.dksoft.ebuilding.mappers;

import org.mapstruct.*;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.ProviderDTO;
import tn.dksoft.ebuilding.entities.Provider;

import java.util.List;

@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR,uses = {ConsumableMapper.class, AddressMapper.class})
public interface ProviderMapper extends GenericMapper<ProviderDTO, Provider> {
    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    Provider toEntity(ProviderDTO providerDTO);

    @Override
    @Mapping(ignore = true,target = "type")
    ProviderDTO toDto(Provider provider);
}
