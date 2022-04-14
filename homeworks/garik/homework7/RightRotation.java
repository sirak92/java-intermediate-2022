import java.util.Arrays;

public class RightRotation {
    static void rightRotationOfArray(int numberOfRotation , int[] array)
    {
        int quantity;
        int newArray[] = new int[array.length];
        for (quantity = 0; quantity < array.length; quantity++)
        {
            if (quantity + numberOfRotation > array.length - 1)
            {
                newArray[0 + numberOfRotation - (array.length - quantity)] = array[quantity];
            } else newArray[quantity + numberOfRotation] = array[quantity];
        }
            System.out.println(Arrays.toString(newArray));
    }
    public static void main(String[] args) {
        rightRotationOfArray(4, new int[]{1, 2, 3, 4, 5});
    }
}
