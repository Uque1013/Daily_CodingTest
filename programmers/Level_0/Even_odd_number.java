/* 정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요. */

import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0) answer[0] ++;
            else if(num_list[i] % 2 != 0) answer[1] ++;
        }

        return answer;
    }
}

public class Even_odd_number {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] num_list = {1,2,3,4,5};
        int[] result = sol.solution(num_list);
        System.out.println("num_list : " + Arrays.toString(num_list) + " | result = " + Arrays.toString(result));

        num_list = new int[]{1,3,5,7};
        result = sol.solution(num_list);
        System.out.println("num_list : " + Arrays.toString(num_list) + " | result = " + Arrays.toString(result));
    }
}
