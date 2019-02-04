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
        /*default is false
        false = open
        true = closed*/

        for (int i=0; i<lockers.length; i++){
            /*First, open all lockers
             * open = true*/
//            lockers[i]=true;
            int lockerNum = i+1;

            /*if divisible by 2, close*/
            if (lockerNum%2==0){
                lockers[i]=true;
            }

            /*if divisible by 3
             * open or close as appropriate*/
            if (lockerNum%3==0){
                if (lockers[i]=true){
                    lockers[i]=false;
                } else {
                    lockers[i]=true;
                }
            }

            if (lockers[i]=false){
                System.out.print(i+1 + "  ");
            }
        }

        for (int i=0; i<lockers.length; i++){
            if (lockers[i]=false){
                System.out.print(i+1 + "  ");
            }
        }

//        for (int i=0; i<lockers.length; i++){

//            /*if locker is open set boolean to true
//            * if divisible by 2, close or set boolean to false*/
//            if ((i+1)%2==0){
//                lockers[i]=false;
//            }

//            /*if divisible by 3
//            * open or close as appropriate*/
//            if ((i+1)%3==0){
//                if (lockers[i]=false){
//                    lockers[i]=true;
//                } else {
//                    lockers[i]=true;
//                }
//            }
//        }


    }

//    public static void main(String[]args){
//
//        // Assign numbers 1~100 to lockers
//        int[] lockers = new int[100];
//        for (int i=0; i<lockers.length; i++){
//            lockers[i] = i+1;
//        }
//
//        // Start with all lockers open
////        boolean isOpen;
//        int[] openLockers = new int[100];
//
//        for (int n:lockers){
//            isOpen = true;
//            if (n%2==0){
//                isOpen = false;
//                lockerStatus(n, openLockers);
//            }
//        }
//
//        for (int n:lockers){
//            if (n%3==0){
//
//            }
//        }
//
//        for (int n:lockers){
//            if (isOpen=true){
//
//            }
//        }
//
//    }

    public static boolean openOrClose(boolean oc){
        return !oc;
    }


//    public static void lockerStatus(int n, int[]ar){
//        for (int i=0; i<100; i++){
//            ar[i] = n;
//        }
//
//        int numOpened = 100;
//        int numClosed = 0;
//        if (isOpen==true){
//            numOpened--;
//
//        } else if (isOpen==false){
//            numClosed++;
//        }
//
//    }
}
