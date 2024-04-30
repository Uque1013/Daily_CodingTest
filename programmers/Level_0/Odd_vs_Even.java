/* 정수 리스트 num_list가 주어집니다. 가장 첫 번째 원소를 1번 원소라고 할 때,
홀수 번째 원소들의 합과 짝수 번째 원소들의 합 중 큰 값을 return 하도록 solution 함수를 완성해주세요.
두 값이 같을 경우 그 값을 return합니다. */

import java.util.Arrays;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int odd = 0; int even = 0;

        for(int i = 0; i < num_list.length; i++) {
            if(i % 2 != 0) odd += num_list[i];
            else if(i % 2 == 0) even += num_list[i];
        }
        if(odd < even) answer = even;
        else if(odd >= even) answer = odd;

        return answer;
    }
}

public class Odd_vs_Even {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int result = sol.solution(num_list);
        System.out.println("num_list : " + Arrays.toString(num_list) + " | result = " + result);

        num_list = new int[]{-1, 2, 5, 6, 3};
        result = sol.solution(num_list);
        System.out.println("num_list : " + Arrays.toString(num_list) + " | result = " + result);
    }
}
