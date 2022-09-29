import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld anotherBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(anotherBean.getMessage());
        System.out.println(bean == anotherBean);

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getMessage());
        Cat anotherCat = (Cat) applicationContext.getBean("cat");
        System.out.println(anotherCat.getMessage());
        System.out.println(cat == anotherCat);
    }
}