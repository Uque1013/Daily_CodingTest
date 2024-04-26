/*자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.*/

package Level.I;
class Solution {
    public int solution(int n) {
        int answer = 0;

        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }
}

public class Add_a_digit {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 123;
        int result = sol.solution(n);
        System.out.println("result = "+ result);

        n = 987;
        result = sol.solution(n);
        System.out.println("result = "+ result);
    }
}
