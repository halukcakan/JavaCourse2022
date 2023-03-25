package Lesson46_Colletions;

import java.util.LinkedList;
import java.util.Queue;

public class C04_queue {

    public static void main(String[] args) {

        Queue <String> ll1 = new LinkedList<>();
        Queue <String> ll2 = new LinkedList<>();

        ll1.add("Ali");
        ll1.add("Mehmet");
        ll1.add("Veli");
        ll1.add("Kerim");

        System.out.println(ll1);        //  [Ali, Mehmet, Veli, Kerim]

        ll1.remove();                   //  hangisini silecegini sormadan bastakini siler

        System.out.println(ll1);        //  [Mehmet, Veli, Kerim]



        System.out.println(ll1.element());
        System.out.println(ll1.peek());

        //      ikisi arasinda fark yoktur  -   ile elementi doner


        ll1.offer("Harun");
        System.out.println(ll1);



        ll1.poll();
        System.out.println(ll1);

        //                  ll1.remove();       RTExxception
        System.out.println(ll2.poll());     //  null


    }
}
