package view;

import controller.Controller;
import model.domain.Hospital_TotalDTO;

public class StartView {
	public static void main(String[] args) {
		// 모든 검색
		Controller controller = Controller.getInstance();

//		controller.getPeopleAll();
		// insert - 실패
//		 controller.peopleInsert(new Hospital_PeopleDTO("꺄꺄울",1,2,3,4,5,6,7,8,9,10));

		// 모든 검색
//		 controller.getPeopleAll();

		// 하나만 검색 -성공
//		 controller.getPeople("강동구");

		// delete - 성공
//		 controller.peopleDelete("강동구"); -성공
//		 controller.peopleDelete("송파구");
//		 controller.getPeopleAll(); 

//		 update --  성공
//		 controller.peopleUpdate( "용산구",30); 
//		 controller.getPeopleAll();
		 
		 
//		 controller.getTotalAll(); -성공
//		 controller.getTotal("용산구"); -성공
//		 controller.totalInsert(new Hospital_TotalDTO("꺄꺄울",1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26));
			//실패 !
//		 controller.totalDelete("송파구"); --성공
//		 controller.getTotalAll();
		 controller.totalUpdate( "용산구",30); 


	}
}
