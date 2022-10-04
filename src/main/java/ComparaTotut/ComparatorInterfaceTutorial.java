package ComparaTotut;

import ComparaTotut.Comparatoim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfaceTutorial {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(132);
        values.add(236);
        values.add(133);
        values.add(164);
        Comparator<Integer> com = new Comparatoim();
        Collections.sort(values, com);
        //Collections.reverse(values);
for (int i : values){
    System.out.println(i);
}
    }
}
