package hallmanagement.view;

import hallmanagement.model.Address;
import hallmanagement.model.ContactInfo;
/**
 *
 * @author Hp
 */
//Represents the view for displaying student details in the Hall Management System.
public class StudentView {
    /*to test my code I have written this method in details, 
    other methods in different classes are written as instructed */
    public void displayStudentDetails(String name, int id, Address address, ContactInfo contactInfo, String discipline, String accdemicyear) {
        System.out.println("Name: "+name);
        System.out.println("Student id: "+id);
        System.out.println("Address: "+address);
        System.out.println("Contact info: "+contactInfo);
        System.out.println("Discipline: "+discipline);
        System.out.println("Academic year: "+accdemicyear);
    }
}
