public class Example1
{
	public static void main(String[] args) 
	{
		int a = Integer.parseInt(args[0]);
		String g;
///*
		if(0<= a && a<=100){

			if(a<60){
				System.out.println("�Է��Ͻ� �� "+a+"���� ���Դϴ�");
				return;
			}
			if(a<70){
				System.out.println("�Է��Ͻ� �� "+a+"���� ���Դϴ�");
				return;
			}
			if(a<80){
				System.out.println("�Է��Ͻ� �� "+a+"���� ���Դϴ�");
				return;
			}
			if(a<90){
				System.out.println("�Է��Ͻ� �� "+a+"���� ���Դϴ�");
				return;
			}
			System.out.println("�Է��Ͻ� �� "+a+"���� ���Դϴ�");

		} else {
			System.out.println("�߸� �Է��߽��ϴ�");
		}
//*/
/*
		if(args.length != 1){
			System.out.println("�ϳ��� �Է��� �ּ���");
			return;
		}
		if( 0 >a || 100<a){
			System.out.println("0~100���̰� �Է����ּ���");
			return;
		}
		switch(a/10){

			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:
				g = "��";
				break;
			case 6:
				g = "��";
				break;
			case 7:
				g = "��";
				break;
			case 8:
				g = "��";
				break;
			case 9:
			case 10:
			default:
				g = "��";
		}*/
		//System.out.println("�Է��Ͻ� �� "+a+"���� "+g+"�Դϴ�");
	}
}
