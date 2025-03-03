package com.codingconstellation.neetcode150.ArraysHashing;

import com.customannotation.DifficultyLevel;
import com.customannotation.ProblemCategory;
import com.customannotation.ProblemInfo;

import java.util.HashSet;

import static com.customannotation.enums.Difficulty.MEDIUM;
import static com.customannotation.enums.ProblemTag.ARRAY;

@DifficultyLevel(MEDIUM)
@ProblemCategory({ARRAY})
@ProblemInfo(problemLink = "https://neetcode.io/problems/longest-consecutive-sequence")
public class LongestConsecutiveSubsequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        int longest = 0;
        for (int num : nums) {
            numSet.add(num);
        }

        for (int num : nums) {
            if (!numSet.contains(num - 1)) {
                int count = 1;
                int current = num;
                while (numSet.contains(current + 1)) {
                    count++;
                    current++;
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}