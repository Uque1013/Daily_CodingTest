/* 알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 대문자로 변환하여 return 하는 solution 함수를 완성해 주세요. */

class Solution {
    public String solution(String myString) {
        String answer = "";
        int temp;
        for(int i = 0; i < myString.length(); i++) {
            temp = (int)myString.charAt(i);
            if(temp >= 97 && temp <= 122) answer += (char)(temp - 32);
            else answer += (char)temp;
        }
        return answer;
    }
}

public class Change_to_uppercase {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String myString = "aBcDeFg";
        String result = sol.solution(myString);
        System.out.println("result = " + result);

        myString = "AAA";
        result = sol.solution(myString);
        System.out.println("result = " + result);
    }
}
