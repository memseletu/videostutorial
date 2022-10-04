package ComparaTotut;

import java.util.Comparator;

public class Comparatoim implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1%1000<o2%1000)
        return 1;
        return -1;
    }
}
