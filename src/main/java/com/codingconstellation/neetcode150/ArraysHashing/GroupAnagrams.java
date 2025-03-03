package com.codingconstellation.neetcode150.ArraysHashing;

import com.customannotation.DifficultyLevel;
import com.customannotation.ProblemCategory;
import com.customannotation.ProblemInfo;

import java.util.*;

import static com.customannotation.enums.Difficulty.MEDIUM;
import static com.customannotation.enums.ProblemTag.ARRAY;

@DifficultyLevel(MEDIUM)
@ProblemCategory({ARRAY})
@ProblemInfo(problemLink = "https://neetcode.io/problems/anagram-groups")
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> anagrams = new HashMap<>();
        for (String val : strs) {
            anagrams.computeIfAbsent(sortStr(val), key -> new ArrayList<>()).add(val);
        }
        return anagrams.values().stream().toList();
    }

    public String sortStr(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return Arrays.toString(charArray);
    }
}   