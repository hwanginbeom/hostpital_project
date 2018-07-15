package view;

import java.util.ArrayList;

import model.domain.Hospital_PeopleDTO;
import model.domain.Hospital_TotalDTO;


public class EndView {

	public static void peopleAll(ArrayList<Hospital_PeopleDTO> datas) {
//public static void printAll(ArrayList datas) {  //Ÿ�� ���� �����ִ� Object�� �޴´�.
		//for(Object dto : datas)
		//jdk1.5���� �߰��� �ݺ���
		for(Hospital_PeopleDTO dto : datas) { //datas �� �ִ��� Ȯ���ϰ� ������ dto�� �ְ� ��� ���ư���.
			System.out.println(dto.toString());
		}
	}
	
	public static void totalAll(ArrayList<Hospital_TotalDTO> datas) {
		//public static void printAll(ArrayList datas) {  //Ÿ�� ���� �����ִ� Object�� �޴´�.
				//for(Object dto : datas)
				//jdk1.5���� �߰��� �ݺ���
				for(Hospital_TotalDTO dto : datas) { //datas �� �ִ��� Ȯ���ϰ� ������ dto�� �ְ� ��� ���ư���.
					System.out.println(dto.toString());
				}
			}


	public static void succMsg(String msg) {
		System.out.println("���� ����:" + msg);
	}

	public static void errorMsg(String msg) {
		System.out.println("������ ����:" + msg);

	}

	public static void printPeople(Hospital_PeopleDTO hospital_PeopleDTO) {
		System.out.println(hospital_PeopleDTO);
	}
	
	public static void printTotal(Hospital_TotalDTO hospital_TotalDTO) {
		System.out.println(hospital_TotalDTO);
	}
	

}
