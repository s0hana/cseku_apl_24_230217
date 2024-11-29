/*
 * The RoomDetails interface provides a contract for accessing room-specific information.
 * By defining specific getters, we ensure only classes needing room-related details implement it.
 * This satisfies ISP by preventing classes from depending on unnecessary methods.
 */

package hallmanagement.model;

/**
 *
 * @author Hp
 */
public interface RoomDetails {
    int getRoomNumber(); // Retrieves the room number
    int getCapacity(); // Retrieves the room capacity
}
