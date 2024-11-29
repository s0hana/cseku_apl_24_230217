/*
 * The Room class represents a room in the hall and implements Bookable and RoomDetails interfaces.
 * SRP: This class manages only room-specific data.
 * OCP: We can extend Room to create specific room types without modifying this class.
 * ISP: Room implements only the relevant interfaces (Bookable and RoomDetails).
 */
package hallmanagement.model;

/**
 *
 * @author Hp
 */
public class Room implements Bookable, RoomDetails {
    private int roomNumber;
    private int capacity;
    private boolean available;

    // Constructor initializing the room details
    public Room(int roomNumber, int capacity) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.available = true; // Room starts as available by default
    }

    // Implementation of Bookable interface method
    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailability(boolean available) {
        this.available = available;
    }

    // Implementation of RoomDetails interface methods
    @Override
    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    //Setters for updating room details if necessary
    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public void setCapacity(int capacity)
    {
        this.capacity = capacity;
    }

    //Returns room's details as String
    @Override
    public String toString() {
        return "Room " + roomNumber + " (Capacity: " + capacity + ", Available: " + available + ")";
    }
}