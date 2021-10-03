def migratoryBirds(arr):
    count = [0, 0, 0, 0, 0]
    for i in arr:
        count[i-1]+=1
        
    print(count)
    return count.index(max(count))+1
