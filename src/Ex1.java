import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int digit;

        Scanner input = new Scanner(System.in);
        System.out.print("약수를 구할 숫자를 입력하세요: ");

        digit = input.nextInt();
        System.out.print(digit+"약수는: ");
        for(int i=1;i<=digit;i++) {
            if(digit%i==0) {
                System.out.print(i+" ");
            }
        }
    }
}
