/* 머쓱이는 추운 날에도 아이스 아메리카노만 마십니다. 아이스 아메리카노는 한잔에 5,500원입니다.
머쓱이가 가지고 있는 돈 money가 매개변수로 주어질 때, 머쓱이가 최대로 마실 수 있는 아메리카노의 잔 수와
남는 돈을 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요. */

import java.util.Arrays;

class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffee = 5500;

        answer[0] = money / coffee;
        answer[1] = money % coffee;

        return answer;
    }
}

public class Ice_coffee {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int money = 5500;
        int[] result = sol.solution(money);
        System.out.println("money = " + money + " | result = " + Arrays.toString(result));

        money = 15000;
        result = sol.solution(money);
        System.out.println("money = " + money + " | result = " + Arrays.toString(result));
    }
}
