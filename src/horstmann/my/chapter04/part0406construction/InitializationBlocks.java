package horstmann.my.chapter04.part0406construction;

public class InitializationBlocks {
    private static String testStaticField = "testStaticField";
    private String testField = "testField";

    {
        System.out.println("Initialization block 1");
        System.out.println("------------------------");
        System.out.println(testStaticField);
        testStaticField = "Initialization block 1";
        System.out.println(testStaticField);
        System.out.println();

    }

    static
    {
        System.out.println("Initialization static block 1");
        System.out.println("------------------------");
        System.out.println(testStaticField);
        testStaticField = "Initialization static block 1";
        System.out.println(testStaticField);
        System.out.println();

    }

    static
    {
        System.out.println("Initialization static block 2");
        System.out.println("------------------------");
        System.out.println(testStaticField);
        testStaticField = "Initialization static block 2";
        System.out.println(testStaticField);
        System.out.println();
    }

    {
        System.out.println("Initialization block 2");
        System.out.println("------------------------");
        System.out.println(testStaticField);
        testStaticField = "Initialization block 2";
        System.out.println(testStaticField);
        System.out.println();
    }

}
