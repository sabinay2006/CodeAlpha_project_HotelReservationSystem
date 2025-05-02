# CodeAlpha_project_HotelReservationSystem

Name:sabinaya mahapatra

Company: CODE ALPHA

ID: CA/MA1/4435

Domain: Java Programming

Duration: MAY to JUNE, 2025

Overview of the Project
Project: Hotel Reservation System

Objective: To build a hotel reservation system where users can search for available rooms, make reservations, and view booking details. Include features like room categorization and payment processing.

Key Activities
Room Availability: Display available rooms with their types and numbers.
Room Reservation: Allow users to select and book available rooms.
Customer Information: Collect customer details (name, email) for booking.
Booking Confirmation: Display booking details to the user upon successful reservation.
Room Categorization: Categorize rooms into types (e.g., Single, Double, Suite).
Payment Processing: Simulate payment processing with basic validation.
Input Validation: Validate user input, especially email format.

Technologies Used
Java: The programming language used for development.
Scanner: Used for reading user input from the console.
ArrayList: Used for storing lists of rooms and bookings.
regex (Pattern, Matcher): Used for email validation.

Program Structure
Classes
Room:

roomNumber (int): The unique number of the room.
roomType (String): The type of the room (e.g., "Single", "Double", "Suite").
isBooked (boolean): Indicates whether the room is currently booked.
Constructor: Initializes a Room object.
Getters for roomNumber, roomType, and isBooked.
bookRoom(): Marks the room as booked.

Customer:
name (String): The customer's name.
email (String): The customer's email address.
Constructor: Initializes a Customer object.
Getters for name and email.

Booking:
customer (Customer): The customer who made the booking.
room (Room): The room that was booked.
Constructor: Initializes a Booking object.
Getters for customer and room.

PaymentProcessor:
processPayment(String cardNumber, String nameOnCard, String expiryDate, String cvv) (static): Simulates payment processing (basic CVV validation only).

Hotel:
rooms (List): Stores a list of Room objects.
bookings (List): Stores a list of Booking objects.
addRoom(Room room): Adds a room to the hotel.
getAvailableRooms(): Returns a list of rooms that are not booked.
makeBooking(Customer customer, Room room): Creates a booking for a customer and room.

HotelReservationSystem:
main(String[] args): Main method to execute the program. Manages the user interface and program flow.
isValidEmail(String email) (static): Validates the email format using a regular expression.

Compilation and Execution
Prerequisites
Java Development Kit (JDK) installed.
Compilation
Save the code as HotelReservationSystem.java.

Open a command prompt or terminal.

Compile the code:

javac HotelReservationSystem.java
Execution
Execute the compiled code:

java HotelReservationSystem
Usage
The program welcomes the user to the Hotel Reservation System.
The program prompts the user to enter their name and email address.
The program displays a list of available rooms with their room numbers and types.
The user can select a room to book or exit.
If a room is selected, the program confirms the booking and displays booking details.
The program simulates a payment section where the user chooses a payment method.
The program displays a payment success message.
The program asks the user if they want to make another booking.


Future Work
Database Integration: Implement database connectivity to store and retrieve hotel data (rooms, bookings, customers) persistently.
GUI Development: Develop a graphical user interface (GUI) using libraries like Swing or JavaFX for a more user-friendly interface.
Advanced Search and Filtering: Add features to search for rooms based on various criteria (e.g., price range, amenities, availability on specific dates).
Online Payment Gateway Integration: Integrate with a real online payment gateway (e.g., Stripe, PayPal) for actual payment processing.
User Authentication: Implement user accounts and login functionality for customers and hotel staff.
Admin Panel: Create an admin panel for hotel staff to manage rooms, bookings, and other hotel information.
Booking Management: Add features to modify or cancel existing bookings.
Room Amenities: Include details about room amenities (e.g., Wi-Fi, breakfast, pool access).
Date and Time Handling: Implement proper handling of dates and times for booking periods.
Enhanced Error Handling: Improve error handling and validation to make the application more robust.
