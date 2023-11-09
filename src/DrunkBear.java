public class DrunkBear extends SimpleBear {
    private boolean isSleeping = false;

    @Override
    public void talk() {
        if (!isSleeping) {
            super.talk();
        } else if(haveBattery()){
            System.out.println("Sleeping...");
        } else {
            System.out.println("Run out of battery...");
        }

        if (willSleep()) {
            isSleeping = true;
        }
    }

    public boolean willSleep() {
        int number = (int) (Math.random() * (100 - 1)) + 1;
        return number < 20;
    }
}
