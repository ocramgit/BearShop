public class CrankBear extends SimpleBear {

    private int battery = 100;
    private boolean alreadySang = false;

    @Override
    public void talk() {
        if(haveBattery()) {
            System.out.println("I love you!");
        } else if(!haveBattery() && !alreadySang) {
            alreadySang = true;
            System.out.println("Running out of battery..");
            System.out.println("Soft kitty, warm kitty..");
        }
    }

    @Override
    public boolean haveBattery() {
        battery -= 10;
        return battery > 50;
    }
}
