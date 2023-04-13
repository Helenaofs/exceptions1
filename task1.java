import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class task1 {
    public static void main(String[] args) {

        Integer[] arr = { 2, 4, 7, null, null, 9, 8, 2 };
        System.out.println("Indexes with null values" + checkArray(arr));
    }

    public static ArrayList<Integer> checkArray(Integer[] arr) {
        ArrayList<Integer> indexes = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                indexes.add(i);
            }
        }
        return indexes;
    }
}
