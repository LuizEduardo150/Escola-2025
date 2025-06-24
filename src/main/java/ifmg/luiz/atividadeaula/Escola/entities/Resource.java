package ifmg.luiz.atividadeaula.Escola.entities;


import ifmg.luiz.atividadeaula.Escola.constants.ResourceTypeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_resource")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Resource {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    private Integer position;
    private String imgUri;

    @Enumerated(EnumType.STRING)//ordinal
    private ResourceTypeEnum resourceType;

    @ManyToOne
    @JoinColumn(name="offer_id")
    private Offer offer;




}
