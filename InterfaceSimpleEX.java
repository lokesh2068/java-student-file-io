interface Playable{
    void play();
}
class MusicPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Playing Music");
    }
}
class VideoPlayer implements Playable{
    @Override
    public void play(){
        System.out.println("Playing Video ");
    }
}
public class InterfaceSimpleEX{
    public static void main(String[] args){
        Playable p;
        p= new MusicPlayer();
        p.play();
        p= new VideoPlayer();
        p.play();
    }
}