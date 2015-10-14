import java.util.Scanner;

/**
 * Created by Roderik on 02-10-15.
 */
public class Belasting {
    public static void main(String[] args) {

        new Belasting().run();
    }

    Scanner sc = new Scanner(System.in);

    public void run() {

        System.out.println("Ontvangen loon in hele euro's");
        int loon = sc.nextInt();


        int[] bedrag = {19822, 33589, 57585};
        double[] percentages = {36.50, 42, 42};
        double restLoon = loon;
        int hoogsteSchaal = 0;
        double totaal = 0;

        if (restLoon < bedrag[0]) hoogsteSchaal = 1;
        else {
            for (int i = 0; i < bedrag.length; i++) {
                if (restLoon > bedrag[i]) {
                    hoogsteSchaal = hoogsteSchaal + 1;
                }
            }
        }

        System.out.println(hoogsteSchaal);
       for (int i = 0; i <= hoogsteSchaal; i++){
           if (restLoon < bedrag[i]){
               System.out.println("Dit percentage " + percentages[i] + "% over dit loon € " + restLoon + " is € " + restLoon * (percentages[i] / 100));
               totaal = totaal + (restLoon * (percentages[i] / 100));
           }else {
               System.out.println("Dit percentage " +percentages[i] + "% over dit loon € " + bedrag[i] + " is € " + bedrag[i] * (percentages[i] / 100));
               restLoon = restLoon - bedrag[i];
               totaal = totaal + (bedrag[i] * (percentages[i] / 100));
           }

       }
        System.out.println(" ");
        System.out.println("Totaal te betalen aan de belastingdienst € " +totaal);
    }
}


