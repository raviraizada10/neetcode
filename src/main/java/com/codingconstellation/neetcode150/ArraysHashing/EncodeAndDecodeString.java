package com.codingconstellation.neetcode150.ArraysHashing;

import com.customannotation.DifficultyLevel;
import com.customannotation.ProblemCategory;
import com.customannotation.ProblemInfo;

import java.util.ArrayList;
import java.util.List;

import static com.customannotation.enums.Difficulty.MEDIUM;
import static com.customannotation.enums.ProblemTag.ARRAY;

@DifficultyLevel(MEDIUM)
@ProblemCategory({ARRAY})
@ProblemInfo(problemLink = "https://neetcode.io/problems/string-encode-and-decode")
public class EncodeAndDecodeString {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb
                    .append(str.length())
                    .append("#")
                    .append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int hashIndex = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, hashIndex));
            String word = str.substring(hashIndex + 1, hashIndex + 1 + length);
            result.add(word);
            i = hashIndex + 1 + length;
        }
        return result;
    }
}   