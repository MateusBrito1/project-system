public class User {
    public static void main(String[] args) {

        SmartTV tvSmart = new SmartTV();

        System.out.println("The tv is on? " + tvSmart.on);
        System.out.println("Current Channel " + tvSmart.channel);
        System.out.println("Current volume " + tvSmart.volume);

        //method call
        tvSmart.connect();

        tvSmart.upVolume();
        tvSmart.decreaseVolume();

        tvSmart.changeChannel();
        tvSmart.otherChannel(13);

        System.out.println("Which TV channel? " + tvSmart.channel);
        System.out.println("What's the other channel? " + tvSmart.channel);
        System.out.println("What's the other channel? " + tvSmart.channel);
        System.out.println("To decrease volume: " + tvSmart.volume);
        System.out.println("Tv is on now? " + tvSmart.on);
        System.out.println("What volume of the television?: " + tvSmart.volume);

    }
}