import java.util.*;

public class Main {
	
    public static int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		 HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int num1: A){
            for(int num2: B){
                hmap.put(num1+num2, hmap.getOrDefault(num1+num2,0)+1);
            }
        }
        
        int tuples = 0,target = 0;
        
        for(int num3: C){
            for(int num4: D){
                //search nif other number such that addition will be zero.
                //exist in hashmap or not.
                tuples += hmap.getOrDefault(target - (num3+num4),0);
            }
        }
        
        return tuples;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		int[] arr3 = new int[n];
		int[] arr4 = new int[n];
		for (int i = 0; i < n; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr2[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr3[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			arr4[i] = sc.nextInt();
		}
		System.out.println(fourSumCount(arr1, arr2, arr3, arr4));
	}

}
