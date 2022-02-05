import java.util.*;

public class Main {

    // ~~~~~~~~~~~~~~~User Section~~~~~~~~~~~~~~~~~~
    public static int maxChunksToSorted(int[] arr) {
        // write your code here  
        //index corresponds to the sorting order
        int max=0,count=0;
        
        for(int i=0;i<arr.length;i++)//traversing 
        {
            max=Math.max(arr[i],max);//calculating the maximum for every element 
            
            if(i==max)//partition upper limit found(unsorted region lies in this region)
                count+=1;//increasing the partiton count that has to be sorted, to get an ascending sorted array
        }
        
        return count;//returing the maximum numer of partision required  
    }

    // ~~~~~~~~~~~~Input Management~~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        int res = maxChunksToSorted(arr);
        System.out.println(res);
    }
}
