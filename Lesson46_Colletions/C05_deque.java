package Lesson46_Colletions;

import java.util.Deque;
import java.util.LinkedList;

public class C05_deque {
    public static void main(String[] args) {

        Deque<String> ll1 = new LinkedList<>();

        ll1.add("Ali");
        ll1.add("Mehmet");
        ll1.add("Veli");
        ll1.add("Kerim");

        ll1.addLast("Selim");

        /*
        Deque, queue'nin child'i oldugu icin daha fazla methodu var
         */
    }
}
