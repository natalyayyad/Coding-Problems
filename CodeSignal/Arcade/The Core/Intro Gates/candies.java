int candies(int n, int m) {
    int i=0;
    while(m-n >= 0){
        m -= n;
        i++;
    }
    return i * n;
}
