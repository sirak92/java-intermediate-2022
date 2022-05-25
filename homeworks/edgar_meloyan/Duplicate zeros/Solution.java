class Solution {
    public void duplicateZeros(int[] array) {
        int zero = 0;
        for (int a : array) {
            if (a == 0) {
                zero++;
            }
        }

        int i = array.length - 1;
        int j = array.length + zero - 1;

        while (i != j) {
            insert(array, i, j--);
            if (array[i] == 0) {
                insert(array, i, j--);
            }
            i--;
        }
    }
    private void insert(int[] array, int i, int j) {
        if (j < array.length) {
            array[j] = array[i];
        }
    }
}
