package at.ac.htlleonding.entities;

import jakarta.persistence.*;

@Entity
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long scoreId;

    @ManyToOne
    public Team team;
    @ManyToOne
    public Stage stage;
    public int score;

}