int centuryFromYear(int year) {
    int div = year/100;
    int mod = year % 100; 
    
    if(mod == 0) {
        return div;
    }
    else return div+1;
    
}