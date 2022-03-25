package chapter_9.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author HP
 * @date 2022/3/2
 */
public class LinkedListTest {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("Amy");
        a.add("Bob");
        a.add("Maria");

        List<String> b = new LinkedList<>();
        b.add("Carl");
        b.add("Dog");
        b.add("Cat");
        b.add("Fish");

        ListIterator<String> aIter = a.listIterator();
        Iterator<String> bIter = b.iterator();

        while (bIter.hasNext()){
            if(aIter.hasNext()){
                aIter.next();
            }
            aIter.add(bIter.next());
        }

        System.out.println(a);

        bIter = b.iterator();
        while(bIter.hasNext()){
            bIter.next();
            if(bIter.hasNext()){
                bIter.next();
                bIter.remove();
            }
        }

        System.out.println(b);

        a.removeAll(b);

        System.out.println(a);
    }
}
