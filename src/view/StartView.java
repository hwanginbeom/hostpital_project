package view;

import java.util.Scanner;

import controller.Controller;

public class StartView {
	public static void main(String[] args) {
		// 모든 검색
		Controller controller = Controller.getInstance();
		
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int addyear = 2045;
		
		while( result != 0) {
		System.out.println("***********메뉴***********");
		System.out.println("  1 - 로케이션 별 병원 전체 보기");
		System.out.println("  2 - 로케이션 별 의료인력수 전체 보기  ");
		System.out.println("  3 - 로케이션 별 병원 검색 ");
		System.out.println("  4 - 로케이션 별 의료인력 수 검색");
		System.out.println("  5 - 로케이션 별 병원 및 의료인력 수 검색 ");
		System.out.println("  9 - 관리자 모드 ");
		System.out.println("  0 - 프로그램을 종료 하기");
		System.out.println();
		System.out.print(" 메뉴를 선택하세요 :  ");

		result = scan.nextInt();
		switch (result) {

		case 1: 
		
		System.out.println("*** 로케이션 별 병원 전체 보기 ***");
		System.out.println();
		System.out.println();

		System.out.println("*** peopleList 데이터  ***");
		System.out.println("                   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		PeopleController.all();
		System.out.println("                   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		System.out.println();
		System.out.println();


		

		System.out.println("*** peopleFare 데이터  ***");
		System.out.println("                           ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		PeopleController.allFare();
		System.out.println("                           ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		
		break;
		//검색 - id 로 검색
		case 2:
		while(result!=0) {
			System.out.println("*** 연도를 검색 하시겠습니까? 1(yes) /0(no) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.print("*** 연도를 입력하세요 :  ");
		result = scan.nextInt();
//		PeopleController.getpeople(2020);
		PeopleController.getFare(result);
		
		}

		break;

		case 3:

//		//가입
//		PeopleDTO newOne = new PeopleDTO(2100,2020200,303,3030303,4040,1010101,40404,10101010);
//		PeopleController.addpeople(newOne);
//		PeopleController.all();
		while(result!=0) {
		System.out.println("*** 데이터를 추가 하시겠습니까? 1(yes) /0(no) ");
		result = scan.nextInt();
		if(result ==0) {
			break;
		}

		System.out.println("*** "+ addyear +"년도 세금 관련 데이터 추가 값을 넣으세요 ");
		System.out.print("할인 운임 100프로 일 때 수익 : ");
		long result100 = scan.nextInt();

		System.out.print("할인 운임 80프로 일 때 수익 : ");
		long result80 = scan.nextInt();

		System.out.print("할인 운임 50프로 일 때 수익 : ");
		long result50 = scan.nextInt();

		System.out.print("할인 운임 30프로 일 때 수익 : ");
		long result30 = scan.nextInt();

		FareDTO newOne = new FareDTO(addyear,result100,result80,result50,result30);
		addyear++;
		PeopleController.addFare(newOne);
		PeopleController.allFare();

		}

		break;

//
////
////		//수정 - 존재하는 데이터 수정 가능 , 미 존재하는 데이터 수정 시 불가 
////		/*id로 등급을 수정 
////		 * 단 , 정상 수정 ?  비 정상 수정여부에 대한 상황은 반드시 확인 가능해야함 
//////		 */
////		
//		System.out.println("***yea로 검색 ***");
//		PeopleDTO newOne3 = new PeopleDTO(21030,2020200,303,3030303,4040,1010101,40404,10101010);
//
//		PeopleController.peopleUpdate(2100, newOne3);
//		PeopleController.all();
		
		case 4:
			
		while(result!=0) {
			System.out.println("*** 데이터를 수정 하시겠습니까? 1(yes) /0(no) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
				
		System.out.print("*** 수정 할 연도를 입력하세요 : ");
		int resultyear = scan.nextInt();
		
		System.out.print("할인 운임 100프로 일 때 수익 : ");
		double result100 = scan.nextInt();

		System.out.print("할인 운임 80프로 일 때 수익 : ");
		double result80 = scan.nextInt();

		System.out.print("할인 운임 50프로 일 때 수익 : ");
		double result50 = scan.nextInt();

		System.out.print("할인 운임 30프로 일 때 수익 : ");
		double result30 = scan.nextInt();
		
		FareDTO newOne2 = new FareDTO(resultyear,result100,result80,result50,result30);
		PeopleController.fareUpdate(resultyear, newOne2);
		PeopleController.getFare(resultyear);
		
			}

		break;

		
////
////		
////		//삭제 -  존재하는 데이터 삭제,  미 존재하는 데이터 삭제시도?
//		System.out.println("*** 삭제 ***");
//		PeopleController.peopleDelete(21030);
//		PeopleController.all();
//

		case 5:
		while(result!=0) {
			System.out.println("*** 데이터를 삭제 하시겠습니까? 1(yes) /0(no) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
		System.out.print("*** 삭제 할 년도를 입력하세요 : ");
		int resultyear = scan.nextInt();
		PeopleController.fareDelete(resultyear);
		PeopleController.allFare();
		}
		break;

		
		case 6:
			System.out.println();
			System.out.println("*** 프로그램이 종료 되었습니다. ***");
			break;
		}
		
	}

}

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
//		 controller.totalInsert(new Hospital_TotalDTO("꺄꺄꺄울",1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26));
			//실패 !
//		 controller.totalDelete("송파구"); --성공
//		 controller.getTotalAll();
//		 controller.totalUpdate( "용산구",30); 


	}
}
