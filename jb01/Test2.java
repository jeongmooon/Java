import java.util.Scanner;

public class Test2 {
    private static Scanner kb;
    
    public static void main(String[] args) {
        kb = new Scanner(System.in);
        String cmd;

        do {

            System.out.print(">java = 시작하기 E = 종료하기");
            cmd = kb.nextLine();

            if("java".equals(cmd)){
                System.out.print("Test2 = 더하기 빼기 ");
                cmd = kb.nextLine();

                if("Test2".equals(cmd)){
                    System.out.println("숫자 두개를 입력해 주세요");
                    String s = kb.nextLine();
                    test1(s.split(" "));
                }

            }
            
        } while (!("E".equals(cmd)));

    }

    public static void test1(String[] s) {

        if(s.length == 2){
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);

            if(a<b){
                System.out.println("첫번째 인수: "+a+", 두번째 인수: "+b);
                System.out.println(a+"+"+b+"="+(a+b));
            } else {
                System.out.println("첫번째 인수: "+a+", 두번째 인수: "+b);
                System.out.println(a+"-"+b+"="+(a-b));
            }
        } else {
            System.out.println("잘못 입력하셨습니다");
        }
    }
}