package homework2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework2 {

    public static int[] task306(){
        //array elements count -> 4 * 10 + 9 + 8 + 7 + 6 + 5 = 75
        int[] array = new int[75];
        int current = 10;
        int currentIndex = 0;
        int currentPointer;
        int currentTens;

        while (current <= 99) {
            currentPointer = current % 10;
            currentTens = current / 10;
            if (currentPointer + currentTens > 5) {
                array[currentIndex] = current;
                currentIndex++;
            }
            current++;
        }
        return array;
    }

    public static int[] task312(int[] array) {
        int[] newArray;
        if (array.length % 2 == 0) {
            newArray = new int[array.length/2];
            for (int i = 0, j = 0; i < newArray.length; i++, j += 2) {
                newArray[i] = Math.abs(array[j]) >= Math.abs(array[j + 1])
                        ? Math.abs(array[j]) : Math.abs(array[j + 1]);
            }
        } else {
            newArray = new int[array.length / 2 + 1];
            for (int i = 0, j = 0; i < newArray.length - 1; i++, j += 2) {
                newArray[i] = Math.abs(array[j]) >= Math.abs(array[j + 1])
                        ? Math.abs(array[j]) : Math.abs(array[j + 1]);
            }
            newArray[newArray.length - 1] = array[array.length - 1];
        }

        return newArray;
    }

    public static int[] task329(int[] array){
        int[] newArray = new int[array.length];
        int current = 0;

        for (int i = 0; i < newArray.length; i++) {
            current += array[i];
            newArray[i] = current;
        }

        return newArray;
    }

    public static int task341(List<Integer> list) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int current: list) {
            if (map.containsKey(current)) {
                map.remove(current);
            } else {
                map.put(current, true);
            }
        }
        return map.size();
    }

    public static int task369(List<Integer> list1, List<Integer> list2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int current: list2) {
            if (map.containsKey(current)) {
                map.put(current, map.get(current) + 1);
            } else {
                map.put(current, 1);
            }
        }

        int min = list1.get(0);
        for (int current: list1) {
            if (map.containsKey(current) && current < min) {
                min = current;
            }
        }
        return min;
    }
}
