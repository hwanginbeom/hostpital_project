package view;

import controller.Controller;
import model.domain.Hospital_TotalDTO;

public class StartView {
	public static void main(String[] args) {
		// ��� �˻�
		Controller controller = Controller.getInstance();

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
//		 controller.totalInsert(new Hospital_TotalDTO("������",1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26));
			//���� !
//		 controller.totalDelete("���ı�"); --����
//		 controller.getTotalAll();
		 controller.totalUpdate( "��걸",30); 


	}
}
