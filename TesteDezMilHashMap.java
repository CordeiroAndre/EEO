package HashMap;

import java.util.HashMap;

public class TesteDezMilHashMap {

    public static void main(String[] args) {
        HashMap<Integer, Integer> lista = new HashMap<Integer, Integer>();

        for(int i = 0; i<10000; i++){
            lista.put(i, i);
        }


        long startTime = System.nanoTime();

        lista.get(9999);

        long endTime = System.nanoTime() - startTime;

        System.out.println("tempo: "+endTime);
    }

}
