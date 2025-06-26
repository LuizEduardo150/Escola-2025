package ifmg.luiz.atividadeaula.Escola.entities;


import ifmg.luiz.atividadeaula.Escola.entities.pk.EnrollmentPk;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_enrollment")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Enrollment {

    @EmbeddedId
    private EnrollmentPk id = new EnrollmentPk();

    private Instant enrollMoment;
    private Instant refundMoment;
    private boolean available;
    private boolean onlyUpdate;

    @ManyToMany(mappedBy = "enrollmentsDone")
    private Set<Lesson> lessonsDone = new HashSet<>();

    public Enrollment(User user, Offer offer, Instant enrollMoment, Instant refundMoment, boolean available, boolean onlyUpdate) {
        this.id.setOffer(offer);
        this.id.setUser(user);
        this.enrollMoment = enrollMoment;
        this.refundMoment = refundMoment;
        this.available = available;
        this.onlyUpdate = onlyUpdate;
    }


    public User getUser(){
        return id.getUser();
    }

    public Offer getOffer(){
        return id.getOffer();
    }

    public void setUser(Offer offer){
        id.setOffer(offer);
    }


}
