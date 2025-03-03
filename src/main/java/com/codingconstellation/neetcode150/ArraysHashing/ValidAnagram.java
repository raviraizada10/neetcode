package com.codingconstellation.neetcode150.ArraysHashing;

import com.customannotation.DifficultyLevel;
import com.customannotation.ProblemCategory;
import com.customannotation.ProblemInfo;

import static com.customannotation.enums.Difficulty.EASY;
import static com.customannotation.enums.ProblemTag.ARRAY;

@DifficultyLevel(EASY)
@ProblemCategory({ARRAY})
@ProblemInfo(problemLink = "https://neetcode.io/problems/is-anagram")
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int length = s.length();
        char[] charArray = new char[26];
        for (int i = 0; i < length; i++) {
            charArray[s.charAt(i) - 'a']++;
            charArray[t.charAt(i) - 'a']--;
        }
        for (int freq : charArray) {
            if (freq != 0) return false;
        }
        return true;
    }
}   