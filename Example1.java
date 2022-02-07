import java.util.Scanner;

public class Example1 {
    private static Scanner kb;
    
    public static void main(String[] args) {
        kb = new Scanner(System.in);
        String cmd;

        do {

            System.out.print(">java = 시작하기 E = 종료하기");
            cmd = kb.nextLine();

            if("java".equals(cmd)){
                System.out.print("Example1 = 점수등급 비교");
                cmd = kb.nextLine();

                if("Example1".equals(cmd)){
                    System.out.println("한명의 점수(0~100)를 압력해 주세요");
                    int s = kb.nextInt();
                    kb.nextLine();
                    test1(s);
                }

            }
            
        } while (!("E".equals(cmd)));

    }

    public static void test1(int s) {

        if(0<=s && s<=100){
            if(s>=90){
                System.out.println("입력하신 값 "+s+"점은 수입니다");
            }
            if(s>=80 && s<90){
                System.out.println("입력하신 값 "+s+"점은 우입니다");
            }
            if(s>=70 && s<80){
                System.out.println("입력하신 값 "+s+"점은 미입니다");
            }
            if(s>=60 && s<70){
                System.out.println("입력하신 값 "+s+"점은 양입니다");
            }
            if(s<60){
                System.out.println("입력하신 값 "+s+"점은 가입니다");
            }
        } else {
            System.out.println("숫자 범위 틀립니다");
        } 
    } 
}