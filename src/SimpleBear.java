public class SimpleBear {

    private int battery = 100;

    public void talk() {
        if(haveBattery()) {
            System.out.println("I love you");
        } else {
            System.out.println("Run out of battery....");
        }
    }

    public boolean haveBattery() {
        if(battery == 0) {
            return false;
        }
        battery -= 10;
        return true;
    }
}
