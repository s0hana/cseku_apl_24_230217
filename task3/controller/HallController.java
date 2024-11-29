package hallmanagement.controller;

import hallmanagement.model.*;
import hallmanagement.view.HallView;
import java.util.List;
/**
 *
 * @author Hp
 */
/*The HallController class acts as a bridge between the Hall model and the HallView.
 * It handles user requests, updates the model with new data, and refreshes the view with updated information.
 * This follows the Model-View-Controller (MVC) design pattern. */
public class HallController {
    private Hall model;//representing the data
    private HallView view;//responsible for displaying hall-related details

    public HallController(Hall model, HallView view)
    {
        this.model = model;
        this.view = view;
    }

    //Updates the view to display the hall details.
    public void updateView() { 
        view.displayHallDetails();
    }
    
    
    public String getHallName()
    {
        return model.getHallName();
    }

    public Address getHallAddress()
    {
        return model.getHallAddress();
    }

    public ContactInfo getHallContactInfo()
    {
        return model.getHallContactInfo();
    }

    public void setHallName(String name)
    {
        model.setHallName(name);
    }

    public void setHallAddress(Address address)
    {
        model.setHallAddress(address);
    }

    public void setHallContactInfo(ContactInfo hallContactInfo)
    {
       model.setHallContactInfo(hallContactInfo);
    }

    // Adds a room to the hall
    public void addRoominHall(RoomDetails room) {
        model.addRoom(room);
    }

    // Returns the list of rooms
    public List<RoomDetails> getHallRooms() {
        return model.getRooms();
    }

}
