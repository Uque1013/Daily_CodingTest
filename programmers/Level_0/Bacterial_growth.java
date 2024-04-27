/* 어떤 세균은 1시간에 두배만큼 증식한다고 합니다. 처음 세균의 마리수 n과 경과한 시간 t가
매개변수로 주어질 때 t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요. */

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
