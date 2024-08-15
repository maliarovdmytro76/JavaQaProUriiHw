package hw15082024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class InterTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
       long startTime, endTime, duration;
        int temp;
        startTime = System.nanoTime();
        for (Integer element : list) {
            temp = element;
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("For each loop duration: " + duration);

        startTime = System.nanoTime();
        for (int i = 0; i < list.size(); i++) {
            temp = list.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Classic For loop with list.size() in each iteration: "+ duration );

        startTime = System.nanoTime();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            temp = list.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Classic For loop with size() in variable: "+ duration );

        startTime = System.nanoTime();
        for (int i = size - 1; i >=0 ; i--) {
            temp = list.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Classic For loop  iterating from end: "+ duration  );

        startTime = System.nanoTime();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            temp = iterator.next();
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("Iterator loop  duration: "+ duration  );

        startTime = System.nanoTime();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            temp = listIterator.next();
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ListIterator loop  duration: "+ duration  );
        
    }

}
