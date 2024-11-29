package hallmanagement.controller;

import hallmanagement.model.Address;
import hallmanagement.model.ContactInfo;
import hallmanagement.model.Student;
import hallmanagement.view.StudentView;
/**
 *
 * @author Hp
 */
/** The StudentController class acts as a bridge between the Student model and the StudentView.
 * It handles user requests, updates the model with new data, and refreshes the view with updated information.
 * This follows the Model-View-Controller (MVC) design pattern. */
public class StudentController {
    private Student  model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    } 

    //Updates the view to display the current student details.
    public void updateView() {
        // Passes all relevant student details to the view for display
        view.displayStudentDetails(model.getName(), model.getStudent_id(),
        model.getAddress(), model.geContactInfo(), model.getDiscipline(), 
        model.getAcademicYear());
    }

    public String getStudentName()
    {
        return model.getName();
    }
    public int getStudent_id()
    {
        return model.getStudent_id();
    }
    public String getStudentDiscipline()
    {
        return model.getDiscipline();
    }
    public String getStudentAcademicYear()
    {
        return model.getAcademicYear();
    }
    public Address getStudentAddress()
    {
        return model.getAddress();
    }
    public ContactInfo getStudentContactInfo()
    {
        return model.geContactInfo();
    }

    public void setStudentName(String name)
    {
       model.setName(name);
    }
    public void setStudent_id(int id)
    {
        model.setStudent_id(id);
    }
    public void setStudentDiscipline(String discipline)
    {
        model.setDiscipline(discipline);
    }
    public void setStudentAcademicYear(String academicYear)
    {
        model.setAcademicYear(academicYear);
    }
    public void setStudentAddress(Address address)
    {
        model.setAddress(address);
    }
    public void setStudentContactInfo(ContactInfo contactInfo)
    {
        model.setContactInfo(contactInfo);
    }

}
