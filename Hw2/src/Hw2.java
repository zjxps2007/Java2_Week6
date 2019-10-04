import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        int num,num1;
        Scanner sc = new Scanner(System.in);

        System.out.print("첫번쨰 숫자를 입력하세요: ");
        num = sc.nextInt();
        System.out.print("두번쨰 숫자를 입력하세요: ");
        num1 = sc.nextInt();

        if(num<num1) {
            int temp = num1;
            num1 = num;
            num = temp;
        }

        for(){

        }

    }
}
