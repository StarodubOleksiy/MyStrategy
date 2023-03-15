public class BubleSort implements SortStrategy {

    @Override
    public void sort(int array[])
    {
        int out, in;

        for(out=array.length-1; out>1; out--)   // outer loop (backward)
            for(in=0; in<out; in++)        // inner loop (forward)
                if( array[in] > array[in+1] )       // out of order?
                    swap(array,in, in+1);          // swap them
    }  // end bubbleSort()
    //--------------------------------------------------------------
    private void swap(int array[],int one, int two)
    {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
