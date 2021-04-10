package hard;

import java.util.ArrayList;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	       ArrayList<Integer> resultList = new ArrayList<>();
			if(nums1.length ==0 && (nums2.length % 2 ==0)) {
				return (double)(nums2[(nums2.length)/2] + nums2[((nums2.length)/2)-1])/2; 
			}
			
			if(nums1.length ==0 && (nums2.length % 2 !=0)) {
				return (double)nums2[(nums2.length)/2]; 
			}
			
			if(nums2.length ==0 && (nums1.length % 2 ==0)) {
				return (double)(nums1[(nums1.length)/2] + nums1[((nums1.length)/2)-1])/2; 
			}
			
			if(nums2.length ==0 && (nums1.length % 2 !=0)) {
				return (double)nums1[(nums1.length)/2]; 
			}
			
			int i=0, j=0;
			while((i < nums1.length) && (j <nums2.length)) {
				if(nums1[i] < nums2[j]) {
					resultList.add(nums1[i]);
					i++;
				}
				else {
					resultList.add(nums2[j]);
					j++;
				}
			}
			
			if(i < nums1.length) {
				for(int l=i; l<nums1.length; l++) {
					resultList.add(nums1[l]);
				}
			}
			
			if(j < nums2.length) {
				for(int m=j; m<nums2.length; m++) {
					resultList.add(nums2[m]);
				}
			}
			
	        if(resultList.size() % 2 ==0) {
	        	return (double)(resultList.get(resultList.size()/2) + resultList.get((resultList.size()/2)-1))/2; 
	        }
			return (double)resultList.get(resultList.size()/2);
	        
	        
	    }

}
