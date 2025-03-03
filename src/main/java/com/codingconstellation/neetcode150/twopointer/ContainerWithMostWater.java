package com.codingconstellation.neetcode150.twopointer;

import com.customannotation.DifficultyLevel;
import com.customannotation.ProblemCategory;
import com.customannotation.ProblemInfo;

import static com.customannotation.enums.Difficulty.MEDIUM;
import static com.customannotation.enums.ProblemTag.ARRAY;

@DifficultyLevel(MEDIUM)
@ProblemCategory({ARRAY})
@ProblemInfo(problemLink = "https://neetcode.io/problems/max-water-container")
public class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int maxArea = Integer.MIN_VALUE;
        int left = 0, right = heights.length - 1;
        while (left < right) {
            int maxHeight = Math.min(heights[right], heights[left]);
            maxArea = Math.max(maxArea, maxHeight * (right - left));
            if(heights[left] <= heights[right]) left++;
            else right--;
        }
        return maxArea;
    }
}   