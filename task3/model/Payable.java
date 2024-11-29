/*
 * The Payable interface provides a contract for payment-related functionality.
 * It ensures that any class needing to handle payments, such as Fee, can implement
 * only the relevant methods, adhering to the Interface Segregation Principle(ISP).
 */

package hallmanagement.model;

/**
 *
 * @author Hp
 */
public interface Payable {

    void payFee(); // Marks the fee as paid
    boolean isPaid(); // Checks if the fee has been paid
    
}
