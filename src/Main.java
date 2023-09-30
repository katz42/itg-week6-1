import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какая сейчас температура на улице? Введите целое число в Цельсиях.");
        int temp = scanner.nextInt();
        if (temp < 0 ) {
            System.out.println("Сейчас очень холодно.");
        }
        else if (temp > 16) {
            System.out.println("Отличный летний денек!");
        } else {
            System.out.println("Сейчас прохладно.");
        }
    }
}