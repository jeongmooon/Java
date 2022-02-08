package jb02.part02;

/*
    1. for(초기화:조건; 변화값)문을 이용
    2. while(조건)문과 do-while(조건)문과의
    차이점 및 활용확인
*/

public class ForTest {
    
    // main method
    public static void main(String[] args) {
        
        int j = 5;
        System.out.println(j+"단을 출력합니다.");

        //for 문은 while 문과 달리 초기화를 for문 내부에서 한다.
        for(int i=1; i<10; i++){
            System.out.println(j+"*"+i+"="+j*i);
        }
        
        //==> 반복문 for / while 사용과 차이점 이해
        // int k=1;
        // while(k<10){
        //     System.out.println("5*"+k+"="+5*k);
        //     k++;
        // }

        // System.out.println("i의 최정변경 값 :"+i);
        // System.out.println("k의 최종변경 값 :"+k);
    
        //==> 무한루프와 무한루프후단의 실행문에서 compile error를 이해하면 ...
        for( ; ; ){
            System.out.println("여기는 반복문 내부의 무한 루프");
        }
        //==> 아래의 주석을 풀면 compile error가 발생한다 이유는...
        //System.out.println("error가 발생한다. 이유는 ...");
    
    }//end of main

}//end of class
