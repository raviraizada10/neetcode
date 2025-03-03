package com.codingconstellation.neetcode150.ArraysHashing;

import com.customannotation.DifficultyLevel;
import com.customannotation.ProblemCategory;
import com.customannotation.ProblemInfo;

import java.util.HashMap;
import java.util.HashSet;

import static com.customannotation.enums.Difficulty.EASY;
import static com.customannotation.enums.ProblemTag.ARRAY;

@DifficultyLevel(EASY)
@ProblemCategory({ARRAY})
@ProblemInfo(problemLink = "https://neetcode.io/problems/two-integer-sum")
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(sumMap.containsKey(target-nums[i])) return new int[]{sumMap.get(target-nums[i]), i};
            sumMap.put(nums[i],i);
        }
        return new int[]{};
    }
}   