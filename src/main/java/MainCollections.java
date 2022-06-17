import java.util.*;

public class MainCollections {
    private static ArrayList<Integer> numbers = new ArrayList<Integer>();
    private static HashSet<String> setString = new HashSet<String>();
    private static HashMap<String, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        removeOddNumbers(numbers);
        showSet(setString);
        showValGreaterTen(map);
        colectionsEx();
        //Generics method to exchange positions
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, arr);
        GenericsEx.chagePosition(arr, 1, 3);
        System.out.println("Prime numbers");
        System.out.println(GenericsEx.countPrimeNumbers(arrayList));

    }

    public static void removeOddNumbers(ArrayList<Integer> arr) {
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            if (i % 2 != 0) {
                it.remove();
            }
        }
        System.out.println(numbers);
    }

    public static void showSet(HashSet<String> set) {
        for (int i = 1; i <= 3; i++) {
            setString.add("A");
        }
        Iterator<String> it = setString.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void showValGreaterTen(HashMap<String, Integer> map) {
        map.put("A", 10);
        map.put("B", 5);
        map.put("C", 12);
        map.put("D", 34);
        map.put("E", 1);
        map.put("F", 22);
        Set entrySet = map.entrySet();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            if ((Integer) me.getValue() >= 10) {
                System.out.println("Key is: " + me.getKey() +
                        " & " +
                        " value is: " + me.getValue());
            }
        }
    }

    public static void colectionsEx() {
        List<Integer> arr = Arrays.asList(7, 4, 5, 2, 1, 2, 4, 1);
        List<Integer> dublicates = new ArrayList<Integer>();
        List<Integer> freeDublicates = new ArrayList<Integer>();
        for (int i = 0; i < arr.size(); i++) {
            if (freeDublicates.contains(arr.get(i))) {
                dublicates.add(arr.get(i));
            } else {
                freeDublicates.add(arr.get(i));
            }
        }
        System.out.println("List without dublicates");
        System.out.println(freeDublicates);
        System.out.println("Sorted List Desc");
        Collections.sort(freeDublicates, Collections.reverseOrder());
        System.out.println(freeDublicates);

        ArrayList<String> stringList = new ArrayList<>();
        for (Integer i : freeDublicates) {
            stringList.add(String.valueOf(i));
        }
        Set<String> set = new HashSet<>(stringList);
        System.out.println("Set of String");
        System.out.println(set);

        Map<String, Integer> newMap = new HashMap<>();
        for (int i = 0; i < set.size(); i++) {
            newMap.put(stringList.get(i), freeDublicates.get(i));
        }
        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            System.out.println("Key String= " + entry.getKey() + ",Integer value = " + entry.getValue());
        }

    }
}
