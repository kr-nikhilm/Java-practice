package OOPs;

class OuterClass {
    int x = 10;

    class InnerClass {
        int y = 15;
    }

}

class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        System.out.println(inner.y + outer.x);
    }
}
