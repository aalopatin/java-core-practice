package horstmann.my.chapter06.part0603innerclasses;

public class Main {
    public static void main(String[] args) {
        Outer.Inner inner = new Outer.Inner();
        System.out.println(inner.privet());

        System.out.println(Outer.Inner.privet());
    }
}
