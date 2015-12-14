package entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by marina on 27.11.2015.
 */
@Table(name = "TUser")
@Entity
public class User {

    @Id
    @GeneratedValue//(strategy = GenerationType.AUTO)
    private long id;
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
    private List<ListPosition> positions;

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

    public List<ListPosition> getPositions() {
        return positions;
    }

    public void setPositions(List<ListPosition> positions) {
        this.positions = positions;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", positions=" + positions +
                '}';
    }
}
