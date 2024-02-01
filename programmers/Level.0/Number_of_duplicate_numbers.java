/* 정수가 담긴 배열 array와 정수 n이 매개변수로 주어질 때, array에 n이 몇 개 있는 지를 return 하도록 solution 함수를 완성해보세요. */

class Solution {
    public int solution(int [] array, int n) {
        int answer = 0;

        for(int i = 0; i < array.length; i++) {
            if(array[i] == n) answer ++;
        }

        return answer;
    }
}
public class Number_of_duplicate_numbers {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] array = {1, 1, 2, 3, 4, 5};
        int n = 1;
        int result = sol.solution(array, n);
        System.out.println("result = " + result);

        array = new int[]{0, 2, 3, 4};
        result = sol.solution(array, n);
        System.out.println("result = " + result);
    }
}
