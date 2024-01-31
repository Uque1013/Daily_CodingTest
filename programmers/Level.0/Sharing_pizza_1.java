/* 머쓱이네 피자가게는 피자를 일곱 조각으로 잘라 줍니다. 피자를 나눠먹을 사람의 수 n이 주어질 때,
모든 사람이 피자를 한 조각 이상 먹기 위해 필요한 피자의 수를 return 하는 solution 함수를 완성해보세요. */

class Solution {
    public int solution(int n) {
        /*int answer = 0;

        if(n % 7 == 0) answer = n / 7;
        else answer = n / 7 + 1;

        return answer;*/

        // 삼항 연산자 사용 (조건식 ? 반환값 1 : 반환값 2)
        return n % 7 == 0 ? n / 7 : n / 7 + 1;
    }
}

public class Sharing_pizza_1 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 7;
        int result = sol.solution(n);
        System.out.println("result = " + result);

        n = 1;
        result = sol.solution(n);
        System.out.println("result = " + result);

        n = 15;
        result = sol.solution(n);
        System.out.println("result = " + result);
    }
}
