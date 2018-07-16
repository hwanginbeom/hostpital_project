package view;

import java.util.Scanner;

import controller.Controller;
import model.Hospital_TotalDAO;

public class StartView {
	public static void main(String[] args)  {
		// 모든 검색
		Controller controller = Controller.getInstance();
		
		Scanner scan = new Scanner(System.in);
		int result = 10;
		
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
		
		System.out.println("*********** 로케이션 별 병원 전체 보기 **************");
		System.out.println();
		System.out.println();
		controller.getTotalAll();
		System.out.println("                   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("                   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		break;
		//검색 - id 로 검색
		case 2:
			System.out.println("*********** 로케이션 별 의료인력수 전체 보기 **************");
			System.out.println();
			System.out.println();
			System.out.println("                   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			controller.getPeopleAll();

			System.out.println("                   ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		

		break;

		case 3:

		// 로케이션 별 병원 검색 
		while(result!=0) {
		System.out.println("*** 로케이션 별 병원 검색을 하시겠습니까? 1(yes) / 0(no) ");
		result = scan.nextInt();
		int result2 = 10;
			if(result ==0 || result2==0) {
			break;
			}
			while(result2!=0) {
				System.out.println("*** "+ "찾고자 하는 병원을 고르시오 ");
				System.out.println("1)종합병원   2)병원   3)치과   4)한의원/한방병원   5)조산원   6)요양/노인전문병원   "
						+ "7)결핵병원   8)정신병원 ");
				result2 = scan.nextInt();


				switch (result2) {
			
			case 1:
			System.out.println("***종합병원의 수***");
					try {
						for( int i=0 ; i <=Hospital_TotalDAO.getAll().size() ; i++) {
						System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc()+"지역의"+" 종합병원의 수:"
						+Hospital_TotalDAO.getAll().get(i).getGnr_Hospital()+" 종합병원 병상 수 "
								+Hospital_TotalDAO.getAll().get(i).getGnr_Bed());
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			break;
				
			case 2:
				System.out.println("***병원의 수***");
				break;
				
			case 3:
				System.out.println("***치과의 수***");
				break;
				
			case 4:
				System.out.println("***한의원/한방병원의 수***");
				break;
				
			case 5:
				System.out.println("***조산원의 수***");
				break;
				
			case 6:
				System.out.println("***요양/노인전문병원의 수***");
				break;
				
			case 7:
				System.out.println("***결핵병원의 수***");
				break;
				
			case 8:
				System.out.println("***정신병원의 수***");
				break;
				
			case 0:
				System.out.println("*** 초기 메뉴로 이동***");
				break;



		
				
			}
		}
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
		}
		break;
		
		case 9:
			while(result!=0) {
				System.out.println("*** 데이터를 삭제 하시겠습니까? 1(yes) /0(no) ");
				result = scan.nextInt();
				if(result ==0) {
					break;
				}
			System.out.print("*** 삭제 할 년도를 입력하세요 : ");
			int resultyear = scan.nextInt();
			}
			break;

		
		case 0:
			System.out.println();
			System.out.println("*** 프로그램이 종료 되었습니다. ***");
			break;
		}
		
	}

}

// controller.getPeopleAll();
// insert - 실패
// controller.peopleInsert(new Hospital_PeopleDTO("꺄꺄울",1,2,3,4,5,6,7,8,9,10));

// 모든 검색
// controller.getPeopleAll();

// 하나만 검색 -성공
// controller.getPeople("강동구");

// delete - 성공
// controller.peopleDelete("강동구"); -성공
// controller.peopleDelete("송파구");
// controller.getPeopleAll();

// update -- 성공
// controller.peopleUpdate( "용산구",30);
// controller.getPeopleAll();

// controller.getTotalAll(); -성공
// controller.getTotal("용산구"); -성공
// controller.totalInsert(new
// Hospital_TotalDTO("꺄꺄꺄울",1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26));
// 실패 !
// controller.totalDelete("송파구"); --성공
// controller.getTotalAll();
// controller.totalUpdate( "용산구",30);

}
