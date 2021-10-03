void plusMinus(vector<int> arr) {
    
    float zeros = 0;
    float positive = 0;
    float negetive = 0;
    float n = arr.size();
    for(auto ele : arr)
    {
        if(ele<0)
            negetive++;
            
        else if(ele > 0)
            positive++;
        
        else
            zeros++;
    }
    
    cout<<setprecision(6)<<fixed;
    cout<<positive/n<<endl;
    cout<<negetive/n<<endl;
    cout<<zeros/n<<endl;
    

}
