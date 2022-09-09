package leetcode.aimToOffer;

import java.util.Arrays;

public class rotatedArrayFindSmall {
}

// O(N),顺序遍历查找，使用库函数
class Solution1 {
    public int minArray(int[] numbers) {
        return Arrays.stream(numbers).min().getAsInt();
    }
}


// O(lgn) 二分查找
class Solution2 {
    public int minArray(int[] numbers) {
        return findSmall(0, numbers.length - 1, numbers);
    }

    private int findSmall(int l, int r, int[] numbers) {
        // 待寻找的区间长度小于等于3. 直接遍历找
        if (r - l <= 2) {
            int ans = Integer.MAX_VALUE;
            for (int i = l; i <= r; i++) {
                ans = Math.min(ans, numbers[i]);
            }
            return ans;
        } else {
            int mid = l + (r - l) / 2;
            return Math.min(findSmall(l, mid, numbers), findSmall(mid + 1, r, numbers));
        }
    }
}