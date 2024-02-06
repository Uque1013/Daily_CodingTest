/* 실수 flo가 매개 변수로 주어질 때, flo의 정수 부분을 return하도록 solution 함수를 완성해주세요. */

class Solution {
    public int solution(double flo) {
        int answer = (int)flo;
        return answer;
    }
}

public class Integer_part {
    public static void main(String[] args) {
        Solution sol = new Solution();
        double flo = 1.42;
        int result = sol.solution(flo);
        System.out.println("result = " + result);

        flo = 69.32;
        result = sol.solution(flo);
        System.out.println("result = " + result);
    }
}
