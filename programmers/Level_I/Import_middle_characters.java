/* 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다. */

package Level_I;
class Solution {
    public String solution(String s) {
        String answer = "";

        int idx = s.length() / 2;

        if(s.length() % 2 != 0) answer = s.substring(idx, idx+1);
        else if(s.length() % 2 == 0) answer = s.substring(idx-1, idx+1);

        return answer;
    }
}

public class Import_middle_characters {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "abcde";
        String result = sol.solution(s);
        System.out.println("result = " + result);

        s = "banana";
        result = sol.solution(s);
        System.out.println("result = " + result);
    }
}
