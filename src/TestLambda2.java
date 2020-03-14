import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestLambda2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("Hello");
        list.add("Hylo");
        list.add("Goodbye");
        list.add("Q");

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(list);

        list.sort((o1,o2) -> {
            if(o1.length() > o2.length()) return -1;
            else if (o1.length() < o2.length()) return 1;
            else return 0;
        });

        System.out.println(list);

    }
}
