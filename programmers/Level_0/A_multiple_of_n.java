/*  */

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int num = 0; // n의 배수 구한 길이
        int idx = 0; // answer의 인덱스

        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0)
                num++;
        }

        int[] answer = new int[num];
        for(int i = 0; i < numlist.length; i++) {
            if(numlist[i] % n == 0) {
                answer[idx] = numlist[i];
                // answer의 인덱스가 증가하면서 numlist[i]의 값이 들어갈 수 있게 idx++을 해줌
                idx++;
            }
        }

        return answer;
    }
}
public class A_multiple_of_n {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 3; int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] result = sol.solution(n, numlist);
        System.out.println("n : " + n + ", numlist : " + Arrays.toString(numlist) +
                 " | result = " + Arrays.toString(result));

        n = 5; numlist = new int[]{1, 9, 3, 10, 13, 5};
        result = sol.solution(n, numlist);
        System.out.println("n : " + n + ", numlist : " + Arrays.toString(numlist) +
                " | result = " + Arrays.toString(result));

        n = 12; numlist = new int[]{2, 100, 120, 600, 12, 12};
        result = sol.solution(n, numlist);
        System.out.println("n : " + n + ", numlist : " + Arrays.toString(numlist) +
                " | result = " + Arrays.toString(result));
    }
}
