package view;

import java.util.ArrayList;

import model.Hospital_PeopleDAO;
import model.domain.Hospital_PeopleDTO;


public class EndView {

	public static void printAll(ArrayList<Hospital_PeopleDTO> datas) {
//public static void printAll(ArrayList datas) {  //Ÿ�� ���� �����ִ� Object�� �޴´�.
		//for(Object dto : datas)
		//jdk1.5���� �߰��� �ݺ���
		for(Hospital_PeopleDAO dto : datas) { //datas �� �ִ��� Ȯ���ϰ� ������ dto�� �ְ� ��� ���ư���.
			System.out.println(dto.toString());
		}
	}

	public static void succMsg(String msg) {
		System.out.println("���� ����:" + msg);
	}

	public static void errorMsg(String msg) {
		System.out.println("������ ����:" + msg);

	}

	public static void printOne(Hospital_PeopleDTO hospital_PeopleDTO) {
		System.out.println(hospital_PeopleDTO);
	}
	

}
