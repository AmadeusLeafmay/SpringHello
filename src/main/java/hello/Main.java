package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext("hello");

        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        System.out.println(helloWorld.helloWorzh());
    }
}

