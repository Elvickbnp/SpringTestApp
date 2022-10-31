package org.springframework.music;

public class RockMusic implements Music {

    private String rockMusic = "яйцераздерающий рооооцк";

    @Override
    public String getSong() {
        return rockMusic;
    }
}
