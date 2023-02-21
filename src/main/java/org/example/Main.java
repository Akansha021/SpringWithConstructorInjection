package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

//        ApplicationContext ac=new AnnotationConfigApplicationContext(ConfigJava.class);
//        Person person=(Person) ac.getBean("person");
//        person.getOP();

        ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
        Person person=(Person) ac.getBean("person");
        person.getOP();
    }
}