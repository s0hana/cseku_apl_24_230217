package hallmanagement.controller;

import hallmanagement.model.Fee;
import hallmanagement.model.SpecialFee;
import hallmanagement.model.Student;
import hallmanagement.view.FeeView;;
/**
 *
 * @author Hp
 */
/*The FeeController class acts as a bridge between the Fee model and the FeeView.
 * It handles user requests, updates the model with new data, and refreshes the view with updated information.
 * This class supports both the base Fee class and its subclass SpecialFee.
 * It follows the Model-View-Controller (MVC) design pattern. */
public class FeeController {
    private Fee model;// Can be either Fee or SpecialFee(SpecialFee is the child class of Fee)
    private FeeView view;

    public FeeController(Fee model, FeeView view) {
        this.model = model;
        this.view = view;
    }

    //Updates the view to display the Fee details.
    public void updateView() { 
        view.displayFeeDetails(model);
    }

    public void setFeeAmount(double amount) {
        model.setAmount(amount);
    }

    public void payFee() {
        model.payFee();
    }

    public double getFeeAmount() {
        return model.getAmount();
    }

    public void setFeepaid() {
        model.payFee();
    }

    public boolean getFeeType() {
        return model.isPaid();
    }

    public Student getStudent()
    {
        return model.getStudent();
    }

    public void setStudent(Student student)
    {
        model.setStudent(student);
    }
    /*Retrieves the scholarship discount rate, if applicable.
     * This method only works for SpecialFee instances.*/
    public double getScholarshipDiscountRate() {
        if (model instanceof SpecialFee) {
            return ((SpecialFee) model).getScholarshipDiscountRate();
        } else {
            throw new UnsupportedOperationException("This fee does not have a scholarship discount.");
        }
    }
    /*Sets the scholarship discount rate, if applicable.
     * This method only works for SpecialFee instances.*/
    public void setScholarshipDiscountRate(double rate) {
        if (model instanceof SpecialFee) {
            ((SpecialFee) model).setScholarshipDiscountRate(rate);
        } else {
            throw new UnsupportedOperationException("This fee does not have a scholarship discount.");
        }
    }
}

