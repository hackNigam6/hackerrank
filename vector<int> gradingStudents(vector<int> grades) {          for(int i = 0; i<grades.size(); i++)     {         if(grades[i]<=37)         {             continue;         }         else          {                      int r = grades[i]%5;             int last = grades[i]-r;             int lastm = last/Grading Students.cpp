vector<int> gradingStudents(vector<int> grades) {
    
    for(int i = 0; i<grades.size(); i++)
    {
        if(grades[i]<=37)
        {
            continue;
        }
        else 
        {
        
            int r = grades[i]%5;
            int last = grades[i]-r;
            int lastm = last/5;
            lastm++;
            int newm = lastm*5;
            if(newm-grades[i]<3)
            {
                grades[i] = newm;
            }
        }
    }
    
    return grades;

}
