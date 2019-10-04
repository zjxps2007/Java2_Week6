import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소수인지 확인할 숫자를 입력하세요: ");
        int num = sc.nextInt();

        //반복하며 자기 자신까지 나눔
        for(int i = 2;i<=num;i++) {
            //소우가 아닐때 출력
            if(num%i==0) {
                System.out.println("소수가 아닙니다.");
                break;
            }
            //소수 일때 출력
            else {
                System.out.println("소수입니다.");
                break;
            }
        }
    }
}
