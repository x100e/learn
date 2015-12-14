import dao.ListPositionRepository;
import dao.UserRepository;
import entity.ListPosition;
import entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.transaction.Transactional;

/**
 * Created by eugene on 26.11.2015.
 */
public class Runner {

    @Transactional
    public static void main(String...args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserRepository userRepository = context.getBean("userRepository", UserRepository.class);
        ListPositionRepository listPositionRepository = context.getBean("listPositionRepository", ListPositionRepository.class);
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

    }

}
