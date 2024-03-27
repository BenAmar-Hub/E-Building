package tn.dksoft.ebuilding.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import tn.dksoft.ebuilding.entities.TAddress;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(value = {"type"})
public class EntrepriseDTO  {
    private String type;
    private List<AdressDto> addresses;

}
