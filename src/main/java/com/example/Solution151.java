package com.example;

public class Solution151 {
    public static void main(String[] args) {
        String s = "         the      sky is blue ";
        System.out.println(s);
        String trim = s.trim();
        System.out.println(trim);

        String[] str = s.trim().split("\\s+");
        for (String i : str) {
            System.out.print(i + ",");
        }
    }
    public static String reverseWords(String s) {
        // Trim the input string to remove leading and trailing spaces
        String[] str = s.trim().split("\\s+");

        // Initialize the output string
        String out = "";

        // Iterate through the words in reverse order
        for (int i = str.length - 1; i > 0; i--) {
            // Append the current word and a space to the output
            out += str[i] + " ";
        }

        // Append the first word to the output (without trailing space)
        return out + str[0];
    }
}
