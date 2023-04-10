package CollectionPrograms;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

    static void printList(ArrayList<Integer> li) {
        for (int i = 0; i < li.size(); i++) {
            System.out.print(li.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(13);
        nums.add(10);
        nums.add(25);
        nums.add(17);

        printList(nums);

        //nums.set(4,35);  //IndexOutOfBound exception
        nums.set(1, 7); 
        printList(nums);

        //nums.remove(4); //IndexOutOfBound exception
        nums.remove(2);
        printList(nums);

        Collections.sort(nums);
        printList(nums);

        nums.clear();
        printList(nums);

    }
}
