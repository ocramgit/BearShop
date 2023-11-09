public class Comparator {

    public void compare(Shop shop, Shop shop1) {
        if(shop.getBears().size() > shop1.getBears().size()) {
            System.out.println(shop.getName() + " wins.");
        } else if(shop.getBears().size() < shop1.getBears().size()) {
            System.out.println(shop1.getName() + " wins");
        } else {
            System.out.println("Empate crl!");
        }
    }
}
