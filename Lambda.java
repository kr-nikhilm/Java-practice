import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(10);
        nums.add(30);
        nums.add(20);

        nums.forEach((n) -> {System.out.println(n);});
    }
}
