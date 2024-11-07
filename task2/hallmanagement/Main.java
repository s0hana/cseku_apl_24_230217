package hallmanagement;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        
        // Creating Address objects
        Address hallAddress = new Address("Street1", "9000", "Subdistrict1", "District1", "Division1");
        Address studentAddress = new Address("Street2", "9001", "Subdistrict2", "District2", "Division2");

        // Creating ContactInfo objects
        ContactInfo hallContact = new ContactInfo("aparajitahall@gmail.com", "12344453");
        ContactInfo studentContact = new ContactInfo("munia432@gmail.com", "135343123");

        // Creating a Student object
        Student student = new Student("Munia", 12345, "Computer Science and Engineering Discipline", "2nd Year", studentContact, studentAddress);

        // Creating a Hall object
        Hall hall = new Hall("Aparajita Hall", hallAddress, hallContact);

        // Creating Room objects
        Room room1 = new Room(101, 2); // Room 101 with capacity for 2
        Room room2 = new Room(102, 3); // Room 102 with capacity for 3

        // Adding rooms to the hall
        hall.addRoom(room1);
        hall.addRoom(room2);

        // Creating a Fee object
        Fee regularFee = new Fee(500.0, student);

        // Creating a SpecialFee object with a scholarship discount of 20%
        SpecialFee specialFee = new SpecialFee(500.0, student, 0.20);

        // Creating a RoomBooking object
        Date startDate = new Date(); // Current date as start date
        Date endDate = new Date(startDate.getTime() + (1000 * 60 * 60 * 24)); // 1 day later

        RoomBooking booking = new RoomBooking(room1, student, startDate, endDate);

        // Displaying details
        System.out.println(hall);
        System.out.println("Available Rooms: " + hall.getRooms());
        System.out.println(student);
        System.out.println(regularFee);
        System.out.println(specialFee);
        System.out.println(booking);

        // Mark the regular fee as paid
        regularFee.payFee();
        System.out.println("Regular Fee Paid Status: " + regularFee.isPaid());

        // Canceling the booking
        booking.cancelBooking();
        System.out.println("Booking after cancellation: " + booking);
    }
}
