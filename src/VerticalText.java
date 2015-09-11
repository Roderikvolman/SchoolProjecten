import java.util.Scanner;

/**
 * Created by Roderik on 04-09-15.
 */
public class VerticalText {
    public static void main(String[] args) {
        new VerticalText().run();

    }

    public void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Write down your names");

        String str = sc.nextLine();
        char[] charArray = str.toCharArray();

        int CharArrayLength = charArray.length - 1;
        for (int i = 0; i <= CharArrayLength; i++) {
            System.out.println(charArray[i]);
        }


    }
}
