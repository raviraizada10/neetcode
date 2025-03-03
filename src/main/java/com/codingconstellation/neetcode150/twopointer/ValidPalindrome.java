package com.codingconstellation.neetcode150.twopointer;

import com.customannotation.DifficultyLevel;
import com.customannotation.ProblemCategory;
import com.customannotation.ProblemInfo;

import static com.customannotation.enums.Difficulty.MEDIUM;
import static com.customannotation.enums.ProblemTag.ARRAY;

@DifficultyLevel(MEDIUM)
@ProblemCategory({ARRAY})
@ProblemInfo(problemLink = "https://neetcode.io/problems/is-palindrome")
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s
                .replaceAll("[^a-zA-Z0-9]+", " ")
                .trim();
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }

    //two pointer
    public boolean isPalindromeTp(String s) {
        s = s.replaceAll("//s", " ").trim();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) return false;
            i++;
            j--;
        }
        return true;
    }
}