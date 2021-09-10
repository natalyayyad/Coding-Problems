class Solution {
    public boolean validMountainArray(int[] arr) {
        int low=0;
        int high = arr.length-1;
        
        if(arr.length < 3)
            return false;
        
        while(low<=arr.length-2 && arr[low] < arr[low+1]){
            low ++;
        }
            
        while(high>=1 && arr[high] < arr[high-1]){
            high--;
        } 
        
        if(low == high && low!=0 && high!=0 && low!=arr.length-1 && high != arr.length-1){
            return true;
        }
        else {
            return false;
        }
    }
}