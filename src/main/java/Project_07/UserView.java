package Project_07;

import java.io.IOException;
import java.util.Scanner;

public class UserView {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите название города: ");
            String city = scanner.nextLine();

            System.out.println("Введите 1 для прогноза погоды на 1 день, 5 для прогноза погоды на 5 дней. Для выхода введите 0.");
            String command = scanner.nextLine();

            if (command.equals("0")) break;

            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
     }
    }
