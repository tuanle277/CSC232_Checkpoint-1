import java.util.Scanner;

public class Driver {
    static Location currLocation;

    /*
     * DePauw
     * Greencaslte
     * building(Julian, GCPA, UB,...)
     * 
     */
    public static void main(String args[]) {
        currLocation = new Location("classroom", "a place where we go in, study, and go right back to bed after");
        currLocation.addItem(
                new Item("table", "Object", "dominant thing in the classroom where computers and notes lie on"));
        currLocation.addItem(new Item("chair", "Object", "the thing which students sit on"));
        currLocation.addItem(new Item("trash can", "Object", "the thing people toss their trash into"));

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter command: ");
        String command = sc.nextLine();
        System.out.println(command);
    }
}
