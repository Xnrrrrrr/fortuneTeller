import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<String> yesNoFortunes = Arrays.asList(
                "Yes, definitely you fucking retard.",
                "No, absolutely not dick face.",
                "It is extremely likely cunt.",
                "I'm not sure, try again later stupid.",
                "Cannot predict now."
        );

        List<String> dailyFortunes = Arrays.asList(
                "Today is your lucky day!",
                "Be cautious in your decisions today.",
                "A surprise is waiting for you.",
                "Success is on the horizon.",
                "Your hard work will pay off."
        );

        List<String> luckyNumbersFortunes = Arrays.asList(
                "Your lucky numbers are: 3, 7, 12, 21, 33, 42",
                "Today's special numbers are: 8, 15, 24, 29, 36, 47",
                "Feeling lucky? Try: 4, 11, 18, 25, 30, 39",
                "Lucky numbers for today: 1, 9, 16, 22, 28, 44",
                "Pick these numbers: 2, 10, 19, 27, 35, 46"
        );

        System.out.println("-----------------------------------------------");
        System.out.println("|       Welcome to the Fortune Teller!        |");
        System.out.println("|   My name is Clit, how can I be of service? |");
        System.out.println("-----------------------------------------------");

        System.out.println("-----------------------------------------------");
        System.out.println("|        Please select a category             |");
        System.out.println("|      so i can better serve you              |");
        System.out.println("-----------------------------------------------");

        System.out.println("--------------------------------------------------");
        System.out.println("|        1. Ask a yes/no question                |");
        System.out.println("|        2. Get your daily fortune               |");
        System.out.println("|        3. Get your lucky numbers               |");
        System.out.println("|        4. Add a custom fortune                 |");
        System.out.println("|        5. List custom fortunes                 |");
        System.out.println("|        6. Quit                                 |");
        System.out.println("--------------------------------------------------");

        while (true) {
            System.out.print("Choose an option (1-6): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Ask a yes/no question: ");
                    String question = scanner.nextLine();
                    String yesNoFortune = getRandomFortune(yesNoFortunes, random);
                    System.out.println("Answer: " + yesNoFortune);
                    break;
                case 2:
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your birth date (MM/DD): ");
                    String birthDate = scanner.nextLine();
                    String dailyFortune = getRandomFortune(dailyFortunes, random);
                    System.out.println(name + "'s Daily Fortune: " + dailyFortune);
                    break;
                case 3:
                    String luckyNumbersFortune = getRandomFortune(luckyNumbersFortunes, random);
                    System.out.println("Lucky Numbers: " + luckyNumbersFortune);
                    break;
                case 4:
                    System.out.print("Enter a custom fortune: ");
                    String customFortune = scanner.nextLine();
                    yesNoFortunes.add(customFortune);
                    dailyFortunes.add(customFortune);
                    luckyNumbersFortunes.add(customFortune);
                    System.out.println("Custom fortune added successfully.");
                    break;
                case 5:
                    listFortunes(yesNoFortunes);
                    break;
                case 6:
                    System.out.println("Exiting the Enhanced Fortune Teller App. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static String getRandomFortune(List<String> fortunes, Random random) {
        int index = random.nextInt(fortunes.size());
        return fortunes.get(index);
    }

    private static void listFortunes(List<String> fortunes) {
        if (fortunes.isEmpty()) {
            System.out.println("No custom fortunes added yet.");
            return;
        }

        System.out.println("Custom Fortunes:");
        for (int i = 0; i < fortunes.size(); i++) {
            System.out.println((i + 1) + ". " + fortunes.get(i));
        }
    }
}
