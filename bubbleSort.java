//Sagar Rana-2974104-ADA-MscComputing
public class bubbleSort
{
	void thirdsort(int number[], String Name)
    {
		 long startingTime = System.nanoTime();
		  long running_time;
        int n = number.length;

        for (int k = 0; k < n-1; k++)
        {
            for (int l = 0; l < n-k-1; l++)
            {
                if (number[l] > number[l+1])
                {
                    int temp = number[l];
                    number[l] = number[l+1];
                    number[l+1] = temp;
                }
            }
        }

        long endingTime = System.nanoTime();

        running_time = endingTime - startingTime;

        System.out.println(running_time);
    }
}
