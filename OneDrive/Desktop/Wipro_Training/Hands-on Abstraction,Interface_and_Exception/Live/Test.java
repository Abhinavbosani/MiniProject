package Wipro_Training.AbstractionAndException.Live;

import Wipro_Training.AbstractionAndException.music.Playable;
import Wipro_Training.AbstractionAndException.music.string.Veena;
import Wipro_Training.AbstractionAndException.music.wind.Saxophone;

public class Test {
    public static void main(String[] args) {
        Veena v=new Veena();
        v.play();
        Saxophone s=new Saxophone();
        s.play();
        Playable a=new Veena();
        a.play();
        Playable b=new Saxophone();
        b.play();

    }
}
