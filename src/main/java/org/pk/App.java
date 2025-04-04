package org.pk;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
//        Student s1 = (Student) context.getBean(Student.class); /// This is will return an erroe if we have more than 1 beans in XML file, for this we can specify the bean id in this constructor
        Student s2 = (Student) context.getBean("s2");
        System.out.println(s2.getAge());

//        s1.show();
    }
}
