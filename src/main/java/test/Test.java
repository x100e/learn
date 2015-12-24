package test;

import dao.ListPositionRepository;
import dao.UserRepository;
import entity.ListPosition;
import entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import javax.transaction.Transactional;

/**
 * Created by marina on 15.12.2015.
 */
public class Test {

    UserRepository userRepository;
    ListPositionRepository listPositionRepository;

    public Test(UserRepository userRepository, ListPositionRepository listPositionRepository) {
        this.userRepository = userRepository;
        this.listPositionRepository = listPositionRepository;
    }

    @Transactional
    public void test() {

//        System.out.println(userRepository.count());
//
//        User user = new User();
//        user.setName("trololo");
//        User result = userRepository.save(user);
//        System.out.println("result => "+result);
//
//        ListPosition position = new ListPosition();
//        position.setName("ololo");
//        position.setQty(100500);
//        position.setUser(result);
//        ListPosition result2 = listPositionRepository.save(position);
//        System.out.println(result2);

        ListPosition searchResult = listPositionRepository.findOne(1L);
        System.out.println(searchResult);

//        TransactionTemplate template = new TransactionTemplate(context.getBean("transactionManager", PlatformTransactionManager.class));
//        template.execute(new TransactionCallbackWithoutResult() {
//            @Override
//            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                User user = userRepository.findOne(2L);
                System.out.println("user => " + user);
                System.out.println("size => " + user.getPositions().size());
                System.out.println("positions => " + user.getPositions());
        user.setName("brahma");
//            }
//        });
    }

}
