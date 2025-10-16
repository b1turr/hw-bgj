public class carTest {
    static void main() {
        car car1 = new car(); // creating first object
        car1.brand = "Audi\n";
        car1.model = "a4\n";
        car1.year = "2016\n";

        String price = car1.secondHandSell("130.000czk\n"); // giving input to argument of secondHandSell object
        System.out.println(price); // final output

    }

}
