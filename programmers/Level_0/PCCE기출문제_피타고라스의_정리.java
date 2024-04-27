// 디버깅 문제 (코드 한 줄만 변경)
import java.util.Scanner;
public class PCCE기출문제_피타고라스의_정리 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        // 원래 코드
        // int b_square = c - a;

        // 수정 코드
        int b_square = c*c - a*a;

        System.out.println(b_square);
    }
}