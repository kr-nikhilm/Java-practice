package OOPs;
public class modifier {
    final int x;

    modifier(int num){
        x = num;
    }
    public static void main(String[] args) {
        modifier m1 = new modifier(5);
        System.out.println(m1.x);
    }
}
