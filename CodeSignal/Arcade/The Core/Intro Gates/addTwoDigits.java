int addTwoDigits(int n) {
    if(n==0)
    return 0;
    
    int sum=0;
    while(n != 0){
        sum += n%10;
        n = n /10;
    }
    
    return sum;
}