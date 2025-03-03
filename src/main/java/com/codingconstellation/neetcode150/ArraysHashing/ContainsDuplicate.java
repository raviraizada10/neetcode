package com.codingconstellation.neetcode150.ArraysHashing;

import com.customannotation.DifficultyLevel;
import com.customannotation.ProblemCategory;
import com.customannotation.ProblemInfo;

import java.util.HashSet;

import static com.customannotation.enums.Difficulty.EASY;
import static com.customannotation.enums.ProblemTag.ARRAY;

@DifficultyLevel(EASY)
@ProblemCategory({ARRAY})
@ProblemInfo(problemLink = "https://neetcode.io/problems/duplicate-integer")
public class ContainsDuplicate {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (!numSet.add(num)) return true;
        }
        return  false;
    }
}