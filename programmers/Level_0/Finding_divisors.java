/* 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요. */

import java.lang.reflect.Array;
import java.util.*;

class Solution {
    public int[] solution(int n) {
        int num = 1;

        for(int i = 1; i < n; i++) {
            if(n % i == 0) num ++;
        }

        int[] answer = new int[num];
        int idx = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) answer[idx++] = i;
        }
        Arrays.sort(answer);

        return answer;
    }
}

public class Finding_divisors {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 24;
        int[] result = sol.solution(n);
        System.out.println("n : " + n + " | result = " + Arrays.toString(result));

        n = 29;
        result = sol.solution(n);
        System.out.println("n : " + n + " | result = " + Arrays.toString(result));
    }
}
