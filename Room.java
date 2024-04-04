package OOP;

import java.util.Scanner;

public class Room {
    private static int totalRooms = 0;

    private boolean isAvailable;
    private String borrower;

	private static Scanner scanner;

    public Room() {
        isAvailable = true;
        borrower = "";
    }

    public static int getTotalRooms() {
        return totalRooms;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getBorrower() {
        return borrower;
    }

    public void reserveRoom(String borrower) {
        isAvailable = false;
        this.borrower = borrower;
        totalRooms++;
        System.out.println("Room reserved successfully by " + borrower);
    }

    public void releaseRoom() {
        isAvailable = true;
        borrower = "";
        totalRooms--;
        System.out.println("Room released successfully.");
    }

    public void checkRoomAvailability() {
        System.out.println("\nRoom Availability:");
        System.out.println("Room is " + (isAvailable ? "available" : "not available"));
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        Room room = new Room();

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Check Room Availability");
            System.out.println("2. Reserve Room");
            System.out.println("3. Release Room");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    room.checkRoomAvailability();
                    break;
                case 2:
                    System.out.print("Enter your name to reserve the room: ");
                    String borrower = scanner.next();
                    room.reserveRoom(borrower);
                    break;
                case 3:
                    room.releaseRoom();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
