public class Main {
    public static void main(String[] args) {
        Comparator comparator = new Comparator();

        Shop lojaDoMarco = new Shop("Marco dos peluches", 10);
        Shop lojaDoCaraleu = new Shop("O caraleu dos peluches", 25);

        comparator.compare(lojaDoMarco, lojaDoCaraleu);
    }
}