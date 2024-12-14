package project1;
import java.util.Scanner;
import static java.lang.System.*;
public class lesson3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			out.print("Введите число:");
			int userInput = in.nextInt();
			if (userInput%4==0 && userInput>=10) {
				out.println("Ваше число выполняет условия");
			}else {
				out.println("Ваше число НЕ выполняет условия");
			}
		in.close();

	}

}
