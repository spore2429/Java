package day0615;

import java.util.Scanner;

public class SpecialChar_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for(int i=0;i<a.length();i++)
        {
            char c=a.charAt(i);
            System.out.println(c);
        }
        
    }
}