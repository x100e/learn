package entity;

import java.util.List;
import java.util.Set;

/**
 * Created by marina on 27.11.2015.
 */
public class DistributedList {

    private long id;
    private String name;
    private List<ListPosition> positions;
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


