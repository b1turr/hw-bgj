public class TestInfo {
    public static void main(String[] args) {
        Info person1 = new Info(); // creating first object
        person1.Name = "Baturay\n";
        person1.Surname = "Ozkara\n";
        person1.Age =  "23\n";


        String answer = person1.getInfo("Man\n"); // giving input to argument of getInfo object
        System.out.println(answer); // final output

    }


}

