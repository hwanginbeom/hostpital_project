package view;

import java.util.ArrayList;

import model.Hospital_PeopleDAO;
import model.domain.Hospital_PeopleDTO;


public class EndView {

	public static void printAll(ArrayList<Hospital_PeopleDTO> datas) {
//public static void printAll(ArrayList datas) {  //타입 제일 위에있는 Object로 받는다.
		//for(Object dto : datas)
		//jdk1.5부터 추가된 반복문
		for(Hospital_PeopleDAO dto : datas) { //datas 가 있는지 확인하고 있으면 dto에 넣고 계속 돌아간다.
			System.out.println(dto.toString());
		}
	}

	public static void succMsg(String msg) {
		System.out.println("정상 실행:" + msg);
	}

	public static void errorMsg(String msg) {
		System.out.println("비정상 실행:" + msg);

	}

	public static void printOne(Hospital_PeopleDTO hospital_PeopleDTO) {
		System.out.println(hospital_PeopleDTO);
	}
	

}
