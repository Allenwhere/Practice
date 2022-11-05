package Leetcode;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.LinkedList;

public class IntegerToWords {
    String[] units = {"", "Thousand", "Million", "Billion"};
    String[] nums = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    StringBuilder sb = new StringBuilder();
    public String numberToWords(int num) {
        if(num == 0) return "Zero";
//        sb = new StringBuilder();
        // split them into set of three numbers
        // pass each set into helper method
        // append together
        for(int i = 3, unit = 1000000000;i>=0;i--, unit /= 1000) {
            int tmp = num/unit;
            if(tmp != 0) {
                threeNum2Str(tmp);
                sb.append(units[i]).append(" ");
            }
            num = num%unit;
        }
        return sb.toString().trim();
    }

    public void threeNum2Str(int num) {
        // at most three digits
        if(num == 0) return;
       if(num<10) {
           sb.append(nums[num]).append(" ");
       } else if (num < 20) {
           sb.append(teens[num-10]).append(" ");
       } else if (num < 100) {
           sb.append(tens[num/10]).append(" ");
           threeNum2Str(num%10);
       } else {
           sb.append(nums[num/100]).append(" Hundred ");
           threeNum2Str(num%100);
       }

    }

    public static void main(String[] args) {
        IntegerToWords change = new IntegerToWords();
//        System.out.println(123/10);
//        System.out.println(123%10);
        System.out.println(change.numberToWords(10));
        System.out.println(change.numberToWords(233));
        System.out.println(change.numberToWords(103));
        System.out.println(change.numberToWords(20));
//        System.out.println(change.numberToWords(1000));
//        System.out.println(change.numberToWords(123456));
//        System.out.println(change.numberToWords(100000));
//        System.out.println(change.numberToWords(100));
//        System.out.println(change.numberToWords(20));
//        String replace = "qwertyuiopasdfgp";
//        String regex = "(.{4})";
//        if (replace.length() % 4 == 0) {
//            System.out.println("4的整数倍");
//            replace = replace.replaceAll(regex, "$1-");
//            replace = replace.substring(0, replace.length() - 1);
//        } else {
//            replace = replace.replaceAll(regex, "$1-");
//        }
//
//        System.out.println(replace);
//        String s = "1234567";
//        String reg = "(.{3})";
//        s=s.replaceAll(reg,"$1-");
//        System.out.println(s);
//        System.out.println(Arrays.toString(s.split("-")));

    }
}
