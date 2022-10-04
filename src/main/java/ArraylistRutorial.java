import java.util.ArrayList;
import java.util.List;

public class ArraylistRutorial {
    public static void main(String[] args) {
        List<String>colors = new ArrayList<>();
        colors.add("blue");
        colors.add("purple");
        colors.add("yellow");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.contains("yellow"));
        for(String color: colors){
            System.out.println(color);
        }
    }
}
