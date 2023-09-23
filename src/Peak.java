import java.util.Scanner;
import java.util.Random;

public class Peak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Добро пожаловать в игру 'Угадай число'!");
        System.out.println("Я загадал число от 1 до 100. Попробуйте угадать его.");

        boolean hasGuessed = false;

        while (!hasGuessed) {
            System.out.print("Ваш вариант: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < secretNumber) {
                System.out.println("Попробуйте большее число.");
            } else if (userGuess > secretNumber) {
                System.out.println("Попробуйте меньшее число.");
            } else {
                System.out.println("Поздравляю! Вы угадали число " + secretNumber + " за " + attempts + " попыток.");
                hasGuessed = true;
            }
        }

        scanner.close();
    }
}
