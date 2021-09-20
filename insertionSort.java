//Sagar Rana-2974104-ADA-MscComputing
public class insertionSort
{
	void secondsort(int number[], String Name)
	{
		 long startingTime = System.nanoTime();
		  long running_time;
        int n = number.length;
        for (int k = 1; k < n; ++k)
        {
            int variable = number[k];
            int l = k - 1;

            while (l >= 0 && number[l] > variable)
            {
                number[l + 1] = number[l];
                l = l - 1;

            }
            number[l + 1] = variable;
        }
        long endingTime = System.nanoTime();

        running_time = endingTime - startingTime;

        System.out.println(running_time);
	}
}
