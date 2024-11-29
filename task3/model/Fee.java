/*
 * The Fee class handles fee related functionality and implements the Payable interface.
 * SRP: Focuses solely on fee management, adhering to SRP.
 * ISP: Only implements payment related methods from the Payable interface.
 */

package hallmanagement.model;

/**
 *
 * @author Hp
 */
public class Fee implements Payable {
    private double amount;
    private Student student;
    private boolean paid;

    // Constructor initializes the fee amount and student information
    public Fee(double amount, Student student) {
        this.amount = amount;
        this.student = student; //uses object of Student class to mark the student who payments or not
        this.paid = false; // Default unpaid status
    }

    // Implementation of Payable interface method to mark fee as paid
    @Override
    public void payFee() {
        this.paid = true;
    }

    // Checks if the fee has been paid
    @Override
    public boolean isPaid() {
        return paid;
    }

    // Getters for accessing details
    public double getAmount() {
        return amount;
    }

    public Student getStudent()
    {
        return this.student;
    }

    // Setters for updating details
    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public void setStudent(Student student)
    {
        this.student = student;
    }

    //Overrides toString method to show the amount of fee and payment status
    @Override
    public String toString() {
        return "Fee [Amount: " + amount + ", Paid: " + paid + "]";
    }
}