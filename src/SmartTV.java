public class SmartTV {

    boolean on = false;
    int channel = 1;
    int volume = 25;

    public void connect() {
        on = true;
    }

    public void upVolume() {
        volume++;
    }

    public void decreaseVolume() {
        volume--;
    }

    public void changeChannel() {
        channel++;
    }

    public void otherChannel(int newChannel) {
        channel = newChannel;
    }
}
