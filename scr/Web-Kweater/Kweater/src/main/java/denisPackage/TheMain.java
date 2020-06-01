package denisPackage;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class TheMain {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.tld");
        User user1 = context.getBean("User",User.class);
        user1.createUser("Denis","Kostin", 19, Gender.Male,"den_programmer");
        System.out.println(user1.toString() );

        User user2 = context.getBean("User",User.class);
        user2.createUser("Rock","Dyein", 49, Gender.Male,"The Rock");
        System.out.println(user2.toString() );
    }

}
