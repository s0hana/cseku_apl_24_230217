/*
 * The Bookable interface specifies the contract for booking functionality.
 * Classes that implement this interface provide a way to manage availability status.
 * This satisfies the Interface Segregation Principle(ISP) by ensuring only classes that need booking functionality implement it.
 */

package hallmanagement;

/**
 *
 * @author Hp
 */
public interface Bookable {

    boolean isAvailable(); // Checks if the room is available for booking
    void setAvailability(boolean available); // Sets the availability status
}
