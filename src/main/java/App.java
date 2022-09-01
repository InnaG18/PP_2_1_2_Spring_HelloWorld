import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.catalog.Catalog;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.equals(bean));

        Cat bean3 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.equals(bean));

        Cat bean4 =
                (Cat) applicationContext.getBean("cat");
        System.out.println(bean4.equals(bean2));

    }
}