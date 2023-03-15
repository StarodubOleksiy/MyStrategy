public class QuickSort implements SortStrategy {

    @Override
    public void sort(int array[]) {
        recQuickSort(array, 0, array.length - 1);
    }

    //--------------------------------------------------------------
    private void recQuickSort(int array[], int left, int right) {
        int size = right - left + 1;
        if (size < 10)                   // insertion sort if small
            insertionSort(array, left, right);
        else                            // quicksort if large
        {
            long median = medianOf3(array, left, right);
            int partition = partitionIt(array, left, right, median);
            recQuickSort(array, left, partition - 1);
            recQuickSort(array, partition + 1, right);
        }
    }  // end recQuickSort()

    private long medianOf3(int array[], int left, int right) {
        int center = (left + right) / 2;
        if (array[left] > array[center])
            swap(array, left, center);
        if (array[left] > array[right])
            swap(array, left, right);
        if (array[center] > array[right])
            swap(array, center, right);

        swap(array, center, right - 1);           // put pivot on right
        return array[right - 1];        // return median value
    }  // end medianOf3()*/

    private void swap(int array[], int dex1, int dex2)  // swap two elements
    {
        int temp = array[dex1];        // A into temp
        array[dex1] = array[dex2];   // B into A
        array[dex2] = temp;             // temp into B
    }  // end swap(

    //--------------------------------------------------------------
    private int partitionIt(int array[], int left, int right, long pivot) {
        int leftPtr = left;             // right of first elem
        int rightPtr = right - 1;       // left of pivot
        while (true) {
            while (array[++leftPtr] < pivot)  // find bigger
                ;                                  // (nop)
            while (array[--rightPtr] > pivot) // find smaller
                ;                                  // (nop)
            if (leftPtr >= rightPtr)      // if pointers cross,
                break;                    //    partition done
            else                         // not crossed, so
                swap(array, leftPtr, rightPtr);  // swap elements
        }  // end while(true)
        swap(array, leftPtr, right - 1);         // restore pivot
        return leftPtr;                 // return pivot location
    }  // end partitionIt()

    //--------------------------------------------------------------
    // insertion sort
    private void insertionSort(int array[], int left, int right) {
        int in, out;
        //  sorted on left of out
        for (out = left + 1; out <= right; out++) {
            int temp = array[out];    // remove marked item
            in = out;                     // start shifts at out
            // until one is smaller,
            while (in > left && array[in - 1] >= temp) {
                array[in] = array[in - 1]; // shift item to right
                --in;                      // go left one position
            }
            array[in] = temp;          // insert marked item
        }  // end for
    }  // end insertionSort()
}
