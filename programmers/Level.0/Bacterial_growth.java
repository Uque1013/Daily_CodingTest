/*  */

class Solution {
    public int solution(int n, int t) {
        int answer = 0;

        for(int i = 1; i <= t; i++) {
            n = n * 2;
        }
        answer = n;

        return answer;
    }
}
public class Bacterial_growth {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int n = 2; int t = 10;
        int result = sol.solution(n, t);
        System.out.println("result = " + result);

        n = 7; t = 15;
        result = sol.solution(n, t);
        System.out.println("result = " + result);
    }
}
