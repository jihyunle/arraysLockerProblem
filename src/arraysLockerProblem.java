/*Write a program to simulate the following experiment.:
You have 100 closed lockers.
Start with the first locker and for every locker open it.
Now, starting with the second locker, for this locker and every second locker after that, if the locker is open, close it; if it is closed, open it.
Then, starting with the third locker, for this locker and every third locker after that, if the locker is open, close it; if it is closed, open it.
Continue with the nth locker changing the “position” of every nth locker until n = 100.
Print out the locker numbers that remain open. What do you notice about the lockers that remain open?*/

public class arraysLockerProblem {

    public static void main(String[]args){
        boolean[] lockers = new boolean[100];

        // Open all lockers by setting bool value to true
//        openAllLockers(lockers);

        // Change locker status as needed
        changeLockerStatus(lockers);

        // Print
        print(lockers);
    }

    public static void openAllLockers(boolean[] lockers){
        for (int i=0; i<lockers.length; i++){
            lockers[i] = true;
        }
    }

    public static void changeLockerStatus(boolean[] lockers){
        /*
        * Change the status of nth locker as n approaches 100
        * Outer loop goes through every locker*/
        for (int i = 0; i < lockers.length; i++){

            // Inner loop does the closing/opening every nth locker
            for (int j = i; j < lockers.length; j += (i+1)){
                    lockers[j] = !lockers[j];
            }
        }
    }

    public static void print(boolean[] lockers){
        for (int i = 0; i < lockers.length; i++){
            if (lockers[i]){
                System.out.print(i+1 + "  ");
            }
        }
    }

}
