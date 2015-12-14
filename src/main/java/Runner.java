import dao.UserRepository;
import entity.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by eugene on 26.11.2015.
 */
public class Runner {

    public static void main(String...args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserRepository repository = context.getBean("userRepository", UserRepository.class);
        System.out.println(repository.count());

        User user = new User();
        user.setName("trololo");
        User result = repository.save(user);
        System.out.println("result => "+result);
    }

}
