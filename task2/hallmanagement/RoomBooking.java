/*
 * The RoomBooking class "manages" the "booking process" for a room in the hall management system.
 * This class follows the Single Responsibility Principle(SRP) as it only handles booking-related operations.
 * It also adheres to the Dependency Inversion Principle(DIP) by depending on the "Bookable" abstraction for rooms.
 */

package hallmanagement;
import java.util.Date;
/**
 *
 * @author Hp
 */
public class RoomBooking {

     // Declaring private instance variables to ensure encapsulation
    private Bookable room; // The room to be booked, following DIP by using the Bookable interface
    private Student student; // The student who booked the room, using the Student class
    private Date startDate;  // The start date of the booking
    private Date endDate;    // The end date of the booking

    // Constructor initializes booking details
    public RoomBooking(Bookable room, Student student, Date startDate, Date endDate) {
        this.room = room;
        this.student = student;
        this.startDate = startDate;
        this.endDate = endDate;
        room.setAvailability(false); // Marks room as booked 
    }

    // Cancels the booking by freeing up the room and resetting availability
    public void cancelBooking() {
        room.setAvailability(true); // Frees up the room when booking is canceled
    }

    // Getters for accessing booking details
    public Bookable getRoom() {
        return room;
    }

    public Student getStudent() {
        return student;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    // Setter for updating booking details(if needed)
    public void setRoom(Bookable room)
    {
        this.room = room;
    }

    public void setStudent(Student student)
    {
        this.student = student;
    }

    //If the start date input is incorrect
    public void setStartDate(Date startDate)
    {
        this.startDate = startDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    // Overrides toString, it will show booking details
    @Override
    public String toString() {
        return "Booking Details:\n" +
               "Student: " + student.getName() + " (ID: " + student.getStudent_id()+ ")\n" +
               "Room Number: " + ((RoomDetails) room).getRoomNumber() + "\n" +
               "Start Date: " + startDate + "\n" +
               "End Date: " + endDate + "\n" +
               "Room Availability After Booking: " + room.isAvailable();
    }
}