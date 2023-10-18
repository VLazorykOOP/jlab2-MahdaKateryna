public class QuickSort {

    public static void quickSort(int[] array, int left, int right) {
        if (array.length == 0)
            return;

        if (left >= right)
            return;

        int middle = left + (right - left) / 2;
        int mid = array[middle];

        int i = left, j = right;
        while (i <= j) {
            while (array[i] < mid) {
                i++;
            }

            while (array[j] > mid) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (left < j)
            quickSort(array, left, j);

        if (right > i)
            quickSort(array, i, right);
    }
}
