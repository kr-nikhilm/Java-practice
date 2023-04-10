package CollectionPrograms;

import java.util.HashMap;

public class HashMapDemo {

    static void printList(HashMap<String, Integer> si) {
        // for (String x : si.keySet()) {
        //     System.out.print(x + " ");
        // }
        // System.out.println();
        // for (Integer x : si.values()) {
        //     System.out.print(x + " ");
        // }
        // System.out.println();


        for(String i:si.keySet()){
            System.out.println("Key: "+i+" Value: "+si.get(i));
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> hp = new HashMap<String, Integer>();
        hp.put("Nikhil", 85);
        hp.put("Jaymin", 77);
        hp.put("Anant", 83);
        hp.put("Deep", 80);

        printList(hp);

        System.out.println(hp.get("Nikhil"));

        hp.remove("Deep");
        printList(hp);

        hp.clear();
    }

}
