//package jb02.part02;

/*
    1. for(�ʱ�ȭ:����; ��ȭ��)���� �̿�
    2. while(����)���� do-while(����)������
    ������ �� Ȱ��Ȯ��
*/

public class ForTest{
    
    // main method
    public static void main(String[] args) {
        
        int j = 5;
        System.out.println(j+"���� ����մϴ�.");

        //for ���� while ���� �޸� �ʱ�ȭ�� for�� ���ο��� �Ѵ�.
        for(int i=1; i<10; i++){
            System.out.println(j+"*"+i+"="+j*i);
        }
        
        //==> �ݺ��� for / while ���� ������ ����
        // int k=1;
        // while(k<10){
        //     System.out.println("5*"+k+"="+5*k);
        //     k++;
        // }

        // System.out.println("i�� �������� �� :"+i);
        // System.out.println("k�� �������� �� :"+k);
    
        //==> ���ѷ����� ���ѷ����Ĵ��� ���๮���� compile error�� �����ϸ� ...
//        for( ; ; ){
//            System.out.println("����� �ݺ��� ������ ���� ����");
//        }
        //==> �Ʒ��� �ּ��� Ǯ�� compile error�� �߻��Ѵ� ������...
        //System.out.println("error�� �߻��Ѵ�. ������ ���ѷ������� �������� �ȵȴ�.");
    
    }//end of main

}//end of class
