class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        return number % n == 0 && number % m ==0 ? answer = 1 : answer;
    }
}
public class Common_multiple {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int number = 60; int n = 2; int m = 3;
        int result = sol.solution(number, n, m);
        System.out.println("result = " + result);

        number = 55; n = 10; m = 5;
        result = sol.solution(number, n, m);
        System.out.println("result = " + result);
    }
}
