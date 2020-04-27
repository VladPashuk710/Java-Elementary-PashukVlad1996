package lecture_9.simple;

import lecture_9.simple.specs.Phone;
import lecture_9.simple.specs.Player;
import lecture_9.simple.specs.VideoCamera;

public class SmartPhone extends CellPhone implements VideoCamera, Player {

    public void playMusic() {
        System.out.println("SmartPhone playing music");
    }

    public void recordVideo() {
        System.out.println("SmartPhone recording video");
    }

    public void makePhoto() {
        System.out.println("SmartPhone making photos");
    }
}
