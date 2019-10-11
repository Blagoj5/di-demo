package baze.springframework.didemo;

import baze.springframework.didemo.controllers.ConstructorInjectedController;
import baze.springframework.didemo.controllers.MyController;
import baze.springframework.didemo.controllers.PropertyInjectedController;
import baze.springframework.didemo.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"baze.services", "baze.springframework.didemo"})
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println(controller.hello());
        System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());

    }

}
