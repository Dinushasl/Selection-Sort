package Selectionsort;

public class Selection {

	    public static void main(String[] args) {
	        // Initialize an array with a new set of values
	        int[] array = new int[5];
	        
	        array[0] = 42;
	        array[1] = 16;
	        array[2] = 8;
	        array[3] = 27;
	        array[4] = 33;
	        
	        int n = array.length;
	        
	        // Perform selection sort
	        for (int i = 0; i < n - 1; i++) {
	            int small = array[i];
	            int a = i;
	        
	            for (int j = i + 1; j < n; j++) { // Corrected inner loop condition
	                if (array[j] < small) {
	                    small = array[j];
	                    a = j;
	                }  
	            }
	            
	            // Swap the found minimum element with the first element of the unsorted part
	            int key = array[i];
	            array[i] = small;
	            array[a] = key;
	        }
	        
	        // Print the sorted array
	        for (int x = 0; x < n; x++) {
	            System.out.println(array[x]);
	        }
	    }
	}



