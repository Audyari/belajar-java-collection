package ImmutableMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImmutableMapApp {

    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        System.out.println(empty);
        Map<String, String> singleton = Collections.singletonMap("name", "Eko");
        System.out.println(singleton);

        Map<String, String> mutable = new HashMap<>();
        System.out.println(mutable);
        mutable.put("name", "Eko");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        System.out.println(immutable);


        Map<String, String> map = Map.of(
                "first", "Eko",
                "middle", "Kurniawan",
                "last", "Khannedy"
        );

        System.out.println(map);

        //map.put("a", "A"); //error



    }
}
