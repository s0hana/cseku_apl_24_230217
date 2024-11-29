package hallmanagement.view;

import hallmanagement.model.Fee;
import hallmanagement.model.SpecialFee;
/**
 *
 * @author Hp
 */
//Represents the view for displaying Fee or Special Fee details in the Hall Management System.
public class FeeView {
    public void displayFeeDetails(Fee fee) {
        if (fee instanceof SpecialFee) {
            System.out.println("Displaying  Special Fee Details...");//displays a static message as instructed.
    }
    else
    {
        System.out.println("Displaying Fee Details...");//displays a static message as instructed.
    }

}
}
