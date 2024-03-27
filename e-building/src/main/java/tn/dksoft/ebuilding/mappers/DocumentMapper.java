package tn.dksoft.ebuilding.mappers;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;
import tn.dksoft.ebuilding.dtos.DocumentDTO;
import tn.dksoft.ebuilding.entities.Document;
@Component
@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR,uses = {TaskMapper.class})

public interface DocumentMapper extends GenericMapper<DocumentDTO, Document> {
    @Override
    @Mapping(ignore = true,target = "createdBy")
    @Mapping(ignore = true,target = "creationDate")
    @Mapping(ignore = true,target = "lastModifiedBy")
    @Mapping(ignore = true,target = "lastModifiedDate")
    @Mapping(ignore = true,target = "deleted")
    Document toEntity(DocumentDTO documentDTO);
}
