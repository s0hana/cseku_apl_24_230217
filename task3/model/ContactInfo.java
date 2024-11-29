/*
 * The ContactInfo class represents the contact details of an entity, 
 * such as email and phone number. This class follows the Single Responsibility Principle (SRP),
 * as it only handles contact-related information.
 */

package hallmanagement.model;

/**
 *
 * @author Hp
 */
public class ContactInfo {

    // Declaring private instance variables to ensure encapsulation
    private String email;
    private String phoneNumber;

    // Constructor initializing ContactInfo fields
    public ContactInfo(String email, String phoneNumber)
    {
        this.email = email;
        this.phoneNumber = phoneNumber;
    }


    // Getters for retrieving contact details
    public String getEmail()
    {
        return email;
    }
    public String getPhoneNumber()
    {
        return phoneNumber;
    }

     // Setters for updating contact details
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    // Overrides toString for showing contact information
    @Override
    public String toString()
    {
        return "E-mail: "+email+" Phone number: "+phoneNumber;
    }
}
