import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<SimpleBear> bears = new ArrayList<>();

    public Shop(String name, int numberOfBearsToCreate) {
        this.name = name;
        create(numberOfBearsToCreate);
    }

    public void create(int numberOfBearsToCreate) {

        int numberOfBears = bears.size();

        while (numberOfBearsToCreate != 0) {
            if (numberOfBears % 2 == 0) {
                bears.add(new SimpleBear());
            } else if (numberOfBears % 5 == 0) {
                bears.add(new CrankBear());
            } else {
                bears.add(new DrunkBear());
            }
            numberOfBearsToCreate--;
        }
    }

    public ArrayList<SimpleBear> getBears() {
        return bears;
    }

    public String getName() {
        return name;
    }
}
