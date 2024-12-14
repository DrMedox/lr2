package project1;
import java.util.Scanner;
public class lesson1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число");
		int userInput = in.nextInt();
		if (userInput%3==0) {
			System.out.println("Число " + userInput + " делится на 3 БЕЗ остатка");
		}else {
			System.out.println("Число " + userInput + " делится на 3 С остатком");
		}
		in.close();

	}

}
