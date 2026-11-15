
import java.util.Scanner;
import java.util.Locale;

public class CW1P2 {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Would you like (v)anilla, (c)hocolate");
            System.out.println("or (s)trawberry?");

            char flavour = input.next().charAt(0);

            int price;

            if (flavour == 'v') {
                price = 30;
            } else if (flavour == 'c') {
                price = 26;
            } else if (flavour == 's') {
                price = 2;
            } else {
                System.out.println("We don't have that flavour.");
                return;
            }

            System.out.println("How many scoops would you like?");
            int scoops = input.nextInt();

            if (scoops > 3) {
                System.out.println("That's too many scoops to fit in a cone.");
            } else if (scoops < 1) {
                System.out.println("We don't sell just a cone.");
            } else {
                int total = 100 + (price * scoops);

                System.out.printf(Locale.UK,
                    "That will be %.2f please.%n", total / 100.0);
            }
        }
    }
}

