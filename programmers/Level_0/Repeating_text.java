/*  */

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";

        for(int i = 0; i < my_string.length(); i++) {
            for(int j = 0; j < n; j++) {
                answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}

public class Repeating_text {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String my_string = "hello"; int n = 3;
        String result = sol.solution(my_string, n);
        System.out.println("my_string : " + my_string + ", n : " + n +
                " | result = " + result);

        my_string = "bamboo"; n = 4;
        result = sol.solution(my_string, n);
        System.out.println("my_string : " + my_string + ", n : " + n +
                " | result = " + result);
    }
}
