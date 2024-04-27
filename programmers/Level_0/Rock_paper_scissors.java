/* 가위는 2 바위는 0 보는 5로 표현합니다. 가위 바위 보를 내는 순서대로 나타낸 문자열 rsp가 매개변수로 주어질 때,
rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return하도록 solution 함수를 완성해보세요. */

class Solution {
    // rock : 0, scissor : 2, paper : 5
    public String solution(String rsp) {
        String answer = "";

        for (int i = 0; i < rsp.length(); i++) {
            switch(rsp.charAt(i)) {
                case '2': answer += "0"; break;
                case '5': answer += "2"; break;
                case '0': answer += "5"; break;
            }
        }

        return answer;
    }
}

public class Rock_paper_scissors {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String rsp = "2";
        String result = sol.solution(rsp);
        System.out.println("result = " + result);

        rsp = "205";
        result = sol.solution(rsp);
        System.out.println("result = " + result);

    }
}
