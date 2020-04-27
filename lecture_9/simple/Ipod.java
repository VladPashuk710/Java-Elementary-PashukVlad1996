package lecture_9.simple;

import lecture_9.simple.specs.Phone;
import lecture_9.simple.specs.Player;
import lecture_9.simple.specs.VideoCamera;

public class Ipod implements Phone, VideoCamera, Player {
    public void playMusic() {
        System.out.println("Ipod playing music");
    }

    public void recordVideo() {
        System.out.println("Ipod recording video");
    }

    public void makePhoto() {
        System.out.println("Ipod making photos");
    }
}


