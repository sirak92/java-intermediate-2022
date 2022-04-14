class LeftRotation {
    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    // Write your code here
        List<Integer> result = new ArrayList<Integer>();
        for (int i = d; i < arr.size(); ++i) {
            result.add(arr.get(i));
        }
        for (int i = 0; i < d; ++i) {
            result.add(arr.get(i));
        }
        return result;
    }

}