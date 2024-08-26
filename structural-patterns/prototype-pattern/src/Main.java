/**
 * Specify the kinds of objects to create using a prototypical
 * instance, and create new objects by copying this prototype.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Designating a target.
        TargetPrototype target = new TargetPrototype("Mig-35", 74.0, 0.0);
        System.out.println("F-16 is tracking target " + target.getId() + " at " + target.getLocation());
        TargetPrototype newTarget = target.clone();
        // A new instance of the target has appeared.
        // We want the same target information but with a different
        // location without having to re-fetch target details.
        newTarget.setLongitude(1.0);
        newTarget.setLatitude(2.0);
        System.out.println("USS Virginia is acquiring target " + newTarget.getId() + " at " + newTarget.getLocation());
    }
}