class Solution {
    public String removeDigit(String number, char digit) {
      int n = number.length();
      for(int i=0;i<n;i++)
      {
            if(number.charAt(i)==digit)
            {
              if(i+1<n && number.charAt(i+1) > digit) {
                return number.substring(0,i)+number.substring(i+1);
              } 
            }
      }
         int last = number.lastIndexOf(digit);
         return number.substring(0,last)+number.substring(1+last);
    }
}