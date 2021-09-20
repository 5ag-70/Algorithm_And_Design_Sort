//Sagar Rana-2974104-ADA-MscComputing

public class MergeSort
{

	void firstsort(int number[], int l, int r, String Name)
	{
		 long startingTime = System.nanoTime();
		  long running_time;

		sort(number, 0, number.length-1);

		 long endingTime = System.nanoTime();

	        running_time = endingTime - startingTime;

	        System.out.println(running_time);
	        System.out.println("Time taken To complete sorting for Small,average,big");


	}

    void merge(int number[], int l, int m, int r)
    {


        int B = m - l + 1;
        int B1 = r - m;

        int L[] = new int [B];
        int R[] = new int [B1];

        for (int x=0; x<B; ++x)
            L[x] = number[l + x];
        for (int u=0; u<B1; ++u)
            R[u] = number[m + 1+ u];

        int x = 0, u = 0;

        int k = l;
        while (x < B && u < B1)
        {
            if (L[x] <= R[u])
            {
                number[k] = L[x];
                x++;

            }
            else
            {
                number[k] = R[u];
                u++;
            }
            k++;
        }

        while (x < B)
        {
            number[k] = L[x];
            x++;
            k++;
        }

        while (u < B1)
        {
            number[k] = R[u];
            u++;
            k++;
        }
    }

    void sort(int number[], int l, int r)
    {

        if (l < r)
        {
            int m = (l+r)/2;

            sort(number, l, m);
            sort(number , m+1, r);

            merge(number, l, m, r);
        }

    }

}
