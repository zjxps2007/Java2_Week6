import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("소수인지 확인할 숫자를 입력하세요: ");
        int num = sc.nextInt();

        for(int i = 2;i<=num;i++) {
            if(num%i==0) {
                System.out.println("소수가 아닙니다.");
                break;
            }
            else {
                System.out.println("소수입니다.");
                break;
            }
        }
    }
}
