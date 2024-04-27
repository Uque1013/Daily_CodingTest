/* 머쓱이는 큰 종이를 1 x 1 크기로 자르려고 합니다. 예를 들어 2 x 2 크기의 종이를 1 x 1 크기로 자르려면 최소 가위질 세 번이 필요합니다.
정수 M, N이 매개변수로 주어질 때, M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return 하도록 solution 함수를 완성해보세요.*/

class Solution {
    // 가로 : M, 세로 : N
    public int solution(int M, int N) {
        int answer = (M * N) - 1;

        return answer;
    }
}

public class Cut_paper {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int M = 2; int N = 2;
        int result = sol.solution(M, N);
        System.out.println("가로 : " + M + " 세로 : " + N +
                " | result = " + result);
        M = 2; N = 5;
        result = sol.solution(M, N);
        System.out.println("가로 : " + M + " 세로 : " + N +
                " | result = " + result);

    }
}
