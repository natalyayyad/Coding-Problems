int largestNumber(int n) {
    String sum="";
    while(n != 0){
        n -= 1;
        sum +="9";
    }
    return Integer.valueOf(sum);
}
