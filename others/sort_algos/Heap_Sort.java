class Heap_Sort
{
    public static void MaxHeapify(int[] array, int root, int size)
    {
        int left = 2 * root + 1, largest;
        int right = left + 1, temp;

        if(left < size && array[left] > array[root])
            largest = left;
        else
            largest = root;

        if(right < size && array[right] > array[largest])
            largest = right;

        if(largest != root)
        {
            temp = array[root];
            array[root] = array[largest];
            array[largest] = temp;
            MaxHeapify(array, largest, size);
        }
    }

    // MaxHeapify that nodes having leaves or max heap nodes as children
    public static void Build_Max_Heap(int[] array, int size)
    {
        for(int i = (size - 1) / 2; i >= 0; i--)
            MaxHeapify(array, i, size);
    }

    public static void HeapSort(int array[], int size)
    {
        Build_Max_Heap(array, size);
        int temp, i;

        for(i = size - 1; i > 0; i--)
        {
            temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            MaxHeapify(array, 0, i);
        }
    }

    // function to print array
    public static void Print_Array(int[] array, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(array[i] + " ");

        System.out.println();
    }

    public static void main(String[] args)
    {
        int[] array = {2, 4, 3, 1, 6, 8, 4};
        HeapSort(array, 7);
        Print_Array(array, 7);
    }
}