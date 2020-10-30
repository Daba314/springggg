package spring.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring2 {
    public static void main(String[] args) {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
    MusicPlayer2 musicPlayer2 = context.getBean("musicPlayer2", MusicPlayer2.class); //dependency injection see in applicationContext bean musicBean
    musicPlayer2.getInfo();
    context.close();
    //Bean is the Java object
    }
}

