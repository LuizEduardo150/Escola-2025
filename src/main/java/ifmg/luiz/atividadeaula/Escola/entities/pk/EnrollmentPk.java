package ifmg.luiz.atividadeaula.Escola.entities.pk;

import ifmg.luiz.atividadeaula.Escola.entities.Offer;
import ifmg.luiz.atividadeaula.Escola.entities.User;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class EnrollmentPk {

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "offer_id")
    private Offer offer;




}
