package HashMap;

import java.util.HashMap;

public class TesteCemMilHashMap {

    public static void main(String[] args) {
            HashMap<Integer, Integer> lista = new HashMap<Integer, Integer>();

            for(int i = 0; i<100000; i++){
                lista.put(i, i);
            }


            long startTime = System.nanoTime();

            lista.get(99999);

            long endTime = System.nanoTime() - startTime;

            System.out.println("tempo: "+endTime);
    }
}
