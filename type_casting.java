public class type_casting {
    public static void main(String[] args) {
        //widening casting
        int num = 7;
        double anum = num;
        System.out.println(num);
        System.out.println(anum);


        //narrowing casting 
        double dnum = 10.15d;
        //int inum = dnum; //error
        int inum = (int)dnum;

        System.out.println(dnum);
        System.out.println(inum);
    }
}
