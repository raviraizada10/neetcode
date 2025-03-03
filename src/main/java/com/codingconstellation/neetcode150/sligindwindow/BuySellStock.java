package com.codingconstellation.neetcode150.sligindwindow;

import com.customannotation.DifficultyLevel;
import com.customannotation.ProblemCategory;
import com.customannotation.ProblemInfo;

import static com.customannotation.enums.Difficulty.EASY;
import static com.customannotation.enums.ProblemTag.SLIDING_WINDOW;

@DifficultyLevel(EASY)
@ProblemCategory({SLIDING_WINDOW,})
@ProblemInfo(problemLink = "https://neetcode.io/problems/buy-and-sell-crypto", problemNumber = "", solutionLink = "https://algo.monster/liteproblems/")
public class BuySellStock {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPriceSoFar= 0;
        for (int price : prices) {
            maxProfit = Math.max(maxProfit, price - minPriceSoFar);
            minPriceSoFar = Math.min(minPriceSoFar, price);
        }
        return maxProfit;
    }
}   