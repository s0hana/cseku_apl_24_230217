package hallmanagement.controller;

import hallmanagement.model.Address;
import hallmanagement.view.AddressView;
/**
 *
 * @author Hp
 */
/*The AddressController class acts as a bridge between the Address model and the AddressView.
 * It handles user requests, updates the model with new data, and refreshes the view with updated information.
 * This follows the Model-View-Controller (MVC) design pattern. */
public class AddressController {

    private Address model;//representing the data
    private  AddressView view;//responsible for displaying data

    public AddressController(Address model, AddressView view)
    {
        this.model = model;
        this.view = view;
    }
   
    //Updates the view to display the address details.
    public void updateView() {
        view.displayAddressDetails();
    }

    //this part of code updates data of different fields
    public void setStreet(String street)
    {
        model.setStreet(street);
    }
    public void setPostal_code(String postal_code)
    {
        model.setPostal_code(postal_code);
    }
    public void setSubDistrict(String subDistrict)
    {
        model.setSubDistrict(subDistrict);
    }
    public void setDistrict(String district)
    {
        model.setDistrict(district);
    }
    public void setDivision(String division)
    {
        model.setDivision(division);
    }
    
    //this part of code retrieves data of different fields
    public String getStreet()
    {
        return model.getStreet();
    }
    public String getPostal_code()
    {
        return model.getPostal_code();
    }
    public String getSubDistrict()
    {
        return model.getSubDistrict();
    }
    public String getDistrict()
    {
        return model.getDistrict();
    }
    public String getDivision()
    {
        return model.getDivision();
    }

}
