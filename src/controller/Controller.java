package controller;

import java.sql.SQLException;
import java.util.ArrayList;

import model.Hospital_PeopleDAO;
import model.Hospital_TotalDAO;
import model.domain.Hospital_PeopleDTO;
import model.domain.Hospital_TotalDTO;
import view.EndView;

public class Controller {

	private static Controller instance = new Controller(); // �׷��� �̺κп� static�� ���ش�.

	public static Controller getInstance() { // static �����ؾ� ��ü �������� �޼ҵ������ �θ� ���ְ� ����Ÿ�Ե�
		return instance; // static ���¿��� �������ټ��ֵ�.
							// �ۿ����� ��ߵǱ� ������ public ���� ������ �Ѵ�.
	}

	private Controller() {
	}

	// ��� �˻�
	/*
	 * �߻� ������ ����� �� 1. ���� ���� -�����Ͱ� �ִ� :EndView���� ArrayList ��ü ���� -�����Ͱ� ���� :
	 * EndView���� �˻��� ������ ����. 2.������ ���� -���� �߻� : �˼��մϴ�. ����Ŀ� �� ��û �ٶ��ϴ�...�޼���
	 */
	
	public void getPeopleAll() {
		try {
			ArrayList<Hospital_PeopleDTO> datas = Hospital_PeopleDAO.getAll(); // ����
			if (datas.size() != 0) {
				EndView.peopleAll(datas);
			} else {
				EndView.succMsg("�˻��� �����Ͱ� �����ϴ�."); // ���������� �����Ͱ� ���� ���
			}
		} catch (Exception e) { // ������
			e.printStackTrace();
			EndView.errorMsg("�˼��մϴ� . ����Ŀ� �� ��û �ٶ��ϴ�.");
		}
	}

	// insert
	/*
	 * �߻� ������ ����� �� 1. ���� ���� 1.true - ���� �Ϸ�, ���� ���� 2.false ( ��� ���� ���°�� ) - ���ܴ� �ƴ�����
	 * ������ ���߽��ϴ�. 2. ������ ���� -�̹� �����ϴ� deptno �� ������ �õ��� SQLException �߻� -�̹� �����ϴ�
	 * �޼���... -
	 */

	public void getPeople(String String) {
		try {
			if (Hospital_PeopleDAO.getPeople(String) != null) {
				EndView.printPeople(Hospital_PeopleDAO.getPeople(String));
			} else {
				EndView.errorMsg("�˻��� �����Ͱ� �����ϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�������� �ʴ� deptno�Դϴ�");

		}
	}

	public void peopleInsert(Hospital_PeopleDTO newDto) {
		try {
			if (Hospital_PeopleDAO.peopleInsert(newDto)) {
				EndView.succMsg("���ο� �μ� ���� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�̹� �����ϴ� deptno �Դϴ�");
		}
	}

	public void peopleDelete(String loc) {
		try {
			if (Hospital_PeopleDAO.peopleDelete(loc)) {
				EndView.succMsg("�μ� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�������� �ʴ� deptno�Դϴ�");
		}
	}

	public void peopleUpdate(String loc, int hospital) {
		try {
			if (Hospital_PeopleDAO.peopleUpdate(loc ,hospital) ) {
				EndView.succMsg("���� ���� �Ͽ����ϴ�.");
			} else {
				EndView.succMsg("�˻��� �����Ͱ� �����ϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�������� �ʴ� deptno�Դϴ�");

		}
	}

	
	
	// Total******************************
	public void getTotalAll() {
		try {
			ArrayList<Hospital_TotalDTO> datas = Hospital_TotalDAO.getAll(); // ����
			if (datas.size() != 0) {
				EndView.totalAll(datas);
			} else {
				EndView.succMsg("�˻��� �����Ͱ� �����ϴ�."); // ���������� �����Ͱ� ���� ���
			}
		} catch (Exception e) { // ������
			e.printStackTrace();
			EndView.errorMsg("�˼��մϴ� . ����Ŀ� �� ��û �ٶ��ϴ�.");
		}
	}

	// insert
	/*
	 * �߻� ������ ����� �� 1. ���� ���� 1.true - ���� �Ϸ�, ���� ���� 2.false ( ��� ���� ���°�� ) - ���ܴ� �ƴ�����
	 * ������ ���߽��ϴ�. 2. ������ ���� -�̹� �����ϴ� deptno �� ������ �õ��� SQLException �߻� -�̹� �����ϴ�
	 * �޼���... -
	 */

	public void getTotal(String loc) {
		try {
			if (Hospital_TotalDAO.getTotal(loc) != null) {
				EndView.printTotal(Hospital_TotalDAO.getTotal(loc));
			} else {
				EndView.errorMsg("�˻��� �����Ͱ� �����ϴ�.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�������� �ʴ� deptno�Դϴ�");

		}
	}

	public void totalInsert(Hospital_TotalDTO newDto) {
		try {
			if (Hospital_TotalDAO.totalInsert(newDto)) {
				EndView.succMsg("���ο� �μ� ���� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�̹� �����ϴ� deptno �Դϴ�");
		}
	}

	public void totalDelete(String loc) {
		try {
			if (Hospital_TotalDAO.totalDelete(loc)) {
				EndView.succMsg("�μ� ���� ����");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			EndView.errorMsg("�������� �ʴ� deptno�Դϴ�");
		}
	}

	public void totalUpdate(String loc, int hospital) {
		try {
			if (Hospital_TotalDAO.totalUpdate(loc ,hospital) ) {
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
