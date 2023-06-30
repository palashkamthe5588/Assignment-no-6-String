


💡 **Question 6**

An integer array original is transformed into a **doubled** array changed by appending **twice the value** of every element in original, and then randomly **shuffling** the resulting array.

Given an array changed, return original *if* changed *is a **doubled** array. If* changed *is not a **doubled** array, return an empty array. The elements in* original *may be returned in **any** order*.

**Example 1:**

**Input:** changed = [1,3,4,2,6,8]

**Output:** [1,3,4]

**Explanation:** One possible original array could be [1,3,4]:

- Twice the value of 1 is 1 * 2 = 2.
- Twice the value of 3 is 3 * 2 = 6.
- Twice the value of 4 is 4 * 2 = 8.

Other original arrays could be [4,3,1] or [3,1,4].

 soln :// time compplexity :O(nlogn)
       //space complexity :O(n)

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public int[] findOriginalArray(int[] changed) {
        ArrayList<Integer> original = new ArrayList<>();

        // Sort the changed array
        Arrays.sort(changed);

        for (int i = changed.length - 1; i >= 0; i--) {
            int current = changed[i];

            // Check if the current element is divisible by 2
            if (current % 2 == 0) {
                int originalValue = current / 2;
                original.add(originalValue);
            } else {
                // If not divisible by 2, return an empty array
                return new int[]{};
            }
        }

        // Convert the ArrayList to an array
        int[] result = new int[original.size()];
        for (int i = 0; i < original.size(); i++) {
            result[i] = original.get(i);
        }

        return result;
    }
}
