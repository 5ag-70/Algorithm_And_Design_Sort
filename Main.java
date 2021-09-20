//Sagar Rana-2974104-ADA-MscComputing
import java.util.Arrays;
import java.util.Random;

public class Main
{

	public static void main(String[] args)
	{

		int[] small=new int[0];
		int[] average=new int[500];
		int[] big=new int[999 ];

		small = inserarray(50);
		average = inserarray(500);
		big = inserarray(999);


		int[] small1 = Arrays.copyOf(small, small.length);
		int[] average1 = Arrays.copyOf(average, average.length);
		int[] big1 = Arrays.copyOf(big, big.length);

		int[] small2 = Arrays.copyOf(small, small.length);
		int[] average2 = Arrays.copyOf(average, average.length);
		int[] big2 = Arrays.copyOf(big, big.length);

		int[] small3 = Arrays.copyOf(small, small.length);
		int[] average3 = Arrays.copyOf(average, average.length);
		int[] big3 = Arrays.copyOf(big, big.length);

        MergeSort merge = new MergeSort();

        System.out.println("Merge sort");
        merge.firstsort(small1, 0, small1.length-1,"Short array");
        merge.firstsort(average1, 0, average1.length-1,"Mediam array");
        merge.firstsort(big1, 0, big1.length-1,"Long array");
        printArray(small1);
        System.out.println("\n");
     	printArray(average1);
     	System.out.println("\n");
     	printArray(big1);
     	System.out.println("\n");

        insertionSort insertion = new insertionSort();
        System.out.println("Insertion sort");
        insertion.secondsort(small2,"Short array");
        insertion.secondsort(average2,"Medium array");
        insertion.secondsort(big2,"Long array");
        printArray(small2);
        System.out.println("\n");
     	printArray(average2);
     	System.out.println("\n");
     	printArray(big2);
     	System.out.println("\n");

        bubbleSort bubblesort = new bubbleSort();
        System.out.println("bubble sort");
     	bubblesort.thirdsort(small3,"Short array");
     	bubblesort.thirdsort(average3,"Medium array");
     	bubblesort.thirdsort(big3,"Long array");
     	printArray(small3);
     	System.out.println("\n");
     	printArray(average3);
     	System.out.println("\n");
     	printArray(big3);
     	System.out.println("\n");
	}


	public static int[] inserarray(int noelements )
	{
		int[] New_Array=new int[noelements];
		for (int index = 0; index < noelements ; index++)
		{
			Random r = new Random();
			int low = 1;
			int high = 1000;
			int result = r.nextInt(high-low) + low;

			New_Array[index] = result;
		}


		return New_Array;
	}
	static void printArray(int list[])
    {
        int ada = list.length;
        for (int i=0; i<ada; ++i)
            System.out.print(list[i] + " ");
        System.out.println();
    }
}
