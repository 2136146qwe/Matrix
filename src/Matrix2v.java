package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matrix2v {
        public static void main(String[] args) {
            Object[][] mass = {
                    { 1,2,3,4 },
                    { 5,6,7,8 },
                    {  9,1,2,3  },
                    {  4,5,6,7  }
            };
            List<List<Object>> array = new ArrayList<List<Object>>();
            for (Object[] row : mass) {
                array.add(Arrays.asList(row));
            }

            System.out.println(array);

            System.out.println("\nПеревернутая");

            array = transpose(array);
            System.out.println(array);
        }
        static <T> List<List<T>> transpose(List<List<T>> table) {
            List<List<T>> tr = new ArrayList<List<T>>();
            final int N = table.get(0).size();
            for (int i = 0; i < N; i++) {
                List<T> col = new ArrayList<T>();
                for (List<T> row : table) {
                    col.add(row.get(i));
                }
                tr.add(col);
            }
            return tr;
        }
    }
