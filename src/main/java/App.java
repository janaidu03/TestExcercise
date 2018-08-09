import java.util.*;

public class App {

    public static void main(String[] args) {

        Map <String, Integer> unsortMap = new HashMap <String, Integer>();
        unsortMap.put("Daikon", 40);
        unsortMap.put("Brinjal", 20);
        unsortMap.put("Carrot", 30);
        unsortMap.put("Apple", 10);

        System.out.println("Unsort Map......");
        printMap(unsortMap);

        System.out.println("\nSorted Map......By Value");
        Map <String, Integer> sortedMap = sortByValue(unsortMap);
        printMap(sortedMap);
    }

    private static Map <String, Integer>
    sortByValue
            (Map <String, Integer> unsortMap) {

        List <Map.Entry <String, Integer>> list =
                new LinkedList <Map.Entry <String, Integer>>(unsortMap.entrySet());

        Collections.sort(list, new Comparator <Map.Entry <String, Integer>>() {
            public int compare(Map.Entry <String, Integer> o1,
                               Map.Entry <String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });


        Map <String, Integer> sortedMap = new LinkedHashMap <String, Integer>();
        for (Map.Entry <String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }

    public static <K, V> void
    printMap(Map <K, V> map) {
        for (Map.Entry <K, V> entry : map.entrySet()) {
            System.out.println(
                    "Key : " + entry.getKey()
                            + " Value : " + entry.getValue()
            );
        }
    }
}
