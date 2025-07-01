package ifmg.luiz.atividadeaula.Escola.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_reply")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Reply {

    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String body;
    private Instant moment;

    @ManyToOne
    @JoinColumn(name="author_id")
    private User author;

    @ManyToMany
    @JoinTable(name="tb_topic_likes",
            joinColumns = @JoinColumn(name="topic_id"),
            inverseJoinColumns = @JoinColumn(name="user_id")
    )
    private Set<User> likes = new HashSet<>();

    @ManyToOne
    @JoinColumn(name="topic_id")
    private Topic topic;



}

