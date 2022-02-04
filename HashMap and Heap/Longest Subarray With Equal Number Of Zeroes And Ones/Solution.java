import java.util.*;

public class Solution {

    public static int solution(int[] nums) {
        // write your code here
        int ans = 0, sum = 0;   
        
        HashMap<Integer,Integer> hmap = new HashMap<>();
        
        hmap.put(0, -1);
        int i=0;
        for(int num: nums){
            if(num == 0){
                sum += -1;
            } 
            else if(num == 1){
                sum += 1;
            }
            if(hmap.containsKey(sum)){
                int index = hmap.get(sum);
                int len = i - index;
                if(len > ans){
                    ans = len;
                }
            }
            else{
                hmap.put(sum, i);
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(solution(arr));
    }

}
