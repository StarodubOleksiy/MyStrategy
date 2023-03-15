public class InsertSort implements SortStrategy {

    @Override
    public void sort(int array[])
    {
        int in, out;

        for(out=1; out<array.length; out++)     // out is dividing line
        {
            int temp = array[out];            // remove marked item
            in = out;                      // start shifts at out
            while(in>0 && array[in-1] >= temp) // until one is smaller,
            {
                array[in] = array[in-1];            // shift item to right
                --in;
            }
            array[in] = temp;                  // insert marked item
        }  // end for
    }
}
