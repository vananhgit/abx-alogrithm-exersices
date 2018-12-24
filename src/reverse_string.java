// https://leetcode.com/problems/reverse-string/
class Solution {
    public String reverseString(String s) {
         String string="A man, a plan, a canal: Panama";
      String reverse = new StringBuffer(s).
      reverse().toString();
      System.out.println("String before reverse:      "+string);
      System.out.println("String after reverse:      "+reverse);
    return reverse;
   }
    }


