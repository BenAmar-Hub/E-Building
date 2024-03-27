package tn.dksoft.ebuilding.entities;
//finish
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true,callSuper = false)
@Entity
@Table(name = "TUser")
public class Tuser {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String userName;
    @Column(unique = true)
    private String email;
    //pour ne pas l afficher dans Json
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String confirmPassword;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Trole> roles= new ArrayList<>();
}
