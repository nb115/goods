package itcast;
import java.util.ArrayList;
import java.util.Scanner;

public class expression {

	public static void main(String[] args) {
		//����ArrayList����,�洢��Ʒ����,�洢��������FruitItem����
		ArrayList<FruitItem> array = new ArrayList<FruitItem>();
		//������Ʒ��ʼ������,���ݼ���
		init(array);
		while(true){
			//���ò˵�����
			mainMenu();
			//�����û�ѡ����ŷ���
			int choose = chooseFunction();
			switch (choose) {
			case 1:
				//����1: ���� �嵥
				showFruitList(array);
			break;
			
			case 2:
				//2: ��ӻ���
				addFruit(array);
			break;
			
			case 3:
				//3: ɾ������
				deleteFruit(array);
			break;
			
			case 4:
				//4: �޸Ļ���
				updateFruit(array);
			break;
			
			case 5:
				return ;

			default:
				System.out.println("��������û��");
				break;
			}
		}
	}

	
	
	
	
	
	public static void updateFruit(ArrayList<FruitItem> array){
		System.out.println("ѡ������޸Ĺ���");
		System.out.println("��������Ʒ�ı��");
		
		Scanner sc = new Scanner(System.in);
		int ID = sc.nextInt();
		//��������,��ȡÿ��FruitItem����
		for(int i = 0 ; i < array.size(); i++){
			FruitItem item = array.get(i);
			//��ȡFruitItem������ID,���û������ID�Ƚ�
			if(item.ID == ID){
				System.out.println("�����µ���Ʒ���");
				item.ID = sc.nextInt();
				
				System.out.println("�����µ���Ʒ����");
				item.name = sc.next();
				
				System.out.println("�����µ���Ʒ�۸�");
				item.price = sc.nextDouble();
				System.out.println("��Ʒ�޸ĳɹ�");
				return ;
			}
		}
		System.out.println("����ı�Ų�����");
	}
	
	
	public static void deleteFruit(ArrayList<FruitItem> array){
		System.out.println("ѡ�����ɾ������");
		System.out.println("��������Ʒ�ı��");
		Scanner sc = new Scanner(System.in);
		
		int ID = sc.nextInt();
		//��������
		for(int i = 0 ; i < array.size(); i++){
			//��ȡ��ÿ��FruitItem����
			FruitItem item = array.get(i);
			//����,��������ID,���û�����ı�űȽ�
			if( item.ID == ID){
				//�Ƴ������е�Ԫ��
				//���ϵķ���removeʵ��
				array.remove(i);
				System.out.println("ɾ���ɹ�");
				return;
			}
		}
		System.out.println("������ı�Ų�����");
	}
	
	
	
	public static void addFruit(ArrayList<FruitItem> array){
		System.out.println("ѡ����������Ʒ����");
		//����Scanner����
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ʒ�ı��");
		//������Ʒ�ı��
		int ID = sc.nextInt();
		//������Ʒ������
		System.out.println("��������Ʒ������");
		String name = sc.next();
		//������Ʒ�ĵ���
		System.out.println("������Ʒ�ĵ���");
		double price = sc.nextDouble();
		//����FruitItem����
		FruitItem item = new FruitItem();
		//item.���Ը�ֵ
		item.ID = ID;
		item.name = name;
		item.price = price;
		array.add(item);
		System.out.println("��Ʒ��ӳɹ�");
	}
	
	
	public static void showFruitList(ArrayList<FruitItem> array){
		System.out.println();
		System.out.println("================��Ʒ����嵥================");
		System.out.println("��Ʒ���         ��Ʒ����                ��Ʒ����");
		//��������
		for(int i = 0 ; i < array.size(); i++){
			//����get����,��ȡ��ÿ��FruitItem����,����ʹ��FruitItem����get���
			FruitItem item = array.get(i);
			//����item������������
			System.out.println(item.ID+"   "+item.name+"        "+item.price);
		}
	}
	
	
	public static int chooseFunction(){
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	
	
	
	public static void mainMenu(){
		System.out.println();
        System.out.println("============��ӭ����ItCast����============");
        System.out.println("1: ���� �嵥   2: ��ӻ���   3: ɾ������   4: �޸Ļ���  5: �˳�");
        System.out.println("��������Ҫ�����Ĺ������");
	}
	
	
	
	
	
	public static void init(ArrayList<FruitItem> array){
		//���������FruitItem����,�������Ը�ֵ
		FruitItem f1 = new FruitItem();
		f1.ID = 9527;
		f1.name = "�������ֱ�����";
		f1.price = 12.7;
		
		FruitItem f2 = new FruitItem();
		f2.ID = 9008;
		f2.name = "�п�����ĵ����";
		f2.price = 5.6;
		
		FruitItem f3 = new FruitItem();
		f3.ID = 9879;
		f3.name = "�½�ԭ�����ܹ�";
		f3.price = 599.6;
		
		//������3��FruitItem���ͱ���,�洢��������
		array.add(f1);
		array.add(f2);
		array.add(f3);
	}
	
	
	
	
	
	
	
	
	
	
}

































