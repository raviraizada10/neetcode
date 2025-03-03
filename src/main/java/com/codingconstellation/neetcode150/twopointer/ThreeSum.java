package com.codingconstellation.neetcode150.twopointer;

import com.customannotation.DifficultyLevel;
import com.customannotation.ProblemCategory;
import com.customannotation.ProblemInfo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.customannotation.enums.Difficulty.MEDIUM;
import static com.customannotation.enums.ProblemTag.ARRAY;

@DifficultyLevel(MEDIUM)
@ProblemCategory({ARRAY})
@ProblemInfo(problemLink = "https://neetcode.io/problems/three-integer-sum")
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int low, high, sum;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            low = i + 1;
            high = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (low < high) {
                sum = nums[i] + nums[low] + nums[high];
                if (sum < 0) {
                    low++;
                }
                else if (sum > 0) {
                    high--;
                }
                else {
                    result.add(List.of(nums[i], nums[low], nums[high]));
                    while (i > 0 && nums[low] == nums[low + 1]) low++;
                    while (i > 0 && nums[high] == nums[high - 1]) high--;
                    low++;
                    high--;
                }
            }
        }
        return result;
    }
}   