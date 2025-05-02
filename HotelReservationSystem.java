


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Room class
class Room {
    private int roomId;
    private String roomType;
    private boolean isReserved;

    public Room(int roomId, String roomType) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.isReserved = false;
    }

    public int getRoomId() {
        return roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}

// HotelReservationSystem class
public class HotelReservationSystem {
    private List<Room> rooms;
    private Scanner scanner;

    public HotelReservationSystem() {
        this.rooms = new ArrayList<>();
        this.scanner = new Scanner(System.in);

        // Initialize rooms
        rooms.add(new Room(1, "Single"));
        rooms.add(new Room(2, "Double"));
        rooms.add(new Room(3, "Suite"));
    }

    public void displayRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (!room.isReserved()) {
                System.out.println("Room ID: " + room.getRoomId() + ", Room Type: " + room.getRoomType());
            }
        }
    }

    public void reserveRoom() {
        System.out.print("Enter Room ID to reserve: ");
        int roomId = scanner.nextInt();

        for (Room room : rooms) {
            if (room.getRoomId() == roomId && !room.isReserved()) {
                room.setReserved(true);
                System.out.println("Room reserved successfully!");
                return;
            }
        }

        System.out.println("Room not available or already reserved.");
    }

    public void cancelReservation() {
        System.out.print("Enter Room ID to cancel reservation: ");
        int roomId = scanner.nextInt();

        for (Room room : rooms) {
            if (room.getRoomId() == roomId && room.isReserved()) {
                room.setReserved(false);
                System.out.println("Reservation cancelled successfully!");
                return;
            }
        }

        System.out.println("Room not reserved or does not exist.");
    }

    public void run() {
        while (true) {
            System.out.println("\nHotel Reservation System");
            System.out.println("1. Display Available Rooms");
            System.out.println("2. Reserve Room");
            System.out.println("3. Cancel Reservation");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    displayRooms();
                    break;
                case 2:
                    reserveRoom();
                    break;
                case 3:
                    cancelReservation();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public static void main(String[] args) {
        HotelReservationSystem hotelReservationSystem = new HotelReservationSystem();
        hotelReservationSystem.run();
    }
}