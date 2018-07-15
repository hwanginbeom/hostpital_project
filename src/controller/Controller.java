package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Hospital_PeopleDAO;
import model.domain.Hospital_PeopleDTO;
import view.EndView;

public class Controller {

	private static Controller instance = new Controller(); // �׷��� �̺κп� static�� ���ش�.

	public static Controller getInstance() { // static �����ؾ� ��ü �������� �޼ҵ������ �θ� ���ְ� ����Ÿ�Ե�
		return instance; // static ���¿��� �������ټ��ֵ�.
							// �ۿ����� ��ߵǱ� ������ public ���� ������ �Ѵ�.
	}

	private Controller() {
	}

	public void getDeptAll() {
		try {
			ArrayList<Hospital_PeopleDTO> datas = Hospital_PeopleDAO.getAll(); // ����
			if (datas.size() != 0) {
				EndView.printAll(datas);
			} else {
				EndView.succMsg("�˻��� �����Ͱ� �����ϴ�."); // ���������� �����Ͱ� ���� ���
			}
		} catch (Exception e) { // ������
			e.printStackTrace();
			EndView.errorMsg("�˼��մϴ� . ����Ŀ� �� ��û �ٶ��ϴ�.");
		}
	}
	// ��� �˻�
	/*
	 * �߻� ������ ����� �� 1. ���� ���� -�����Ͱ� �ִ� :EndView���� ArrayList ��ü ���� -�����Ͱ� ���� :
	 * EndView���� �˻��� ������ ����. 2.������ ���� -���� �߻� : �˼��մϴ�. ����Ŀ� �� ��û �ٶ��ϴ�...�޼���
	 */

	// insert
	/*
	 * �߻� ������ ����� �� 1. ���� ���� 1.true - ���� �Ϸ�, ���� ���� 2.false ( ��� ���� ���°�� ) - ���ܴ� �ƴ�����
	 * ������ ���߽��ϴ�. 2. ������ ���� -�̹� �����ϴ� deptno �� ������ �õ��� SQLException �߻� -�̹� �����ϴ�
	 * �޼���... -
	 */

	public void getDept(int deptno) {
		try {
			if (Hospital_PeopleDAO.getDept(deptno) != null) {
				EndView.printOne(Hospital_PeopleDAO.getDept(deptno));
			} else {
				EndView.errorMsg("�˻��� �����Ͱ� �����ϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�������� �ʴ� deptno�Դϴ�");

		}
	}

	public void insert(Hospital_PeopleDTO newDto) {
		try {
			if (Hospital_PeopleDAO.insert(newDto)) {
				EndView.succMsg("���ο� �μ� ���� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�̹� �����ϴ� deptno �Դϴ�");
		}
	}

	public void delete(int deptno) {
		try {
			if (Hospital_PeopleDAO.delete(deptno)) {
				EndView.succMsg("�μ� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�������� �ʴ� deptno�Դϴ�");
		}
	}

	public void update(int deptno, String newLoc) {
		try {
			if (Hospital_PeopleDAO.update(newLoc ,deptno) ) {
				EndView.succMsg("���� ���� �Ͽ����ϴ�.");
			} else {
				EndView.succMsg("�˻��� �����Ͱ� �����ϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�������� �ʴ� deptno�Դϴ�");

		}
	}



}
