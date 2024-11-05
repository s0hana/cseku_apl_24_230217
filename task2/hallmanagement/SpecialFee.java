/* 
* The SpecialFee class represents a fee with a discount, applied for students who receive financial support.
* This class extends Fee and adheres to the Liskov Substitution Principle(LSP) by behaving as a substitutable type for Fee.
* LSP is maintained since SpecialFee overrides getAmount in a way that remains compatible with Fee's behavior.
*/

package hallmanagement;

/**
 *
 * @author Hp
 */
public class SpecialFee extends Fee {
    
    // Discount rate applied to the standard fee amount for eligible students
    private double scholarshipDiscountRate; 

    // Constructor initializes the fee amount, student, and discount rate
    public SpecialFee(double standardAmount, Student student, double scholarshipDiscountRate) {
        super(standardAmount, student); // Calls Fee constructor to set the standard amount and student
        this.scholarshipDiscountRate = scholarshipDiscountRate; // Sets the discount rate for the fee
    }

    // Overrides getAmount to apply the scholarship discount to the standard fee amount
    @Override
    public double getAmount() {
        return super.getAmount() * (1 - scholarshipDiscountRate); // Calculates the fee after applying the discount
    }

    // Getter for scholarship discount rate
    public double getScholarshipDiscountRate() {
        return scholarshipDiscountRate;
    }

    // Setter for updating the scholarship discount rate, if needed
    public void setScholarshipDiscountRate(double scholarshipDiscountRate) {
        this.scholarshipDiscountRate = scholarshipDiscountRate;
    }

    // Overrides toString to show fee amount with scholarship discount
    @Override
    public String toString() {
        return "SpecialFee [Discounted Amount: " + getAmount() + 
               ", Scholarship Discount Rate: " + scholarshipDiscountRate * 100 + "%]";
    }
}
