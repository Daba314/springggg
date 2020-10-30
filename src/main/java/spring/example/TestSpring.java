package spring.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       // Music music = context.getBean("musicBean", Music.class);  //First argument is bean id from applicationContext;
        // 2 argument is the class of bean which we want to get
        //MusicPlayer musicPlayer = new MusicPlayer(music); it was actual when i used only MusicBean

        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class); //dependency injection see in applicationContext bean musicBean
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        boolean comparison = firstMusicPlayer == secondMusicPlayer;// scope singleton(by default in bean, getBean method refers to the same object)
        System.out.println(comparison);
        secondMusicPlayer.setVolume(10); // shows that by changing secondMusicPlayer we also change first one
        // However if I will add scope = "prototype" to bean I will get two different objects
        firstMusicPlayer.getInfo();
        System.out.println(firstMusicPlayer.getName());
        System.out.println(firstMusicPlayer.getVolume());
        context.close();
        //Bean is the Java object
    }
}
