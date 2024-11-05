/*
 * The Address class represents the physical address of an entity.
 * It follows SRP by managing only address-related information.
 */

package hallmanagement;

/**
 *
 * @author Hp
 */
public class Address {

    // Declaring private instance variables to ensure encapsulation
    private String street;
    private String postal_code;
    private String subDistrict;
    private String district;
    private String division;

    // Constructor initializing Address fields
    public Address(String street, String postal_code, String subDistrict, String district, String division)
    {
        this.street = street;
        this.postal_code = postal_code;
        this.subDistrict = subDistrict;
        this.district = district;
        this.division = division;
    }

     // Getters for retrieving address details
    public String getStreet()
    {
        return street;
    }
    public String getPostal_code()
    {
        return postal_code;
    }
    public String getSubDistrict()
    {
        return subDistrict;
    }
    public String getDistrict()
    {
        return district;
    }
    public String getDivision()
    {
        return division;
    }

     // Setters for updating address details
    public void setStreet(String street)
    {
        this.street = street;
    }
    public void setPostal_code(String postal_code)
    {
        this.postal_code = postal_code;
    }
    public void setSubDistrict(String subDistrict)
    {
        this.subDistrict = subDistrict;
    }
    public void setDistrict(String district)
    {
        this.district = district;
    }
    public void getDivision(String division)
    {
        this.division = division;
    }

    // Overrides toString to show address details
    @Override
    public String toString()
    {
        return "Street: "+street+" Postal Code: "+postal_code+ " Sub-district: "+subDistrict+" District: "+district+" Division: "+division;
    }

}
