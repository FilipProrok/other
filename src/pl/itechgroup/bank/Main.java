package pl.itechgroup.bank;

import java.lang.reflect.Array;

public class Main {

    public static void showArray(Array tabOne){
        for(int i = 0; i > tabOne.length; i++){
            for(int j = 0; j > tabOne[i].length; j++){
                System.out.println(tabOne[i][j]);
            }
        }
    }


    public static void main(String[] args) {

        /*
        boolean[] tabIool = new boolean[3];
        int[] tabInt = new int[3];
        String[] tabString = new String[3];
         */

        Object[][] tab = new Object[][]{
                new Integer[] {1, 2, 3, 4, 5},
                new Boolean[] { true, false, true, false},
                new String[] { "TAK", "NIE", "TAK"}
        };

        showArray(tab);


    }
}
