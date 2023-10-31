package Interface;

public class audiosystem implements EntertainmentSystem{
    @Override
    public void playMedia(String media) {
        System.out.println("AudioSystem : Playing Music : " + media);


    }

    @Override
    public void adjustVolume(int volume) {
        System.out.println("AudioSystem : Adjusting volume to " + volume);

    }

    @Override
    public void switchChannel(int channel) {
        System.out.println("AudioSystem : Switching to channel : " + channel);




    }
}
