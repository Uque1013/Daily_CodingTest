/**/

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
