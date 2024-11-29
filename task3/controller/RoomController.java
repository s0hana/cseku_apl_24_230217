package hallmanagement.controller;

import hallmanagement.model.Room;
import hallmanagement.view.RoomView;
/**
 *
 * @author Hp
 */
/*The RoomController class acts as a bridge between the Room model and the RoomView.
 * It handles user requests, updates the model with new data, and refreshes the view with updated information.
 * This follows the Model-View-Controller (MVC) design pattern. */
public class RoomController {
    private Room model;
    private RoomView view; 

    public RoomController(Room model, RoomView view) {
        this.model = model;
        this.view = view;
    }

    //Updates the view to display the current room details.
    public void updateView() {
        view.displayRoomDetails();
    }

    public void setRoomNumber(int number) {
        model.setRoomNumber(number);
    }

    public int getRoomNumber() {
        return model.getRoomNumber();
    }

    public void setCapacity(int capacity) {
        model.setCapacity(capacity);
    }

    public int getCapacity() {
        return model.getCapacity();
    }
}
