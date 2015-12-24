package dao;

import entity.DistributedList;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by marina on 23.12.2015.
 */
public interface DistributedListRepository extends CrudRepository<DistributedList, Long> {
}
