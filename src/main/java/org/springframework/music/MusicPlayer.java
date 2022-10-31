package org.springframework.music;

import static java.lang.System.out;

public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music){
        this.music = music;
    }

    public void playMusic(){
        out.println("Playing " + music.getSong());
    }
}
