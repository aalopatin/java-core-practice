package horstmann.my.chapter09.part0903;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Three ways to inspect all elements in a collection
        Collection<Integer> c = new ArrayList<>();

        for (int i = 0; i < 2_000_000; i++) {
            c.add(i);
        }

        long startTime = System.currentTimeMillis();

        Iterator<Integer> iter = c.iterator();

        while (iter.hasNext()) {
            int sum = iter.next();
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time hasNext: " + (endTime - startTime) + "ms");

        System.out.println();

        startTime = System.currentTimeMillis();

        iter = c.iterator();

        iter.forEachRemaining(element -> { int sum = element; });

        endTime = System.currentTimeMillis();
        System.out.println("Total execution time forEachRemaining: " + (endTime - startTime) + "ms");

        System.out.println();

        startTime = System.currentTimeMillis();

        for (Integer element : c) {
            int sum = element;
        }

        endTime = System.currentTimeMillis();
        System.out.println("Total execution time FOR: " + (endTime - startTime) + "ms");

        //Checking of RandomAccess
        Collection<Integer> cArr = new ArrayList<>();
        
        System.out.print("ArrayList - ");
        if (cArr instanceof RandomAccess) {
            System.out.println("RandomAccess");
        } else {
            System.out.println("Not RandomAccess");
        }

        LinkedList<Integer> cLink = new LinkedList<>();

        for (int i = 0; i < 2_000_000; i++) {
            cLink.add(i);
        }

        ListIterator<Integer> iterLink = cLink.listIterator();


        System.out.print("LinkedList - ");
        if (cLink instanceof RandomAccess) {
            System.out.println("RandomAccess");
        } else {
            System.out.println("Not RandomAccess");
        }

        Collection<Integer> cVector = new Vector<>();
        
        System.out.print("Vector - ");
        if (cVector instanceof RandomAccess) {
            System.out.println("RandomAccess");
        } else {
            System.out.println("Not RandomAccess");
        }

        Collection<Integer> cStack = new Stack<>();

        System.out.print("Stack - ");
        if (cStack instanceof RandomAccess) {
            System.out.println("RandomAccess");
        } else {
            System.out.println("Not RandomAccess");
        }

        //ConcurrentModificationException
        LinkedList<Integer> cLinkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            cLinkedList.add(i);
        }
        ListIterator<Integer> firstIter = cLinkedList.listIterator();
        ListIterator<Integer> concurIter = cLinkedList.listIterator();

        firstIter.next();
        concurIter.next();

        concurIter.remove();

        try {
            firstIter.set(999);
        } catch (ConcurrentModificationException e) {
            System.out.println("ConcurrentModificationException");
        }


        //Can we add one string two times in LinkedList?
        LinkedList<String> staff = new LinkedList<>();

        staff.add("Hurry");
        staff.add("Hurry");

        String hurry = "Hurry";

        staff.add(hurry);
        staff.add(hurry);

        staff.contains("Hurry");

    }
}
