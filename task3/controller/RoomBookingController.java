package hallmanagement.controller;

import hallmanagement.model.Bookable;
import hallmanagement.model.RoomBooking;
import hallmanagement.model.Student;
import hallmanagement.view.RoomBookingView;
import java.util.Date;
/**
 *
 * @author Hp
 */
/*The RoomBookingController class acts as a bridge between the RoomBooking model and the RoomBookingView.
 * It handles user requests, updates the model with new data, and refreshes the view with updated information.
 * This follows the Model-View-Controller (MVC) design pattern. */
public class RoomBookingController {
    private RoomBooking model; //representing the booking data
    private RoomBookingView view; //responsible for displaying booking details

    //Updates the view to display the RoomBooking details.
    public void displayBookingDetails() {
        view.displayBookingDetails();
    }
    
    public RoomBookingController(RoomBooking model, RoomBookingView view) {
        this.model = model;
        this.view = view;
    }

    public void createBooking(Bookable room, Student student, Date startDate, Date endDate) {
        model = new RoomBooking(room, student, startDate, endDate);// Creates a new booking
        view.displayBookingDetails();// Displays the updated booking details in the view
    }

    public void cancelBooking() {
        model.cancelBooking();//cancles the current booking
        view.displayCancellationMessage();// Displays a cancellation message 
    }

    public void updateBookingDates(Date startDate, Date endDate) {
        model.setStartDate(startDate);
        model.setEndDate(endDate);
        view.displayBookingDetails();// Displays the updated booking details in the view
    }

    
}
