package view;

import controller.Controller;
import model.domain.Hospital_PeopleDTO;

public class StartView {
	public static void main(String[] args) {
		// 모든 검색
		Controller controller = Controller.getInstance();

//		controller.getPeopleAll();
		// insert - 실패
		 controller.peopleInsert(new Hospital_PeopleDTO("꺄꺄울",1,2,3,4,5,6,7,8,9,10));

		// 모든 검색
//		 controller.getPeopleAll();

		// 하나만 검색 -성공
//		 controller.getPeople("강동구");

		// delete - 지워졌다고 뜨는데 출력에는 그대로 나온다.
//		 controller.peopleDelete("강동구");
//		 controller.peopleDelete("송파구");
		 controller.getPeopleAll();

//		 update -- 업데이트는 된다고 뜨는데 바뀌지가 않는다. DB측에서는 바뀜
//		 controller.peopleUpdate( "용산구",30);
//		 controller.getPeopleAll();

	}
}
