import java.util.Scanner;

public class Ex2 {
    public static  void main(String[] args) {
        int Max =0;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("1이상의 정수를 입력하세요. 0입력시 종료: ");
            int digit = input.nextInt();
            if(digit==0) {
                break;
            }
            else if (digit<1) {
                System.out.println("1이상의 수를 입력해주세요. ");
                continue;
            }
            if (Max<digit) {
                Max = digit;
            }
            System.out.println("입력한 수 중 가장 큰 수는" +Max+"입니다.");
        }
    }
}
