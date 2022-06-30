
package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Matrix {
    public static void main(String args[]) {

        List<ArrayList<Integer>> mass = new ArrayList<>();
        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(5, 6, 7, 8));
        ArrayList<Integer> a3 = new ArrayList<>(Arrays.asList(9, 1, 2, 3));
        ArrayList<Integer> a4 = new ArrayList<>(Arrays.asList(4, 5, 6, 7));


        mass.add(a1);
        mass.add(a2);
        mass.add(a3);
        mass.add(a4);


        for (ArrayList<Integer> obj : mass) {

            ArrayList<Integer> temp = obj;

            for (Integer job : temp) {
                System.out.printf("%4d", job);
            }
            System.out.println();
        }
        System.out.println("\nПеревернутая");


        Collections.reverse(mass);
        for (ArrayList<Integer> obj : mass) {
            ArrayList<Integer> temp = obj;
            for (Integer job : temp) {
                System.out.printf("%4d", job);
            }
            System.out.println();
        }
    }
}