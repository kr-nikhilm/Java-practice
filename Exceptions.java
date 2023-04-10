public class Exceptions {
    public static void main(String[] args) {
        try {
            int[] num = { 1, 2, 3 };
            System.out.println(num[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong");
        } finally {
            System.out.println("Program Finished");
        }

        //another way
        try {
            throw new Exception("Using throw");
            //throw new ArrayIndexOutOfBoundsException("Index is invalid"); //message is optional
            //throw new NullPointerException();
            //throw new NumberFormatException();
            //throw new ArithmeticException();
        } catch (Exception e) {   //in catch block we can specify particular type of exception
            System.out.println(e.getMessage());
        }
    }
}