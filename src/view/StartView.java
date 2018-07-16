package view;

import java.util.Scanner;

import controller.Controller;
import model.Hospital_PeopleDAO;
import model.Hospital_TotalDAO;

public class StartView {
	public static void main(String[] args)  {
		// 모든 검색
		Controller controller = Controller.getInstance();
		
		Scanner scan = new Scanner(System.in);
		int result = 100;
		String resultLoc=null;

		
		while( result != 10) {
		System.out.println("***********메뉴***********");
		System.out.println("  1 - 지역 별 병원 전체 보기");
		System.out.println("  2 - 지역 별 의료인력수 전체 보기  ");
		System.out.println("  3 - 지역 별 병원 검색 ");
		System.out.println("  4 - 지역 별 의료인력 수 검색");
		System.out.println("  5 - 지역 별 병원 및 의료인력 수 검색 ");
		System.out.println("  9 - 관리자 모드 ");
		System.out.println("  10 - 프로그램을 종료 하기");
		System.out.println();
		System.out.print(" 메뉴를 선택하세요 :  ");

		result = scan.nextInt();
		switch (result) {

		case 1: 
		
		System.out.println("*********** 로케이션 별 병원 전체 보기 **************");
		System.out.println();
		System.out.println();
		System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		controller.getTotalAll();
		System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		break;
		//검색 - id 로 검색
		case 2:
			System.out.println("*********** 로케이션 별 의료인력수 전체 보기 **************");
			System.out.println();
			System.out.println();
			System.out.println(" ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			controller.getPeopleAll();
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		

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
						+ "7)결핵병원   8)정신병원   0)뒤로 돌아가기");
				result2 = scan.nextInt();
				
				


				switch (result2) {
			
			case 1:
			System.out.println("***종합병원의 수***");
					try {
						for( int i=0 ; i <Hospital_TotalDAO.getAll().size() ; i++) {
						System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc()+"지역의"+" 종합병원의 수:"
						+Hospital_TotalDAO.getAll().get(i).getGnr_Hospital()+" | 종합병원 병상 수 :"
								+Hospital_TotalDAO.getAll().get(i).getGnr_Bed());
						Thread.sleep(300);
						}
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			break;
				
			case 2:
				System.out.println("***병원의 수***");
				try {
					for( int i=0 ; i <Hospital_TotalDAO.getAll().size() ; i++) {
					System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc()+"지역의"+" 병원의 수:"
					+Hospital_TotalDAO.getAll().get(i).getHospital()+" |병원 병상 수: "
							+Hospital_TotalDAO.getAll().get(i).getH_Bed());
					Thread.sleep(300);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 3:
				System.out.println("***치과의 수***");
				try {
					for( int i=0 ; i <Hospital_TotalDAO.getAll().size() ; i++) {
					System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc()+"지역의"+" 치과의 수:"
					+Hospital_TotalDAO.getAll().get(i).getDent_Hospital()+" | 치과 병상 수: "+
							+Hospital_TotalDAO.getAll().get(i).getDent_Bed()+" | 치과의원 수"+Hospital_TotalDAO.getAll().get(i).getDent_Clinic_Hospital()
							+" | 치과의원 병상 수" + Hospital_TotalDAO.getAll().get(i).getDent_Clinic_Bed());
					Thread.sleep(300);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 4:
				System.out.println("***한의원/한방병원의 수***");
				try {
					for( int i=0 ; i <Hospital_TotalDAO.getAll().size() ; i++) {
					System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc()+"지역의"+" 한의원의 수:"
					+Hospital_TotalDAO.getAll().get(i).getHerb_Hospital()+" | 한의원 병상 수: "+
							+Hospital_TotalDAO.getAll().get(i).getHerb_Bed()+" | 치과의원 수"
					+Hospital_TotalDAO.getAll().get(i).getHerb_Clinic_Hospital()
							+" | 치과의원 병상 수" + Hospital_TotalDAO.getAll().get(i).getHerb_Clinic_Bed());
					Thread.sleep(300);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 5:
				System.out.println("***조산원의 수***");
				try {
					for( int i=0 ; i <Hospital_TotalDAO.getAll().size() ; i++) {
					System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc()+"지역의"+" 조산원의 수:"
					+Hospital_TotalDAO.getAll().get(i).getMaternity_Hospital()+" | 조산원 병상 수 :"
							+Hospital_TotalDAO.getAll().get(i).getMaternity_Bed());
					Thread.sleep(300);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 6:
				System.out.println("***요양/노인전문병원의 수***");	try {
					for( int i=0 ; i <Hospital_TotalDAO.getAll().size() ; i++) {
					System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc()+"지역의"+" 요양 병원의 수:"
					+Hospital_TotalDAO.getAll().get(i).getSnr_Hospital()+" | 요양 병원의 병상 수: "+
							+Hospital_TotalDAO.getAll().get(i).getSnr_Bed()+" | 노인 병원의 수"+Hospital_TotalDAO.getAll().get(i).getAff_Hospital()
							+" | 노인병원의 병상 수" + Hospital_TotalDAO.getAll().get(i).getAff_Bed());
					Thread.sleep(300);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 7:
				System.out.println("***결핵병원의 수***");
				try {
					for( int i=0 ; i <Hospital_TotalDAO.getAll().size() ; i++) {
					System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc()+"지역의"+" 결핵병원의 수:"
					+Hospital_TotalDAO.getAll().get(i).getTub_Hospital()+" | 결핵병원 병상 수 :"
							+Hospital_TotalDAO.getAll().get(i).getTub_Bed());
					Thread.sleep(300);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case 8:
				System.out.println("***정신병원의 수***");
				try {
					for( int i=0 ; i <Hospital_TotalDAO.getAll().size() ; i++) {
					System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc()+"지역의"+" 정신병원의 수:"
					+Hospital_TotalDAO.getAll().get(i).getMental_hospital()+" | 정신병원 병상 수 :"
							+Hospital_TotalDAO.getAll().get(i).getMental_Bed());
					Thread.sleep(300);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
			System.out.println("*** 로케이션 별 의료인력을 보시겠습니까? 1(yes) /0(no) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
			try {
				for(int i=0; i<Hospital_PeopleDAO.getAll().size() ;i++ ) {
				System.out.println((i+1)+" "+Hospital_PeopleDAO.getAll().get(i).getLoc());
				}
				while(result!=0) {
					System.out.print("*** 보고 싶은  지역의 숫자를 입력 하세요(0은 종료) :  ");
					result = scan.nextInt();
					if(result==0) {
						break;
					}
					try {
						System.out.println(Hospital_PeopleDAO.getAll().get(result-1));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
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
			System.out.println("*** 지역 별 병원 및 의료인력 수 검색을 하시겠습니까? 1(yes) /0(no) ");
			result = scan.nextInt();
			if(result ==0) {
				break;
			}
			else if(result ==1) {
				try {
					for(int i=0; i<Hospital_PeopleDAO.getAll().size() ;i++ ) {
					System.out.println((i+1)+" "+Hospital_PeopleDAO.getAll().get(i).getLoc());
					}
					while(result!=0) {
						System.out.print("*** 보고 싶은  지역의 숫자를 입력 하세요(0은 종료) :  ");
						result = scan.nextInt();
						if(result==0) {
							break;
						}
						try {
							System.out.println(Hospital_PeopleDAO.getAll().get(result-1));
							System.out.println(Hospital_TotalDAO.getAll().get(result-1));

						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

						}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			}
		else {
		System.out.println("잘못 된 입력 입니다. 다시 입력하세요.");
		}
			
		}
		break;
		
		case 9:
			while(result!=0) {
				System.out.println("*** 관리자 모드 ");
				int password = 1541;
				int inputPassword =100;
				int count = 0;
				while(count <4) {
				System.out.print("비밀번호를 입력하세요 :");
				inputPassword = scan.nextInt();
				if(password == inputPassword) {
					System.out.println("***********관리자 메뉴***********");
					System.out.println("  1 - 모두 검색하기");
					System.out.println("  2 - 데이터 추가하기  ");
					System.out.println("  3 - 수정하기 ");
					System.out.println("  4 - 삭제하기");
					System.out.println("  0 - 기본 메뉴로 돌아가기 ");					}
				
				
				
				else {
					count++;
					System.out.println("패스워드가 틀렸습니다. 다시 입력해주세요.");
					System.out.println("3번 틀릴시 프로그램은 종료 됩니다. 현재 : "+count);
					System.out.println();
					if(count ==3) {
						System.out.println();
						System.out.println();
						System.out.println();
						System.out.println("비 정상적인 접근으로 인해 프로그램이 종료 되었습니다.");
						System.exit(0);
					}

					}
				}
				
				}

		break;
		case 10:
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
