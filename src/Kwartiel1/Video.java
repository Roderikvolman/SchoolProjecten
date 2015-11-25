package Kwartiel1.Minesweeper;

/**
 * Created by Roderik on 23-10-15.
 */
public class Video {
    public static void main(String[] args) throws InterruptedException{
       new Video().run();
    }

    public void run() throws InterruptedException{
        String one = "Welkom bij Saxion";
        String two = "Volg je opleiding in Enschede of Deventer";
        String three = "De opleding in Enschede kun je ook in het Engels volgen";
        String four = "Kies na ongeveer 6 maanden het uitstroomprofiel dat bij je past";
        String five = "ITSM, SE of BIM";
        String sex = "Inspireer jezelf door naar de opendagen te komen";
        String seven = "Of uiteraard dit filmpje te kijken";
        String eight = "Want ICT wordt steeds belangrijker";
        String nine = "Laten we het aan iemand vragen.......";

        String total[] = {one, two, three, four, five, sex, seven, eight, nine};

        for (int i = 0; i < total.length; i++){
            System.out.println(total[i]);
            Thread.sleep(3000);
        }
    }

}


