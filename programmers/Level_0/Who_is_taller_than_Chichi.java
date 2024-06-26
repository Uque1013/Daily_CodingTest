/* 치치네 학교에서 키 순으로 줄을 설 때 몇 번째로 서야 하는지 궁금해졌습니다.
치치네 반 친구들의 키가 담긴 정수 배열 array와 머쓱이의 키 height가 매개변수로 주어질 때,
치치보다 키 큰 사람 수를 return 하도록 solution 함수를 완성해보세요. */

import java.util.Arrays;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] > height) answer++;
        }

        return answer;
    }
}

public class Who_is_taller_than_Chichi {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] array = {149, 180, 192, 170};
        int height = 167;
        int result = sol.solution(array, height);

        System.out.println("치치의 키 : " + height);
        System.out.println(Arrays.toString(array) +" | result = " + result);

        array = new int[] {180, 120, 140};
        height = 190;
        result = sol.solution(array, height);

        System.out.println("치치의 키 : " + height);
        System.out.println(Arrays.toString(array) +" | result = " + result);
    }
}
