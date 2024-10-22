package javaStudy.day03;

import java.util.Scanner;

public class UpperSwipeLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int diff = 'a'-'A';
        String b = "";
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>='A' && a.charAt(i)<'a') {
            	b = b+(char)(a.charAt(i)+diff);
            }
            else if(a.charAt(i)>='a') {
            	b = b+(char)(a.charAt(i)-diff);
            }
        }
        System.out.println(b);
    }

}
