
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        System.out.println("LinkedList: " + linkedList);
        System.out.println("Access index 1: " + linkedList.get(1));

        linkedList.set(1, 50);
        linkedList.remove(0);

        System.out.println("Size: " + linkedList.size());

        System.out.print("Traverse: ");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }

        System.out.println();
    }
}
