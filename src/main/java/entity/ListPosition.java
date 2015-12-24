package entity;

import javax.persistence.*;

/**
 * Created by marina on 27.11.2015.
 */
@Entity
public class ListPosition {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    private int qty;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User user;
    private boolean done;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "ListPosition{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qty=" + qty +
                ", user=" + user==null ? null : user +
                ", done=" + done +
                '}';
    }
}
