/* 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요. */

package Level_I;

import java.util.Arrays;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        for(int i = 0; i < n; i++) {
            answer[i] = (long)x * (i+1);
        }

        return answer;
    }
}

public class N_numbers_spaced_by_X {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int x = 2; int n = 5;
        long[] result = sol.solution(x, n);
        System.out.println("x : " + x + ", n : "+ n +
                " | result = " + Arrays.toString(result));

        x = 4; n = 3;
        result = sol.solution(x, n);
        System.out.println("x : " + x + ", n : "+ n +
                " | result = " + Arrays.toString(result));

        x = -4; n = 2;
        result = sol.solution(x, n);
        System.out.println("x : " + x + ", n : "+ n +
                " | result = " + Arrays.toString(result));
    }
}
