class Solution {
    public String solution(String myString) {
        String answer = "";
        int temp;
        for(int i = 0; i < myString.length(); i++) {
            temp = (int)myString.charAt(i);
            if(temp >= 65 && temp <= 90) answer += (char)(temp+32);
            else answer += (char)temp;
        }
        return answer;
    }
}

public class Change_to_lowercase {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "aBcDeFg";
        String result = sol.solution(myString);
        System.out.println("result = " + result);

        myString = "aaa";
        result = sol.solution(myString);
        System.out.println("result = " + result);
    }
}
