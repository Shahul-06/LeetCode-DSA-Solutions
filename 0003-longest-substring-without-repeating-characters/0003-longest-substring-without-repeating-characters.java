class Solution {
    public static  int lengthOfLongestSubstring(String s)
     {
        Set<Character> set = new HashSet<>();
        int left =0;
        int maxlength=0;
        for(int right=0;right<s.length();right++)
        {
            char current =s.charAt(right);
            while(set.contains(current)) {
              set.remove(s.charAt(left));
              left++;
            }
            set.add(current);
            int windowlength=right-left+1;
            if(windowlength>maxlength){
             maxlength=windowlength;
            }
        }
        return maxlength;
    }
    public static void main(String args[])
    {
        String s = "abcabcbb";
        int result = lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}