package Question_2;

import java.util.Scanner;

public class BeverageTest {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Beverages tea = new Tea();
            Beverages coffee = new Coffee();

            System.out.print("Do you want extras with your tea? (yes/no): ");
            String teaExtras = scanner.nextLine();
            tea.setWantsExtras(teaExtras.equalsIgnoreCase("yes"));

            System.out.print("Do you want extras with your coffee? (yes/no): ");
            String coffeeExtras = scanner.nextLine();
            coffee.setWantsExtras(coffeeExtras.equalsIgnoreCase("yes"));

            System.out.println("\nMaking tea...");
            tea.finalTemplateMethod();

            System.out.println("\nMaking coffee...");
            coffee.finalTemplateMethod();
        }
    }
}
