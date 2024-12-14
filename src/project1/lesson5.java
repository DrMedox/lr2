package project1;
import java.util.Scanner;
import static java.lang.System.*;

public class lesson5 { 
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        out.print("Введите число:");
        int userInput = in.nextInt();
        String numberAsString = String.valueOf(userInput);
        int thousands = userInput / 1000;
        char fourthChar = numberAsString.charAt(numberAsString.length() - 4);
        out.println("Всего тысяч во введенном числе: " + thousands);
        out.println("Четвертая цифра справа: " + fourthChar);

        in.close();
    }
}