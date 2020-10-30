package spring.example;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer2 {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    //IoC Inversion of Control
    public  MusicPlayer2(List<Music> musicList){
        this.musicList = musicList;
    }


    public MusicPlayer2() {
    }

    public void getInfo(){
        for(Music music:musicList){
            System.out.println("Songs:"+music.getSong());
        }

    }



}


