class Solution(object):
    def lengthOfLongestSubstring(self, s):
        i = 0
        j = 0
        result = 0
        sets = []
        while(j<len(s)):
            if s[j] not in sets:
                sets.append(s[j])
                result = max(result, len(sets))
                j+=1
            else:
                sets.remove(s[i])
                i+=1
                
        return result
        