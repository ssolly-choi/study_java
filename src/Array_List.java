import java.util.*;

public class Array_List {
    public static void main(String[] args) {
                                //여기서의 List는 Interface!
        List<String> list1 = new ListImpl();

        List<String> list = new ArrayList<>();
        list.add("aa");
        list.add(1,"ac");
        list.get(1);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(1);
        set.add(2);
//        System.out.println(set.size());

        Map<String, Integer> map = new HashMap<>();
//        map.put("one", 1);

        for(Integer x : set){
            System.out.println(x);
        }

        int a = map.get("two");:
        map.containsKey("two");

        for (String key : map.keySet()) {
            int x = map.get(key)
        }
    }
}
