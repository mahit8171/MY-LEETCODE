import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int num = left; num <= right; num++) {
            if (isSelfDividing(num)) {
                result.add(num);
            }
        }

        return result;
    }

    private boolean isSelfDividing(int num) {
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;

            // Rule 1: digit should not be 0
            if (digit == 0) return false;

            // Rule 2: number should be divisible by digit
            if (num % digit != 0) return false;

            temp /= 10;
        }

        return true;
    }
}
