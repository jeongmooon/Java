import java.util.Scanner;

public class Test1 {
    private static Scanner kb;
    
    public static void main(String[] args) {
        kb = new Scanner(System.in);
        String cmd;

        do {

            System.out.print(">java = 시작하기 E = 종료하기");
            cmd = kb.nextLine();

            if("java".equals(cmd)){
                System.out.print("Test1 = 전화번호 입력하기");
                cmd = kb.nextLine();

                if("Test1".equals(cmd)){
                    String s = kb.nextLine();
                    test1(s.split(" "));
                }

            }
            
        } while (!("E".equals(cmd)));

    }

    public static void test1(String[] s) {
        System.out.println("나의 이름은 " + s[0] + " 입니다");
        System.out.println(s[0] + "씨의 [hp]는 " +s[1] + " 입니다");
    }
}