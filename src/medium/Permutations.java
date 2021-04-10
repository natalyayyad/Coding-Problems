package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

	 public List<List<Integer>> permute(int[] nums) {
			List<List<Integer>> result = new ArrayList<List<Integer>>();
	        Integer[] list = new Integer[nums.length];
	        if (nums.length == 0) {
	            result.add(new ArrayList<>());
	            return result;
	        }
	        for(int i=0; i< nums.length; i++)
	            list[i] = nums[i];
	        
	        permute2(list,0, result);
	        return result;
		}
	    
	    public static void permute2 (Integer[] arr, int k, List<List<Integer>> result){
	        for(int i = k; i < arr.length; i++){
	        	Permutations.swap(arr, k, i);
	        	Permutations.permute2(arr.clone(), k+1, result);
	        }
	        if (k == arr.length -1){
	            result.add(Arrays.asList(arr));
	          
	        }
	    }
	    
	    private static void swap(Integer[] integers, int a, int b) {
			if (a != b) {
				Integer temp = integers[a];
				integers[a] = integers[b];
				integers[b] = temp;
			}
		}

}
