
import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("ArrayList: " + arrayList);
        System.out.println("Access index 1: " + arrayList.get(1));

        arrayList.set(1, 50);
        arrayList.remove(0);

        System.out.println("Size: " + arrayList.size());

        System.out.print("Traverse: ");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
