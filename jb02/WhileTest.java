//package jb02.part02;
/*
    1. while(����)
    2. do-while(����)
    - Ȱ�� �� ������
    - while�� ������ �´´ٸ� ����
    - do-while�� �ѹ� ������ �� ������ �´´ٸ� �����
*/

public class WhileTest{
    
    //main method
    public static void main(String[] args) {
        
        // while��
        int i =0;   // #1. ��ȯ���� ������ �ֱ����� int i �ʱ�ȭ
        while(i<10){// #2. ����(boolean data type)
        //while(0){ // #==> compile error(error�� Ȯ���ϸ� ���ǹ��� boolean type�� �ƴϿ���)
            System.out.println("����� while�� ���ξ��� i="+i);
            i++;    // #3. ������(i�� ���� �������� �����Ű�� ���Ͽ�)
        }

        //do-while ��
        int j =0;   // #1. ��ȯ���� ������ �ֱ����� int j �ʱ�ȭ
        do{
            System.out.println("\n\t����� do�� ������ j="+j);
            j++;    // #2. ������(j�� ���� �������� �����Ű�� ���Ͽ�)
        }while(j<1);// #3. ����(boolean data type)

        System.out.println("\n============================================\n");

        //while ���� �̿��Ͽ� 5���� ����ϴ� ���α׷�
        int k =1;
        while(k<10){
            System.out.println("5*"+k+"="+5*k);
            k++;
        }

        //==> ���ѷ����� ���ѷ����Ĵ��� ���๮���� compile error ����...
 //       while(true){
 //           System.out.println("����� �ݺ����� ���� ����");
 //       }

        //==> �Ʒ��� �ּ��� Ǯ�� compile error�� �߻��Ѵ� ������...
        //System.out.println("error�� �߻��Ѵ� ������ ���ѷ������� �������� �ȵȴ�.");
    
    }// end of main

}// end of class
