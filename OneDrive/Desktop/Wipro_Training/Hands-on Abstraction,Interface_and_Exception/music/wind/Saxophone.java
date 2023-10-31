package Wipro_Training.AbstractionAndException.music.wind;

import Wipro_Training.AbstractionAndException.music.Playable;

public class Saxophone implements Playable {

    @Override
    public void play() {
        System.out.println("Playing Saxophone");
    }
}
