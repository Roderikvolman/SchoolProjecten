package Kwartiel1.Minesweeper;

import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {

    public static void main(String[] Pizza) {
        new Pizza().run();
    }

    Scanner sc = new Scanner(System.in);
    Scanner line = new Scanner(System.in); //Dit is een aparte scanner die zinnen inleest.

    public String[] pizza = new String[]{"Pizza Margherita", "Pizza Caprese", "Pizza Prosciutto", "Pizza Hawaii", "Pizza Pepperoni"};
    public Double[] price = new Double[]{10.35, 7.99, 12.49, 12.45, 13.99};


    public void run() {
     new Pizza().menu();
    }
        public void menu () {
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
                one();
            } else if (choice == 2) {
               two();
            } else if (choice == 3) {
                three();
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
//      -----------------------------
//		Hier keuze 1 uitgewerkt
///		-----------------------------

    public void one() {
        menuKaart();
    }
//      -----------------------------
//		Hier keuze 2 uitgewerkt
///		-----------------------------

    public void two() {

        int pizzaNumber;
        String newPizza;
        double newPrice;

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
        menuKaart();


        System.out.println();
        System.out.println("Voer het nummer in de van de pizza die u wilt wijzigen:");
        pizzaNumber = sc.nextInt();

        while (pizzaNumber < 1 || pizzaNumber > 5) {
            System.out.println("U heeft een ongeldige waarde ingevoerd. Probeert u het alstublieft opnieuw");
            pizzaNumber = sc.nextInt();
        }

        System.out.println("Voer nu de nieuwe pizza in");
        newPizza = line.nextLine();
        System.out.println("Voer de bijbehorende prijs in");
        newPrice = sc.nextDouble();

        System.out.println("Pizza " + pizzaNumber + " is gewijzigd in:");
        System.out.println(" Pizza: "+ newPizza);
        System.out.println(" Prijs: "+ newPrice);

        System.out.println(newPizza);
        System.out.println(pizzaNumber);

        pizza[pizzaNumber -1] = newPizza;
        price[pizzaNumber -1] = newPrice;

        System.out.println(pizza[pizzaNumber -1]);

        menuKaart();
        menu();
    }

//      -----------------------------
//		Hier wordt keuze 3 uitgewerkt
///		-----------------------------

    public void three() {

//      -----------------------------
//		Hier wordt de instructie tekst getoond
///		-----------------------------
        System.out.println("U wilt een bestelling doen. Doe dit door het nummer van de pizza in te voeren");
        System.out.println("Alles wordt automatisch bij elkaar opgeteld. Voer een 0 in om af te rekenen.");
        System.out.println();
        System.out.println();
        menuKaart();

        ArrayList<String> bestelling = new ArrayList<String>();
        double totalPrice = 0;
        Boolean exit = false;


        while(exit == false){
            int choice = sc.nextInt();
            if (choice == 0){
                exit = true;
            }else {

                //De keuze moet wel een pizza zijn in de lijst. Dat bepaal ik hier
                while (choice < 1 || choice > 5) {
                    System.out.println("Deze keuze bestaat niet. Probeer het opnieuw.");
                    choice = sc.nextInt();
                }
                //De bestelling wordt hier toegevoegd aan de variabelen
                bestelling.add(pizza[choice - 1]);
                totalPrice = totalPrice + (price[choice - 1]);

                //De huidige bestelling wordt hier uitgeprint
                System.out.println("Uw huidige bestelling is op dit moment  " + bestelling);
            }
        }
        System.out.println("Uw bestelling is compleet. " + "[ " + bestelling + " ]" );
        System.out.println("Dat wordt dan € "+ totalPrice + " alstublieft");
        menu();
    }

}

