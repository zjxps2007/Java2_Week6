import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        int num1, num2, res1, max_first, max_second, ans1 = 0, ans2 = 0;

        Scanner sc = new Scanner(System.in);
        //첫번쨰숫자 입력 받음
        System.out.print("첫 번째 숫자를 입력하세요: ");
        num1 = sc.nextInt();
        //두번째 숫자 입력 받음
        System.out.print("두 번째 숫자를 입력하세요: ");
        num2 = sc.nextInt();
        //큰수를 작은수로 나누기
        if(num1 > num2) {
            max_first = num1;
            max_second = num2;
        } else {
            max_first = num2;
            max_second = num1;
        }

        //최대공약수
        while(max_first % max_second != 0) {
            res1 = max_first % max_second;
            max_first = max_second;
            max_second = res1;
            //최소 공배수
            if(max_first % max_second == 0) {
                ans1 = max_second;
                ans2 = (num1 * num2) / ans1;
            }
        }
        //출력
        System.out.println("최소공배수: " + ans2);

    }
}
