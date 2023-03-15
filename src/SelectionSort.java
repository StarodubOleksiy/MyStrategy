public class SelectionSort implements SortStrategy {

    @Override
    public void sort(int array[])
    {
        int out, in, min;
        for(out=0; out<array.length-1; out++)   // outer loop
        {
            min = out;                     // minimum
            for(in=out+1; in<array.length; in++) // inner loop
                if(array[in] < array[min] )         // if min greater,
                    min = in;               // we have a new min
            swap(array,out, min);                // swap them
        }  // end for(out)
    }  // end selectionSort()

    private void swap(int array[],int one, int two)
    {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }
}
