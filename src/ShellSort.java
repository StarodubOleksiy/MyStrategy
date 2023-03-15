public class ShellSort implements SortStrategy {

    @Override
    public void sort(int array[])
    {
        int inner, outer,temp;
        int h = 1;                     // find initial value of h
        while(h <= array.length/3)
            h = h*3 + 1;                // (1, 4, 13, 40, 121, ...)

        while(h>0)                     // decreasing h, until h=1
        {
            // h-sort the file
            for(outer=h; outer<array.length; outer++)
            {
                temp = array[outer];
                inner = outer;
                // one subpass (eg 0, 4, 8)
                while(inner > h-1 && array[inner-h] >=  temp)
                {
                    array[inner] = array[inner-h];
                    inner -= h;
                }
                array[inner] = temp;
            }  // end for
            h = (h-1) / 3;              // decrease h
        }  // end while(h>0)
    }
}
