package view;

import controller.Controller;
import model.domain.Hospital_PeopleDTO;

public class StartView {
	public static void main(String[] args) {
		// ��� �˻�
		Controller controller = Controller.getInstance();

//		controller.getPeopleAll();
		// insert - ����
		 controller.peopleInsert(new Hospital_PeopleDTO("������",1,2,3,4,5,6,7,8,9,10));

		// ��� �˻�
//		 controller.getPeopleAll();

		// �ϳ��� �˻� -����
//		 controller.getPeople("������");

		// delete - �������ٰ� �ߴµ� ��¿��� �״�� ���´�.
//		 controller.peopleDelete("������");
//		 controller.peopleDelete("���ı�");
		 controller.getPeopleAll();

//		 update -- ������Ʈ�� �ȴٰ� �ߴµ� �ٲ����� �ʴ´�. DB�������� �ٲ�
//		 controller.peopleUpdate( "��걸",30);
//		 controller.getPeopleAll();

	}
}
