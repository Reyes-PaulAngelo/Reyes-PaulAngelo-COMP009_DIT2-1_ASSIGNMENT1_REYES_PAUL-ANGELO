package OOP;

import java.util.Scanner;

public class Asset{
    private static final int MAX_PROJECTORS = 3;
    private static final int MAX_WHITE_SCREENS = 2;
    private static final int MAX_CALCULATORS = 3;
    private static final int MAX_TVS = 2;

    private static int projectorsAvailable = MAX_PROJECTORS;
    private static int whiteScreensAvailable = MAX_WHITE_SCREENS;
    private static int calculatorsAvailable = MAX_CALCULATORS;
    private static int tvsAvailable = MAX_TVS;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nAsset Management Menu:");
            System.out.println("1. Reserve Asset");
            System.out.println("2. Return Asset");
            System.out.println("3. Check Asset Availability");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    reserveAssetMenu(scanner);
                    break;
                case 2:
                    returnAssetMenu(scanner);
                    break;
                case 3:
                    checkAssetAvailability();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void reserveAssetMenu(Scanner scanner) {
        System.out.println("\nReserve Asset Menu:");
        System.out.println("1. Reserve Projector");
        System.out.println("2. Reserve White Screen");
        System.out.println("3. Reserve Calculator");
        System.out.println("4. Reserve TV");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                reserveProjector();
                break;
            case 2:
                reserveWhiteScreen();
                break;
            case 3:
                reserveCalculator();
                break;
            case 4:
                reserveTV();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void returnAssetMenu(Scanner scanner) {
        System.out.println("\nReturn Asset Menu:");
        System.out.println("1. Return Projector");
        System.out.println("2. Return White Screen");
        System.out.println("3. Return Calculator");
        System.out.println("4. Return TV");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                returnProjector();
                break;
            case 2:
                returnWhiteScreen();
                break;
            case 3:
                returnCalculator();
                break;
            case 4:
                returnTV();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void reserveProjector() {
        if (projectorsAvailable > 0) {
            projectorsAvailable--;
            System.out.println("Projector booked successfully.");
        } else {
            System.out.println("All projectors are already booked.");
        }
    }

    private static void reserveWhiteScreen() {
        if (whiteScreensAvailable > 0) {
            whiteScreensAvailable--;
            System.out.println("White screen booked successfully.");
        } else {
            System.out.println("All white screens are already booked.");
        }
    }

    private static void reserveCalculator() {
        if (calculatorsAvailable > 0) {
            calculatorsAvailable--;
            System.out.println("Calculator booked successfully.");
        } else {
            System.out.println("All calculators are already booked.");
        }
    }

    private static void reserveTV() {
        if (tvsAvailable > 0) {
            tvsAvailable--;
            System.out.println("TV booked successfully.");
        } else {
            System.out.println("All TVs are already booked.");
        }
    }

    private static void returnProjector() {
        if (projectorsAvailable < MAX_PROJECTORS) {
            projectorsAvailable++;
            System.out.println("Projector returned successfully.");
        } else {
            System.out.println("All projectors are already available.");
        }
    }

    private static void returnWhiteScreen() {
        if (whiteScreensAvailable < MAX_WHITE_SCREENS) {
            whiteScreensAvailable++;
            System.out.println("White screen returned successfully.");
        } else {
            System.out.println("All white screens are already available.");
        }
    }

    private static void returnCalculator() {
        if (calculatorsAvailable < MAX_CALCULATORS) {
            calculatorsAvailable++;
            System.out.println("Calculator returned successfully.");
        } else {
            System.out.println("All calculators are already available.");
        }
    }

    private static void returnTV() {
        if (tvsAvailable < MAX_TVS) {
            tvsAvailable++;
            System.out.println("TV returned successfully.");
        } else {
            System.out.println("All TVs are already available.");
        }
    }

    private static void checkAssetAvailability() {
        System.out.println("\nAsset Availability:");
        System.out.println("Projectors: " + projectorsAvailable + " / " + MAX_PROJECTORS);
        System.out.println("White Screens: " + whiteScreensAvailable + " / " + MAX_WHITE_SCREENS);
        System.out.println("Calculators: " + calculatorsAvailable + " / " + MAX_CALCULATORS);
        System.out.println("TVs: " + tvsAvailable + " / " + MAX_TVS);
    }
}
