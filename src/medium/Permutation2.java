package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Permutation2 {
	 public List<List<Integer>> permuteUnique(int[] nums) {
			java.util.List<List<Integer>> result = new ArrayList<List<Integer>>();
	        Integer[] list = new Integer[nums.length];
	        if (nums.length == 0) {
	            result.add(new ArrayList<>());
	            return result;
	        }
	        for(int i=0; i< nums.length; i++)
	            list[i] = nums[i];
	        
	        permute2(list,0, result);
	        List<List<Integer>> listWithoutDuplicates = new ArrayList<List<Integer>>(new HashSet<>(result));

	        return listWithoutDuplicates;
		}
	    
	    public static void permute2 (Integer[] arr, int k, List<List<Integer>> result){
	        for(int i = k; i < arr.length; i++){
	        	Permutation2.swap(arr, k, i);
	            Permutation2.permute2(arr.clone(), k+1, result);
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
