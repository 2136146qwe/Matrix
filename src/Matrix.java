package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Matrix {
    public static void main(String args[]) {

        List<ArrayList<Integer>> mass = new ArrayList<>();

        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        ArrayList<Integer> a4 = new ArrayList<Integer>();


        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);

        a2.add(5);
        a2.add(6);
        a2.add(7);
        a2.add(8);

        a3.add(9);
        a3.add(1);
        a3.add(2);
        a3.add(3);

        a4.add(4);
        a4.add(5);
        a4.add(6);
        a4.add(7);


        mass.add(a1);
        mass.add(a2);
        mass.add(a3);
        mass.add(a4);


        for (ArrayList obj : mass) {

            ArrayList<Integer> temp = obj;

            for (Integer job : temp) {
                System.out.printf("%4d", job);
            }
            System.out.println();
        }
        System.out.println("\nПеревернутая");


        Collections.reverse(mass);
        for (ArrayList obj : mass) {
            ArrayList<Integer> temp = obj;
            for (Integer job : temp) {
                System.out.printf("%4d", job);
            }
            System.out.println();
        }
    }
}