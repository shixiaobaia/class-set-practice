import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
       List<Integer> list =new ArrayList<>();
       list.add(1);
       list.add(4);
       list.add(9);
        System.out.println(list);
        System.out.println(list.contains(4));
        System.out.println(list.size());

        System.out.println(list.get(1));
        System.out.println(list.set(2,8));
        System.out.println(list.get(2));

    }
}
