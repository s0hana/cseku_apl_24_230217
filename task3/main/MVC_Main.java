package hallmanagement.main;

import hallmanagement.controller.*;
import hallmanagement.model.*;
import hallmanagement.view.*;
import java.util.Date;
/**
 *
 * @author Hp
 */
/**
 * Main class to demonstrate the use of the MVC pattern in the Hall Management System.
 * This class initializes the model, view, and controller components for various entities
 * and demonstrates interactions between them.
 */

public class MVC_Main {
    public static void main(String[] args) {
        // Create a Student model instance by simulating database retrieval
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();

        System.out.println();
        // showing fee management
        Fee newFee = new Fee(234324, model);
        SpecialFee newSpecialFee = new SpecialFee(32324, model, 50);
        FeeView feeView = new FeeView();
        FeeController newController = new FeeController(newFee, feeView);
        newController.updateView();
        FeeController newController2 = new FeeController(newSpecialFee, feeView);
        newController2.updateView();

        System.out.println();
        // showing Address management
        Address address = retriveAddressFromDatabase();
        AddressView addressView = new AddressView();
        AddressController addressController = new AddressController(address, addressView);
        addressController.updateView();

        System.out.println();
        // showing ContactInfo management
        ContactInfo contactInfo = retriveContactInfoFromDatabase();
        ContactInfoView contactInfoView = new ContactInfoView();
        ContactInfoController contactInfoController = new ContactInfoController(contactInfo, contactInfoView);
        contactInfoController.updateView();

        System.out.println();
        // showing Hall management
        Hall hall = new Hall("New Hall", address, contactInfo);
        HallView hallView = new HallView();
        HallController hallController = new HallController(hall, hallView);
        hallController.updateView();

        System.out.println();

        // showing Room management
        Room newRoom = new Room( 188, 838);
        RoomView roomView = new RoomView();
        RoomController roomController = new RoomController(newRoom, roomView);
        roomController.updateView();

        System.out.println();

        // showing RoomBooking management
        Date startDate = new Date(); 
        Date endDate = new Date(startDate.getTime() + 7 * 24 * 60 * 60 * 1000);
        RoomBooking newBooking = new RoomBooking(newRoom, model, startDate, endDate);
        RoomBookingView roomBookingView = new RoomBookingView();
        RoomBookingController roomBookingController = new RoomBookingController(newBooking, roomBookingView);
        roomBookingController.updateBookingDates(startDate, endDate);
        
        System.out.println();  

    }

    /**
     * Simulates retrieving a Student record from the database.
     * @return a populated Student instance.
     */
    private static Student retriveStudentFromDatabase()
    {
       Student newStudent = new Student(null, 0, null, null, null, null);
       newStudent.setName("Nabil");
       newStudent.setStudent_id(678);
       newStudent.setAddress(retriveAddressFromDatabase());
       newStudent.setContactInfo(retriveContactInfoFromDatabase());
       newStudent.setAcademicYear("2023-2024");
       newStudent.setDiscipline("CSE");
       return newStudent;
    }

    /**
     * Simulates retrieving a Address record from the database.
     * @return a populated Address instance.
     */
    private static Address retriveAddressFromDatabase()
    {
        Address address = new Address(null, null, null, null, null);
        address.setStreet("Hall Road");
        address.setPostal_code("6854");
        address.setDistrict("Khulna");
        address.setDivision("Khulna");
        address.setSubDistrict("Jani na");
        return address;
    }

    /**
     * Simulates retrieving a ContactInfo record from the database.
     * @return a populated ContactInfo instance.
     */
    private static ContactInfo retriveContactInfoFromDatabase()
    {
        String email = "nabil@gmail.com";
        String phnNumber = "03894";
        ContactInfo conInfo = new ContactInfo(email, phnNumber);
        return conInfo;
    }

}
