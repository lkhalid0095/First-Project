package sortomania;

public class lubna {

	 {

		
			@Override
			public Color getColor() 
			{
				return new Color(240,60,120);
			}

			@Override
			public String getSpriteName() 
			{
				return RYU;
			}

			@Override
			public double sortAndGetMedian(int[] random) {
				sort(random, 0, random.length-1);
				if(random.length % 2 == 0) {
					return (random[random.length/2] + random[random.length/2-1])/2;
				}else {
					return random[random.length/2];
				}
			}

			private void sort(int[] arr, int i, int j) {
			    {
			        if (i < j)
			        {
			            // Find the midpoint
			            int m = (i+j)/2;
			 
			            // Then sort the first half of the array.
			            sort(arr, i, m);
			            //the the second half
			            sort(arr , m+1, j);
			 
			            // Merge both sorted arrays
			            join(arr, i, m, j);
			        }
			    }
				
			}

			private void join(int[] arr, int l, int m, int r) {
			
				
		        int n1 = m - i + 1;
		        int n2 = j - m;
		 
		        /* Create temp arrays */
		        
		        int L[] = new int [n1];
		        int R[] = new int [n2];
		 
		        /*Copy data to temp arrays*/
		        for (int a=0; i<n1; ++a)
		            L[a] = arr[l + a];
		        for (int b=0; j<n2; ++b)
		            R[b] = arr[m + 1+ b];
		 
		 
		        /* Merge the temp arrays */
		 
		        // Initial indexes of first and second subarrays
		        int i = 0, j = 0;
		 
		        // Initial index of merged subarry array
		        int k = l;
		        while (i < n1 && j < n2)
		        {
		            if (L[i] <= R[j])
		            {
		                arr[k] = L[i];
		                i++;
		            }
		            else
		            {
		                arr[k] = R[j];
		                j++;
		            }
		            k++;
		        }
		 
		        /* Copy remaining elements of L[] if any */
		        while (i < n1)
		        {
		            arr[k] = L[i];
		            i++;
		            k++;
		        }
		 
		        /* Copy remaining elements of R[] if any */
		        while (j < n2)
		        {
		            arr[k] = R[j];
		            j++;
		            k++;
		        }
		    }
				
			}

			@Override
			public int sortAndGetResultingIndexOf(String[] strings, String toFind) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public double mostlySortAndGetMedian(int[] mostlySorted) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public double sortMultiDim(int[][] grid) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public int sortAndSearch(Comparable[] arr, Comparable toFind) {
				// TODO Auto-generated method stub
				return 0;
			}

	}
