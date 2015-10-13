import java.util.Scanner;

public class Pizza {

    public static void main(String[] Pizza) {
        new Pizza().run();
    }

    Scanner sc = new Scanner(System.in);

    public String[] pizza = new String[]{"Pizza Margherita", "Pizza Caprese", "Pizza Prosciutto", "Pizza Hawaii", "Pizza Pepperoni"};
    public Double[] price = new Double[]{10.35, 7.99, 12.49, 12.45, 13.99};


    public void run() {
        int choice;

//		-----------------------------
//		Hier wordt het menu geprint
//		-----------------------------

        System.out.println("************************************");
        System.out.println("* Pizzaria GetSliced");
        System.out.println("************************************");
        System.out.println("* 1) Menukaart tonen");
        System.out.println("* 2) Pizza wisselen");
        System.out.println("* 3) Bestelling plaatsen");
        System.out.println();
        System.out.println("* 9) Afsluiten");
        System.out.println("************************************");

//		-----------------------------
//		Hier wordt de choice bekeken
//		-----------------------------		

        System.out.println("Voer uw keuze in:");
        choice = sc.nextInt();
        if (choice == 1) {
            new Pizza().one();
        } else if (choice == 2) {
            new Pizza().two();
        } else if (choice == 3) {
            new Pizza().three();
        } else if (choice == 9) {
            System.out.println("Programma is afgesloten");
        } else {
            System.out.println("Geen geldigde keuze. Graag opnieuw proberen");
            new Pizza().run();
        }
    }

    public void menuKaart(){
//		-----------------------------
//		Hier wordt de menukaart geprint
///		-----------------------------

        System.out.println("************************************");
        System.out.println("* Menukaart");
        System.out.println("************************************");

        for (int i = 0; i < pizza.length; i++) {
            System.out.println("*" + " " + (i + 1) + " " + pizza[i] + "      " + price[i]);
        }
    }

    public void one() {
        new Pizza().menuKaart();
        new Pizza().run();
    }


    public void two() {
//		-----------------------------
//		Intro tekst voor keus 2
//		-----------------------------
        System.out.println("Dit is uw huidige menu kaart. U kunt hem wijzigen door");
        System.out.println("een nummer in te voeren van een pizza. Die kunt u vervolgens wijzigen");
        System.out.println();
        System.out.println();

//		-----------------------------
//		Hier wordt de menukaart geprint
//		-----------------------------
        new Pizza().menuKaart();

        int pizzaNumber;
        String newPizza;
        double newPrice;

        System.out.println();
        System.out.println("Voer het nummer in de van de pizza die u wilt wijzigen:");
        pizzaNumber = sc.nextInt();

        while (pizzaNumber < 1 || pizzaNumber > 5) {
            System.out.println("U heeft een ongeldige waarde ingevoerd. Probeert u het alstublieft opnieuw");
            pizzaNumber = sc.nextInt();
        }

        System.out.println("Voer nu de nieuwe pizza in");
        newPizza = sc.nextLine();
        System.out.println("Voer de bijbehorende prijs in");
        newPrice = sc.nextDouble();

        System.out.println("Pizza " + pizzaNumber + " is gewijzigd in:");
        System.out.println(" Pizza: "+ newPizza);
        System.out.println(" Prijs: "+ newPrice);

        pizza[pizzaNumber -1] = newPizza;
        price[pizzaNumber -1] = newPrice;

        new Pizza().run();
    }

    public void three() {


    }

}

