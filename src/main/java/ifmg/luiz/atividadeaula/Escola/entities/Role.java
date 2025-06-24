package ifmg.luiz.atividadeaula.Escola.entities;

import jakarta.persistence.*;
import lombok.*;


//@Getter
//@Setter
//@ToString
//@RequiredArgsConstructor
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)


@Entity
@Table(name = "tb_role")
public class Role{

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    //@ToString.Exclude
    //@Getter(value= AccessLevel.PRIVATE)
    private String authority;

}