package apiRest.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.envers.Audited;
import java.io.Serializable;

@Entity
@Table(name = "Persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Audited
public class Autor extends Base implements Serializable {

    @Column
    private String nombre;

    @Column
    private String apellido;

    @Column (length = 1500)
    private String biografia;
}