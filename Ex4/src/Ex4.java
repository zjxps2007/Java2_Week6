import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        int[] sut_score = new int[5];
        int sum = 0;

        Scanner scan = new Scanner(System.in);

        for(int i = 0;i<sut_score.length;i++) {
            System.out.print((i+1)+"번쨰 학생 점수 입력: ");
            sut_score[i] = scan.nextInt();
            sum += sut_score[i];
        }
        System.out.println("평균 성적은"+(double)sum/sut_score.length+"입니다..");
    }
}
