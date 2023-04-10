public class array {
    public static void main(String[] args) {
        // declaration types
        //int[] a;
        String[] cars = { "Volvo", "BMW", "Ford" };

        // lenth
        System.out.println(cars.length);

        // traverse
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        // for each
        for (String x : cars) {
            System.out.println(x);
        }
    }
}
