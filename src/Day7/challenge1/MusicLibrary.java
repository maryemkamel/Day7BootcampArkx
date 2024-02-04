package Day7.challenge1;

public class MusicLibrary implements Playable{
    @Override
    public void player() {
        System.out.println("Player!!!!! :) ");
    }

    @Override
    public void pause() {
        System.out.println("Pause!!!! :) ");
    }

    @Override
    public void stop() {
        System.out.println("Stop!!! :/ ");
    }
}
