/*
    1. �б⹮ : switch ����
*/
public class SwitchTest {
    // main method
    public static void main(String[] args) {
        int inputData = Integer.parseInt(args[0]);

        // switch ���� ()������ ���� case �� ����� ������ case ������ ���๮�� ����
        // break ���� ���� �� ���� �����Ѵ�.

        // ==> switch(����) : ������ �ݵ�� �������ϰ�(byte,short,int,long,char.. 5EA)
        switch (inputData) {
            case 1:
            System.out.println("�Է��Ͻ� ���� 1�Դϴ�");
                break;
            case 2:
            System.out.println("�Է��Ͻ� ���� 2�Դϴ�");
                break;
            case 3:
            System.out.println("�Է��Ͻ� ���� 3�Դϴ�");
                break;
            case 4:
            System.out.println("�Է��Ͻ� ���� 4�Դϴ�");
                break;
            case 5:
            System.out.println("�Է��Ͻ� ���� 5�Դϴ�");
                break;
        
            default:
                System.out.println("case ���� �����(���ϻ���� ���� ���)");
                System.out.println("default ������� ..�Է��Ͻ� ����"+inputData+"�Դϴ�");
                break;
        }// end of switch
    
    }// end of main

}// end of class

/*
    case1 �� break�� �ּ�ó���ϰ� ������ ����..
    ������ �������� Ȯ������ ==> break�� ���� Ȯ��
*/