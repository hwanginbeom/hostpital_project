package view;

import java.util.Scanner;

import controller.Controller;

public class StartView {
	public static void main(String[] args) {
		// ��� �˻�
		Controller controller = Controller.getInstance();
		
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int addyear = 2045;
		
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
		
		System.out.println("*** �����̼� �� ���� ��ü ���� ***");
		System.out.println();
		System.out.println();

		System.out.println("*** peopleList ������  ***");
		System.out.println("                   �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

		PeopleController.all();
		System.out.println("                   �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

		System.out.println();
		System.out.println();


		

		System.out.println("*** peopleFare ������  ***");
		System.out.println("                           �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		PeopleController.allFare();
		System.out.println("                           �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

		
		break;
		//�˻� - id �� �˻�
		case 2:
		while(result!=0) {
			System.out.println("*** ������ �˻� �Ͻðڽ��ϱ�? 1(yes) /0(no) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.print("*** ������ �Է��ϼ��� :  ");
		result = scan.nextInt();
//		PeopleController.getpeople(2020);
		PeopleController.getFare(result);
		
		}

		break;

		case 3:

//		//����
//		PeopleDTO newOne = new PeopleDTO(2100,2020200,303,3030303,4040,1010101,40404,10101010);
//		PeopleController.addpeople(newOne);
//		PeopleController.all();
		while(result!=0) {
		System.out.println("*** �����͸� �߰� �Ͻðڽ��ϱ�? 1(yes) /0(no) ");
		result = scan.nextInt();
		if(result ==0) {
			break;
		}

		System.out.println("*** "+ addyear +"�⵵ ���� ���� ������ �߰� ���� �������� ");
		System.out.print("���� ���� 100���� �� �� ���� : ");
		long result100 = scan.nextInt();

		System.out.print("���� ���� 80���� �� �� ���� : ");
		long result80 = scan.nextInt();

		System.out.print("���� ���� 50���� �� �� ���� : ");
		long result50 = scan.nextInt();

		System.out.print("���� ���� 30���� �� �� ���� : ");
		long result30 = scan.nextInt();

		FareDTO newOne = new FareDTO(addyear,result100,result80,result50,result30);
		addyear++;
		PeopleController.addFare(newOne);
		PeopleController.allFare();

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
				
		System.out.print("*** ���� �� ������ �Է��ϼ��� : ");
		int resultyear = scan.nextInt();
		
		System.out.print("���� ���� 100���� �� �� ���� : ");
		double result100 = scan.nextInt();

		System.out.print("���� ���� 80���� �� �� ���� : ");
		double result80 = scan.nextInt();

		System.out.print("���� ���� 50���� �� �� ���� : ");
		double result50 = scan.nextInt();

		System.out.print("���� ���� 30���� �� �� ���� : ");
		double result30 = scan.nextInt();
		
		FareDTO newOne2 = new FareDTO(resultyear,result100,result80,result50,result30);
		PeopleController.fareUpdate(resultyear, newOne2);
		PeopleController.getFare(resultyear);
		
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
		PeopleController.fareDelete(resultyear);
		PeopleController.allFare();
		}
		break;

		
		case 6:
			System.out.println();
			System.out.println("*** ���α׷��� ���� �Ǿ����ϴ�. ***");
			break;
		}
		
	}

}

//		controller.getPeopleAll();
		// insert - ����
//		 controller.peopleInsert(new Hospital_PeopleDTO("������",1,2,3,4,5,6,7,8,9,10));

		// ��� �˻�
//		 controller.getPeopleAll();

		// �ϳ��� �˻� -����
//		 controller.getPeople("������");

		// delete - ����
//		 controller.peopleDelete("������"); -����
//		 controller.peopleDelete("���ı�");
//		 controller.getPeopleAll(); 

//		 update --  ����
//		 controller.peopleUpdate( "��걸",30); 
//		 controller.getPeopleAll();
		 
		 
//		 controller.getTotalAll(); -����
//		 controller.getTotal("��걸"); -����
//		 controller.totalInsert(new Hospital_TotalDTO("��������",1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26));
			//���� !
//		 controller.totalDelete("���ı�"); --����
//		 controller.getTotalAll();
//		 controller.totalUpdate( "��걸",30); 


	}
}
