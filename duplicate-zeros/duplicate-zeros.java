class Solution {
    public void duplicateZeros(int[] arr) {
        int temp[] = arr;
        for (int i=0; i<temp.length; i++){
            if (temp[i] == 0){
                 for (int j = arr.length-2; j >= i; j--) {
                    arr[j+1] = arr[j];
                }
                arr[i]= 0;
                i++;
            }
                
        }
        
    }
}