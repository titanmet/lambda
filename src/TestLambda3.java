import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;

public class TestLambda3 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        List<Integer> list = new ArrayList<>();

        fillArr(arr);
        fillList(list);

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        for (int i = 0; i < 10; i++) {
            arr[i] = arr[i] * 2;
            list.set(i, list.get(i) * 2);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
//        map
        arr = Arrays.stream(arr).map(a -> a * 3).toArray();
        list = list.stream().map(a -> a * 3).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr));
        System.out.println(list);

        arr = Arrays.stream(arr).map(a -> 5).toArray();
        list = list.stream().map(a -> a + 10).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr));
        System.out.println(list);
//        filter method
        int[] arr2 = new int[10];
        List<Integer> list2 = new ArrayList<>();

        fillArr(arr2);
        fillList(list2);

        arr2 = Arrays.stream(arr2).filter(a -> a % 2 == 0).toArray();
        list2 = list2.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr2));
        System.out.println(list2);
//        forEach
        Arrays.stream(arr2).forEach(System.out::println);
        list2.forEach(System.out::println);

        int[] arr3 = new int[10];
        List<Integer> list3 = new ArrayList<>();

        fillArr(arr3);
        fillList(list3);
//        reduce
        int sum = Arrays.stream(arr3).reduce((a, b) -> a + b).getAsInt();
        int pr = list3.stream().reduce((a, b) -> a * b).get();

        System.out.println(sum);
        System.out.println(pr);

        int[] arr4 = new int[10];
        fillArr(arr4);
        int sum1 = Arrays.stream(arr4).map(a -> a + 1).filter(a -> a % 2 == 0).reduce((a, b) -> a * b).getAsInt();
        int[] arr5 = Arrays.stream(arr4).filter(a -> a % 2 != 0).map(a -> a * 9).toArray();
        System.out.println(sum1);
        System.out.println(Arrays.toString(arr5));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(5);
        System.out.println(set);
        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println(set);

    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
    }

    private static void fillArr(int[] arr) {
        for (int i = 0; i < 10; i++) {
            arr[i] = i + 1;
        }
    }
}
