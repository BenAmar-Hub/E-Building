package tn.dksoft.ebuilding.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(value = {"type"})
public class TresourceDTO {
    private String type;
}
