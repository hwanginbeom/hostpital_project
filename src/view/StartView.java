package view;

import java.util.Scanner;

import controller.Controller;
import model.Hospital_TotalDAO;

public class StartView {
	public static void main(String[] args)  {
		// ��� �˻�
		Controller controller = Controller.getInstance();
		
		Scanner scan = new Scanner(System.in);
		int result = 10;
		
		while( result != 0) {
		System.out.println("***********�޴�***********");
		System.out.println("  1 - �����̼� �� ���� ��ü ����");
		System.out.println("  2 - �����̼� �� �Ƿ��η¼� ��ü ����  ");
		System.out.println("  3 - �����̼� �� ���� �˻� ");
		System.out.println("  4 - �����̼� �� �Ƿ��η� �� �˻�");
		System.out.println("  5 - �����̼� �� ���� �� �Ƿ��η� �� �˻� ");
		System.out.println("  9 - ������ ��� ");
		System.out.println("  0 - ���α׷��� ���� �ϱ�");
		System.out.println();
		System.out.print(" �޴��� �����ϼ��� :  ");

		result = scan.nextInt();
		switch (result) {

		case 1: 
		
		System.out.println("*********** �����̼� �� ���� ��ü ���� **************");
		System.out.println();
		System.out.println();
		controller.getTotalAll();
		System.out.println("                   �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		System.out.println("                   �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

		break;
		//�˻� - id �� �˻�
		case 2:
			System.out.println("*********** �����̼� �� �Ƿ��η¼� ��ü ���� **************");
			System.out.println();
			System.out.println();
			System.out.println("                   �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			controller.getPeopleAll();

			System.out.println("                   �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

		

		break;

		case 3:

		// �����̼� �� ���� �˻� 
		while(result!=0) {
		System.out.println("*** �����̼� �� ���� �˻��� �Ͻðڽ��ϱ�? 1(yes) / 0(no) ");
		result = scan.nextInt();
		int result2 = 10;
			if(result ==0 || result2==0) {
			break;
			}
			while(result2!=0) {
				System.out.println("*** "+ "ã���� �ϴ� ������ ���ÿ� ");
				System.out.println("1)���պ���   2)����   3)ġ��   4)���ǿ�/�ѹ溴��   5)�����   6)���/������������   "
						+ "7)���ٺ���   8)���ź��� ");
				result2 = scan.nextInt();


				switch (result2) {
			
			case 1:
			System.out.println("***���պ����� ��***");
					try {
						for( int i=0 ; i <=Hospital_TotalDAO.getAll().size() ; i++) {
						System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc()+"������"+" ���պ����� ��:"
						+Hospital_TotalDAO.getAll().get(i).getGnr_Hospital()+" ���պ��� ���� �� "
								+Hospital_TotalDAO.getAll().get(i).getGnr_Bed());
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			break;
				
			case 2:
				System.out.println("***������ ��***");
				break;
				
			case 3:
				System.out.println("***ġ���� ��***");
				break;
				
			case 4:
				System.out.println("***���ǿ�/�ѹ溴���� ��***");
				break;
				
			case 5:
				System.out.println("***������� ��***");
				break;
				
			case 6:
				System.out.println("***���/�������������� ��***");
				break;
				
			case 7:
				System.out.println("***���ٺ����� ��***");
				break;
				
			case 8:
				System.out.println("***���ź����� ��***");
				break;
				
			case 0:
				System.out.println("*** �ʱ� �޴��� �̵�***");
				break;



		
				
			}
		}
		}
		

		break;

//
////
////		//���� - �����ϴ� ������ ���� ���� , �� �����ϴ� ������ ���� �� �Ұ� 
////		/*id�� ����� ���� 
////		 * �� , ���� ���� ?  �� ���� �������ο� ���� ��Ȳ�� �ݵ�� Ȯ�� �����ؾ��� 
//////		 */
////		
//		System.out.println("***yea�� �˻� ***");
//		PeopleDTO newOne3 = new PeopleDTO(21030,2020200,303,3030303,4040,1010101,40404,10101010);
//
//		PeopleController.peopleUpdate(2100, newOne3);
//		PeopleController.all();
		
		case 4:
			
		while(result!=0) {
			System.out.println("*** �����͸� ���� �Ͻðڽ��ϱ�? 1(yes) /0(no) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		
		
			}

		break;

		
////
////		
////		//���� -  �����ϴ� ������ ����,  �� �����ϴ� ������ �����õ�?
//		System.out.println("*** ���� ***");
//		PeopleController.peopleDelete(21030);
//		PeopleController.all();
//

		case 5:
		while(result!=0) {
			System.out.println("*** �����͸� ���� �Ͻðڽ��ϱ�? 1(yes) /0(no) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.print("*** ���� �� �⵵�� �Է��ϼ��� : ");
		int resultyear = scan.nextInt();
		}
		break;
		
		case 9:
			while(result!=0) {
				System.out.println("*** �����͸� ���� �Ͻðڽ��ϱ�? 1(yes) /0(no) ");
				result = scan.nextInt();
				if(result ==0) {
					break;
				}
			System.out.print("*** ���� �� �⵵�� �Է��ϼ��� : ");
			int resultyear = scan.nextInt();
			}
			break;

		
		case 0:
			System.out.println();
			System.out.println("*** ���α׷��� ���� �Ǿ����ϴ�. ***");
			break;
		}
		
	}

}

// controller.getPeopleAll();
// insert - ����
// controller.peopleInsert(new Hospital_PeopleDTO("������",1,2,3,4,5,6,7,8,9,10));

// ��� �˻�
// controller.getPeopleAll();

// �ϳ��� �˻� -����
// controller.getPeople("������");

// delete - ����
// controller.peopleDelete("������"); -����
// controller.peopleDelete("���ı�");
// controller.getPeopleAll();

// update -- ����
// controller.peopleUpdate( "��걸",30);
// controller.getPeopleAll();

// controller.getTotalAll(); -����
// controller.getTotal("��걸"); -����
// controller.totalInsert(new
// Hospital_TotalDTO("��������",1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26));
// ���� !
// controller.totalDelete("���ı�"); --����
// controller.getTotalAll();
// controller.totalUpdate( "��걸",30);

}
