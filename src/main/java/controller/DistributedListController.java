package controller;

import dao.DistributedListRepository;
import entity.DistributedList;
import entity.ListPosition;
import entity.User;

/**
 * Created by marina on 23.12.2015.
 */
public class DistributedListController {

    private DistributedListRepository repository;
    private DistributedList list;

    public DistributedListController(DistributedListRepository repository, DistributedList list) {
        this.repository = repository;
        this.list = list;
    }

    public void addListPosition(ListPosition position) {
        list.addListPosition(position);
        list.splitPositionsBetweenUsers();
    }

    public void removeListPosition(ListPosition position) {
        list.removePosition(position);
        list.splitPositionsBetweenUsers();
    }

    public void addUser(User user) {
        list.addUser(user);
        list.splitPositionsBetweenUsers();
    }

    public void removeUser(User user) {
        list.removeUser(user);
        list.splitPositionsBetweenUsers();
    }

    public void save() {
        repository.save(list);
    }

}
