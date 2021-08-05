package ac.kr;

import java.text.DecimalFormat;
import java.util.Scanner;

public class JungolPractice {

    // 출력: 자가진단 1
    // http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=140&sca=10
    public void practice1() {
        System.out.println("My name is Hong Gil Dong.");
        System.out.println("I am 13 years old.");
        //javascript 같은 경우
        // console.log('hihi');
        char ch = 'a';
    }

    /*
     * 1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.
     * 2.1야드와 10.5인치를 각각 cm로 변환하여
     * 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.
     * */
    public void practice2() {
        float yd = 91.44f; // 실수는 float
        float in = 2.54f;
        float yardToCm = 2.1f * yd;
        float inchToCm = 10.5f * in;

        String strYardToCm = String.format("%.1f", yardToCm);
        String strInchToCm = String.format("%.1f", inchToCm);

        System.out.println("2.1야드toCm : " + strYardToCm);
        System.out.println("10.5인치toCm : " + strInchToCm);
    }

    // 1 두 개의 문자열을 입력받아서
    // 2 두 문자열의 길이의 합을 출력하는 프로그램을 작성하시오.
    // 3 각 문자열의 길이는 30자 미만이다.
    public void practice3() {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 문자열 을 입력하세요");
        String str = sc.nextLine();
        if(str.length() > 30) {
            System.out.println("문자열1의 길이는 20자 미만 이어야 합니다.");
            return;
        }
        System.out.println("두번째 문자열 을 입력하세요");
        String str2 = sc.nextLine();
        if(str2.length() > 30) {
            System.out.println("문자열2의 길이는 20자 미만 이어야 합니다.");
            return;
        }
        System.out.println("입력받은 값(첫번째): " + str);
        System.out.println("입력받은 값(두번째): " + str2);
        int sum = str.length() + str2.length();
        System.out.println("=============");
        System.out.println("길이: " + sum);
    }

    // 5개의 정수를 입력받아 모두 붙여서 문자열로 저장한 후 세 자씩 나누어서 출력하는 프로그램을 작성하시오.
    public void practice4() {
        System.out.println("practice4");
    }
    public void practice5() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] arr = input.split(" ");
        String result = "";
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        for (int i = 0; i < result.length(); i++) {
            System.out.print(result.charAt(i));
            count++;
            if (count % 3 == 0)
                System.out.println();
        }
    }
    public void practice6() {
        int[][] arr = new int[5][4];
        Scanner sc = new Scanner(System.in);
        int[] sum = new int[5];
        double aver;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int a = 0; a < arr[i].length; a++) {
                arr[i][a] = sc.nextInt();
                sum[i] += arr[i][a];
            }
        }
        for (int i = 0; i < sum.length; i++) {
            aver = sum[i] / 4;
            if(aver >= 80) {
                System.out.println("합격");
                count++;
            }else {
                System.out.println("불합격");
            }
        }
        System.out.println("합격한 사람의 수 : " + count);
    }
}


