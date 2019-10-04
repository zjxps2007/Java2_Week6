import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        //변수 선언
        int max=0,min=0;
        Scanner sc = new Scanner(System.in);

        //입력받은만큼 배열 생성
        System.out.print("학생 수를 입력하세요: ");
        int index = sc.nextInt();
        int[] score = new int[index];
        //배열에 입력받음
        for(int i = 0;i<score.length;i++) {
            System.out.print((i+1)+"번쨰 학생의 점수를 입력하세요:");
            score[i] = sc.nextInt();
            //min에 값을 넣음
            min = score[i];
        }
        //최대값 최소값 판별
        for(int i = 0;i<score.length;i++) {
            //최대값 판별
            if(max<score[i]) {
                max = score[i];
            }
            //최소값 판별
            if (min>score[i]) {
                min = score[i];
            }
        }
        //출력
        System.out.println("최고 점수: "+max);
        System.out.println("최저 점수: "+min);
    }
}
