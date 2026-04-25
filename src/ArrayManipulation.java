import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read array size
        int n = sc.nextInt();

        // Read array elements
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Read number of queries
        int q = sc.nextInt();

        // Process each query
        for (int i = 0; i < q; i++) {
            int l = sc.nextInt();
            int r = sc.nextInt();

	    int c = 0;
            for(int j = r; j >= l; j--) {
			System.out.print(arr[j] + " ");
		 c++;
		}
		int[] temp = new int[c];
		for(int j = r, z = 0; j >= l; j--, z++) {
			arr[j] = temp[z];
		}

		
		for (int x = 0; x < n; i++) {
            	System.out.println(arr[x] + " ");
        		}

		
		System.out.println("\n");
        }

        // TODO: Print the final state of the array
        sc.close();
    }
}
