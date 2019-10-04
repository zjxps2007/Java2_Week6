import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] stu_score = {10,30,20,50,40};

        System.out.print("잦을 점수를 입력하세요: ");
        int score = scan.nextInt();

        for(int i =0 ;i<stu_score.length;i++){
            if(stu_score[i]==score) {
                System.out.println("점수가 "+score+"인 학생은 "+(i+1)+"번쨰 학생입니다.");
            }
        }
    }
}
