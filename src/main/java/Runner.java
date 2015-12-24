import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.Test;

/**
 * Created by eugene on 26.11.2015.
 */
public class Runner {


    public static void main(String...args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Test test = context.getBean("test", Test.class);
        test.test();
    }

}
