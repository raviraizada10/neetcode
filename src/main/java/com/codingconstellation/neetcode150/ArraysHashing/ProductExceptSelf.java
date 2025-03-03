package com.codingconstellation.neetcode150.ArraysHashing;

import com.customannotation.DifficultyLevel;
import com.customannotation.ProblemCategory;
import com.customannotation.ProblemInfo;

import java.util.Arrays;

import static com.customannotation.enums.Difficulty.MEDIUM;
import static com.customannotation.enums.ProblemTag.*;

@DifficultyLevel(MEDIUM)
@ProblemCategory({ARRAY})
@ProblemInfo(problemLink = "https://neetcode.io/problems/products-of-array-discluding-self")
public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        var leftProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }
        var rightProduct = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct*=nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ProductExceptSelf().productExceptSelf(new int[]{1, 2, 4, 6})));
    }
}   