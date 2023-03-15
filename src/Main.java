import java.util.ArrayList;


public class Main {

    private static long start;

    private static long end;

    private static void setTime() {
        start = System.currentTimeMillis();
    }

    private static void displayTime() {
        end = System.currentTimeMillis();
        System.out.println("Час витрачений на сортування:" + (end - start));
    }


    public static int[] createNewArray() {
        final int maxSize = 20000;             // array size
        int[] arr = new int[maxSize];  // create the array

        for (int j = 0; j < maxSize; j++)  // fill array with
        {                          // random numbers
            arr[j] = (int) (java.lang.Math.random() * 9999);
        }
        return arr;
    }

    public static void display(String sortName, int[] array)             // displays array contents
    {
        System.out.print(sortName + "= ");
        for (int j = 0; j < array.length; j++)    // for each element,
            System.out.print(array[j] + " ");  // display it
        System.out.println("");
    }

    public static void main(String[] args) {
        SortStrategy firstSortQuick = new QuickSort();
        int[] arrayToQuickSort = createNewArray();
        display("Array before quick sort", arrayToQuickSort);
        setTime();
        firstSortQuick.sort(arrayToQuickSort);
        displayTime();
        display("Array after quick sort", arrayToQuickSort);
        SortStrategy secondSortShell = new ShellSort();
        int[] arrayToShellSort = createNewArray();
        display("Array before shell sort", arrayToShellSort);
        setTime();
        secondSortShell.sort(arrayToShellSort);
        displayTime();
        display("Array after shell sort", arrayToShellSort);
        SortStrategy thirdSortBuble = new BubleSort();
        int[] arrayToBubleSort = createNewArray();
        display("Array before buble sort", arrayToBubleSort);
        setTime();
        thirdSortBuble.sort(arrayToBubleSort);
        displayTime();
        display("Array after buble sort", arrayToBubleSort);
        SortStrategy fourthSortInsert = new InsertSort();
        int[] arrayToInsertSort = createNewArray();
        display("Array before insert sort", arrayToInsertSort);
        setTime();
        fourthSortInsert.sort(arrayToInsertSort);
        displayTime();
        display("Array after insert sort", arrayToInsertSort);
        SortStrategy fifthSortSelect = new InsertSort();
        int[] arrayToSelectSort = createNewArray();
        display("Array before selection sort", arrayToSelectSort);
        setTime();
        fifthSortSelect.sort(arrayToSelectSort);
        displayTime();
        display("Array after seletion sort", arrayToSelectSort);
    }
}
