package tech42;

public class Main {

    public static void main(String[] args) {
        Integer[] intArr = {1, 5, 2, 3, 5};
        GenericSortedList<Integer> intArrGen = new GenericSortedList(intArr);
        intArrGen.add(3);
        intArrGen.add(115);
        intArrGen.add(9);
        intArrGen.add(111);
        intArrGen.add(-6);
        intArrGen.printArray();
        intArrGen.search(5);
        System.out.println(intArrGen.size());
        System.out.println(intArrGen.getElement(9));
        System.out.println(intArrGen.getElement(35));

        System.out.println();

        String[] stringArr = {"a", "aa", "a", "aaaaaa", "aaa"};
        GenericSortedList<String> stringArrGen = new GenericSortedList(stringArr);
        stringArrGen.add("b");
        stringArrGen.add("ddd");
        stringArrGen.add("ccc");
        stringArrGen.add("d");
        stringArrGen.add("c");
        stringArrGen.printArray();
        stringArrGen.search("aaa");
        System.out.println(stringArrGen.size());
        System.out.println(stringArrGen.getElement(9));
        System.out.println(stringArrGen.getElement(35));

    }
}

