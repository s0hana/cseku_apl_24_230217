package hallmanagement.controller;

import hallmanagement.model.ContactInfo;
import hallmanagement.view.ContactInfoView;
/**
 *
 * @author Hp
 */
/*The ContactInfoController class acts as a bridge between the ContactInfo model and the ContactInfoView.
 * It handles user requests, updates the model with new data, and refreshes the view with updated information.
 * This follows the Model-View-Controller (MVC) design pattern. */
public class ContactInfoController {
    private ContactInfo model;//representing the data
    private ContactInfoView view;//responsible for displaying data

    public ContactInfoController(ContactInfo model, ContactInfoView view)
    {
        this.model = model;
        this.view = view;
    }
    
    //Updates the view to display the address details.
    public void updateView() {
        view.displayContactInfoDetails();
    }

    
    public String getEmail()
    {
        return model.getEmail();
    }
    public String getPhoneNumber()
    {
        return model.getPhoneNumber();
    }

    public void setEmail(String email)
    {
        model.setEmail(email);
    }
    public void setPhoneNumber(String phoneNumber)
    {
        model.setPhoneNumber(phoneNumber);
    }
}
