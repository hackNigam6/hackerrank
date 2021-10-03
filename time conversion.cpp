string timeConversion(string s) {
    
    char tod = s.at(s.length()-2);
    int hh = stoi(s.substr(0, 2));
    int ss = stoi(s.substr(6, 2));
    int mm = stoi(s.substr(3, 2));
    string res = "";
    if(tod == 'A')
    {
        
        if(hh<12)
        {
            s.replace(s.length()-2, 2, "");
            res = s;
        }
        
        if(hh == 12)
        {
            
            s.replace(0,2, "00");
            s.replace(s.length()-2, 2, "");
            res = s;
        }
    }
    
    else {
        if(hh == 12)
        {
            s.replace(s.length()-2, 2, "");
            res = s;
        }
        else {
            int hours = hh+12;
            s.replace(s.length()-2, 2, "");
            s.replace(0,2,to_string(hours));
            res = s;
        }
        
    }
    
    return res;
    

}
