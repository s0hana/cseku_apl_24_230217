/*
 * The Hall class manages the list of rooms in a hall.
 * SRP: Manages hall-specific data and room collections.
 * DIP: Depends on the RoomDetails abstraction rather than a concrete Room class.
 */

package hallmanagement;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Hp
 */
public class Hall {
    private String hallName;
    private Address hallAddress;
    private ContactInfo hallContactInfo;
    private List<RoomDetails> rooms; // Uses RoomDetails abstraction for dependency inversion

    // Constructor initializes the hall with a name and address
    public Hall(String name, Address address, ContactInfo hallContactInfo) {
        this.hallName = name;
        this.hallAddress = address;
        this.hallContactInfo = hallContactInfo;
        this.rooms = new ArrayList<>();
    }

    // Getters for accessing hall details
    public String getHallName()
    {
        return hallName;
    }

    public Address getHallAddress()
    {
        return hallAddress;
    }

    public ContactInfo getHallContactInfo()
    {
        return hallContactInfo;
    }

    //Setters for updating hall details(if needed) 
    public void setHallName(String name)
    {
        this.hallName = name;
    }

    public void setHallAddress(Address address)
    {
        this.hallAddress = address;
    }

    public void setHallContactInfo(ContactInfo hallContactInfo)
    {
        this.hallContactInfo = hallContactInfo;
    }

    // Adds a room to the hall
    public void addRoom(RoomDetails room) {
        rooms.add(room);
    }

    // Returns the list of rooms
    public List<RoomDetails> getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "Hall Details:\nHall Name: " + hallName + "\nAddress: \n" + hallAddress+"\nContact information: \n"+hallContactInfo;
    }
}