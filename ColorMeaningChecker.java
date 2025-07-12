import java.util.*;

public class ColorMeaningChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> colorMap = new HashMap<>();

        // Predefined color meanings
        colorMap.put("Red", "Symbolizes passion, energy, and love");
        colorMap.put("Blue", "Represents calmness, stability, and trust");
        colorMap.put("Green", "Stands for nature, growth, and harmony");
        colorMap.put("Yellow", "Symbolizes happiness, optimism, and creativity");
        colorMap.put("Black", "Represents power, elegance, and mystery");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Check color meaning");
            System.out.println("2. Add new color meaning");
            System.out.println("3. Show all available colors");
            System.out.println("4. Exit");

            String choice = scanner.nextLine().trim();

            switch (choice) {
                case "1":
                    System.out.print("Enter color name: ");
                    String color = scanner.nextLine().trim();

                    if (color.isEmpty()) {
                        System.out.println("Invalid input. Color name cannot be blank.");
                    } else if (colorMap.containsKey(color)) {
                        System.out.println(color + " → " + colorMap.get(color));
                    } else {
                        System.out.println("Color not found. Try again.");
                    }
                    break;

                case "2":
                    System.out.print("Enter new color name: ");
                    String newColor = scanner.nextLine().trim();

                    if (newColor.isEmpty()) {
                        System.out.println("Color name cannot be blank.");
                        break;
                    }

                    if (colorMap.containsKey(newColor)) {
                        System.out.println("Color already exists with meaning: " + colorMap.get(newColor));
                    } else {
                        System.out.print("Enter meaning for " + newColor + ": ");
                        String meaning = scanner.nextLine().trim();

                        if (meaning.isEmpty()) {
                            System.out.println("Meaning cannot be blank.");
                        } else {
                            colorMap.put(newColor, meaning);
                            System.out.println("New color added successfully!");
                        }
                    }
                    break;

                case "3":
                    System.out.println("Available colors:");
                    for (String key : colorMap.keySet()) {
                        System.out.println("- " + key);
                    }
                    break;

                case "4":
                    System.out.println("Exiting... Have a colorful day!");
                    return;

                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
            }
        }
    }
}