package com.ptr.exercise;

/*
 * @created 18/11/2020 -10:18
 * @project ptr
 * @author  saurabhshcs
 */

import com.sun.tools.javac.util.StringUtils;

public class Palindrom {

    public static void main(String args[]) {
        System.out.println("pal(\"anna\"): " + pal("anna"));
        System.out.println("pal(\"madamimadam\"): " + pal("madamimadam"));
        System.out.println("pal(\"kayak\"): " + pal("kayak"));
        System.out.println("pal(\"\"): " + pal(""));
        System.out.println("pal(\"c\"): " + pal("c"));
        System.out.println("pal(\"ab\"): " + pal("ab"));
        System.out.println("pal(\"notapalindromewords\"): " + pal("notapalindromewords"));
        System.out.println("pal(\"mynamenamemy\"): " + pal("mynamenamemy"));

    }

    private static boolean pal(final String str) {

        if (str.equalsIgnoreCase(reverseString(str))) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

    private static String reverseString(final String str){
        String reverse = new String();
        if (!str.isEmpty()){
            for (int i = str.length()-1 ; i >=0 ; i--){
                reverse = reverse + str.charAt(i);
            }
        }
        return reverse;
    }
}
