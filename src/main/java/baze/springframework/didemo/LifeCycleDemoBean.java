package baze.springframework.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware,
        BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean(){
        System.out.println("## I'm the lifecycle Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## The bean factory has been set");

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## The bean name is" + s);

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## The lifecycle has been terminated");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## The lifecycle has its properties set");

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## The Application context has been set");

    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("The Post Construct annotated method has been called");

    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("The Pre Destroy annotated method has been set");

    }

    // METHODS CALLED AFTER BEAN POST PROCESSOR

    public void beforeInit(){
        System.out.println("Before Init - Called by Bean Post Proccesor");
    }

    public void afternInit(){
        System.out.println("After Init - Called by Bean Post Proccesor");
    }

}
