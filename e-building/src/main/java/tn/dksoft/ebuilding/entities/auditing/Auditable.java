package tn.dksoft.ebuilding.entities.auditing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.time.LocalDateTime;

@JsonIgnoreProperties(value = {"createdDate", "lastModifiedDate", "createdBy", "lastModifiedBy"})
//lombok annotations
@Data
//spring auditing annotations
//annotation designates a class whose mapping information is applied to the
//entities that inherit from it. A mapped superclass has no separate table defined
//for it
@MappedSuperclass
//specifies the callback listener classes to be used for an entity or mapped
//superclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable<U> {

    //updatable flag helps to avoid the override of
    //column's value during the update operation
    @CreatedBy
    @Column(name = "created_by", updatable = false)
    private U createdBy;

    //updatable flag helps to avoid the override of
    //column's value during the update operation
    @CreatedDate
    @Column(name = "created_date", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creationDate;

    @LastModifiedBy
    @Column(name = "last_modified_by")
    private U lastModifiedBy;

    @LastModifiedDate
    @Column(name = "last_modified_date")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime lastModifiedDate;
}