package ca.dylancalado.sortingalgorithms.sortingcode;

/**
 * Logic for performing a selection sort.
 * 
 * @author dylan
 */
public class SelectionSort implements SortFacade
{    
    private static int nextPosition;
    private static int minElemSoFar;
     
    public static void sort(SortParameters p)
    {
        nextPosition = 0;
        
        while(nextPosition < p.getArraySize())
        {
            minElemSoFar = nextPosition;
            
            for(int i = nextPosition; i < p.getArraySize(); ++i)
            {
                if(p.getArray()[i] < p.getArray()[minElemSoFar])
                {
                    minElemSoFar = i;
                }
            }
            swap(p.getArray(), nextPosition, minElemSoFar);
            ++nextPosition;
        }
    }

    public static void swap(int[] array, int nextPos, int minElemSoFar)
    {
        int value = array[nextPos];
        array[nextPos] = array[minElemSoFar];
        array[minElemSoFar] = value;
    }
}