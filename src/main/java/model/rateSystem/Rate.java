package model.rateSystem;
import model.user.User;

import javax.persistence.*;

/**
 * Created by Kuba on 27.05.2017.
 */
@Entity
@NamedQueries({
        @NamedQuery(name = "rate.all", query = "SELECT r FROM Rate r"),
        @NamedQuery(name = "rate.id", query = "SELECT r FROM Rate r WHERE r.id=:id"),
        @NamedQuery(name = "rate.category", query ="select r from Rate r where  r.category=:category")

})
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Enumerated(EnumType.STRING)
    private Score score;

    @OneToOne
    private User user;

    @Enumerated(EnumType.STRING)
    private Category category;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public model.rateSystem.Category getCategory() {
        return category;
    }

    public void setCategory(model.rateSystem.Category category) {
        this.category = category;
    }
}
