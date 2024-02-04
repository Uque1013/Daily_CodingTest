/* 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요. */

import java.util.Arrays;

class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;
        int max = 0; // 최대 공약수

        for(int i = 1; i <= numer && i <= denom; i++) {
            if(denom % i == 0 && numer % i == 0) max = i;
        }

        numer = numer / max;
        denom = denom / max;

        int[] answer = {numer, denom};

        return answer;
    }
}

public class The_addition_of_fractions {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int numer1 = 1;
        int denom1 = 2;
        int numer2 = 3;
        int denom2 = 4;
        int[] result = sol.solution(numer1, denom1, numer2, denom2);
        System.out.println("result = " + Arrays.toString(result));

        numer1 = 9;
        denom1 = 2;
        numer2 = 1;
        denom2 = 3;
        result = sol.solution(numer1, denom1, numer2, denom2);
        System.out.println("result = " + Arrays.toString(result));
    }
}
