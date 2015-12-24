package entity;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Set;

/**
 * Created by marina on 27.11.2015.
 */
public class DistributedList {

    @Id
    @GeneratedValue
    private long id;
    private String name;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "<to_define>")
    private List<ListPosition> positions;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "<to_define>")
    private Set<User> users;

    public DistributedList(String name) {
        this.name = name;
    }

    public void addListPosition(ListPosition position) {
        positions.add(position);
    }

    public void removePosition(ListPosition position) {
        positions.remove(position);
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void splitPositionsBetweenUsers() {

    }

}


