import java.util.Scanner;

public class Test3 {
    private static Scanner kb;
    
    public static void main(String[] args) {
        kb = new Scanner(System.in);
        String cmd;

        do {

            System.out.print(">java = 시작하기 E = 종료하기");
            cmd = kb.nextLine();

            if("java".equals(cmd)){
                System.out.print("Test3 = 홀수,짝수,3의배수");
                cmd = kb.nextLine();

                if("Test3".equals(cmd)){
                    System.out.println("숫자 압력해 주세요");
                    String s = kb.nextLine();
                    test1(s.split(" "));
                }

            }
            
        } while (!("E".equals(cmd)));

    }

    public static void test1(String[] s) {

        for(int i=0; i<s.length; i++){
            Integer.parseInt(s[i]);
            
            System.out.println(s[0] + s[1]);
        }
    }
}