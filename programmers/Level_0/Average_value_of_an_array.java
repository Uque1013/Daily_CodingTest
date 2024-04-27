/* 정수 배열 numbers가 매개변수로 주어집니다. numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요. */

class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double sum = 0;

        for(int i = 0; i < numbers.length; i++) sum += numbers[i];
        answer = sum / numbers.length;

        return answer;
    }
}
public class Average_value_of_an_array {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double result = sol.solution(numbers);
        System.out.println("result = " + result);

        numbers = new int[]{89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        result = sol.solution(numbers);
        System.out.println("result = " + result);

    }
}
