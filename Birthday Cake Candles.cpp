int birthdayCakeCandles(vector<int> candles) {
    
    int c = 0;
    int count = 0;
    for(int can : candles)
    {
        if(can>c)
        {
            count = 0;
            c = can;
            count++;
        }
        
        else if(can==c)
        {
            count++;
        }
    }
    
    return count;

}
