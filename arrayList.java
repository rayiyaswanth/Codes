import java.util.Scanner;
import java.util.ArrayList;

class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Initialize the outer list with empty inner lists
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<Integer>());
        }

        // Take input and populate the list
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        // Print the list
        System.out.println(list);
        
        // It will print like this.
        // 1 2 3 4 5 6 7 8 9 -> user Input
        // [[1, 2, 3], [4, 5, 6], [7, 8, 9]] -> output
    }
}
