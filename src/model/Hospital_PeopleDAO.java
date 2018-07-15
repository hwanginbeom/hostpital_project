package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.Hospital_PeopleDTO;
import util.DBUtil;

public class Hospital_PeopleDAO {
	// ��� �˻�
	// select * from dept;
	public static ArrayList<Hospital_PeopleDTO> getAll() throws Exception {
		Connection con = null; // �߰�ȣ �κ��� ������ �ֹߵǱ� ������ �ۿ��� �������ش�.
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Hospital_PeopleDTO> datas = null;

		try {
			// Connection con =DBUtil.getConnection(); // ������ null������ �ʱ�ȭ try ���� �ȵɼ����־.
			con = DBUtil.getConnection(); // ���� �Ѵ� !
			stmt = con.createStatement(); // sql������ ���� �����ϰ� �ϴ� ��ü�� ����� ����
			rs = stmt.executeQuery("select * from HOSPITAL_TOTAL"); // �־��ش� !

			datas = new ArrayList<Hospital_PeopleDTO>();
			while (rs.next()) { // ������ �ִ��� Ȯ��
				datas.add(new Hospital_PeopleDTO(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4)
						, rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11))); // ��ü�� �÷��� �ϳ��� �־��ش�.
			}

		} catch (SQLException e) { // �ڵ尡 ���������� �����ڰ� �˱� ��Ʊ� ������ �߰��߰��� �־��ش�.
			e.printStackTrace();
			throw e; // end�ʿ��� �� �����Ѵ�. �̷��� �ؾ� Ŭ���̾�Ʈ�� �˼� �ִ�.
		} finally {
			DBUtil.close(con, stmt, rs);
		}
		return datas;
	}

	// deptno�� �ش� �μ� �����˻�
	// ?
	public static Hospital_PeopleDTO getDept(int loc) throws SQLException {
		Connection con = null; // �߰�ȣ �κ��� ������ �ֹߵǱ� ������ �ۿ��� �������ش�.
		Hospital_PeopleDTO data = null;
		PreparedStatement pstmt = null; // alt+shift + r �� �ش� �ϴ� ��� �κ��� �ѹ��� �����Ѵ�.
		ResultSet rs =null;
		try {
			// Connection con =DBUtil.getConnection(); // ������ null������ �ʱ�ȭ try ���� �ȵɼ����־.
			con = DBUtil.getConnection(); // ���� �Ѵ� !
			// ������ �������� sql ���� ��ü ����(���� ��ü)
			pstmt = con.prepareStatement("select * from HOSPITAL_PEOPLE where loc = ?"); // �÷��� ��ŭ ?�Ѵ�.
			pstmt.setInt(1, loc);
			rs = pstmt.executeQuery();
			
			while(rs.next()) { //�÷����θ� ����.
				data = new Hospital_PeopleDTO(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4)
						, rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11));
			}

			// ���� �̹� �ٳ־��� ������ �Ű������� �ʿ� ����.
			// �̰��� ������� ���� �ο�� ������ ���ͼ� 1 ,2,3 �̷������� ������ �̰� ������ ���ƴٴ� ������ ���´� �׷���
			// 0�� ���� ������ ����ģ�Ŵ�.
		} catch (SQLException e) { // �ڵ尡 ���������� �����ڰ� �˱� ��Ʊ� ������ �߰��߰��� �־��ش�.
			e.printStackTrace();
			throw e; // end�ʿ��� �� �����Ѵ�. �̷��� �ؾ� Ŭ���̾�Ʈ�� �˼� �ִ�.
		} finally {
			DBUtil.close(con, pstmt);
		}
		return data;
	}

	// ���ο� �μ����� ����
	// ���� ������ �ִ� �κ��� �������� ��������ϱ� �ؿ� ���� �Ѵ�.
	// insert into dept values(50,'�ѹ���','����')
	/*
	 * DeptDTO newDept - insert into dept values(newDept.getDeptno(),'�ѹ���','����')
	 * 
	 */
	// public static boolean insert(int deptno, String dname,String loc) {
	// return false;
	// }
	public static boolean insert(Hospital_PeopleDTO newDept) throws SQLException {
		Connection con = null; // �߰�ȣ �κ��� ������ �ֹߵǱ� ������ �ۿ��� �������ش�.
		// �� ��ü�� �����Ǵ� ������ �̹� ���� �� sql������ ����
		PreparedStatement pstmt = null; // alt+shift + r �� �ش� �ϴ� ��� �κ��� �ѹ��� �����Ѵ�.

		try {
			// Connection con =DBUtil.getConnection(); // ������ null������ �ʱ�ȭ try ���� �ȵɼ����־.
			con = DBUtil.getConnection(); // ���� �Ѵ� !
			// ������ �������� sql ���� ��ü ����(���� ��ü)
			pstmt = con.prepareStatement("insert into HOSPITAL_PEOPLE values(?,?,?,?,?,?,?,?,?,?,?)"); // �÷��� ��ŭ ?�Ѵ�.
			// ?�� ������ �� ���������� ����(������ఴü)
			pstmt.setString(1, newDept.getLoc()); // ����ǥ ���� / �������� ��
			pstmt.setInt(2, newDept.getFull_Time());
			pstmt.setInt(3, newDept.getPart_Time());
			pstmt.setInt(4, newDept.getDent());
			pstmt.setInt(5, newDept.getKr_Med());
			pstmt.setInt(6, newDept.getPhar());
			pstmt.setInt(7, newDept.getMidWife());
			pstmt.setInt(8, newDept.getNurese());
			pstmt.setInt(9, newDept.getNur_Aid());
			pstmt.setInt(10, newDept.getMed_Tech());
			pstmt.setInt(11, newDept.getMed_Roc());
			// db�� ���� ����

			int result = pstmt.executeUpdate(); // insert/update/delete ���� �޼ҵ�
												// ���� �̹� �ٳ־��� ������ �Ű������� �ʿ� ����.
												// �̰��� ������� ���� �ο�� ������ ���ͼ� 1 ,2,3 �̷������� ������ �̰� ������ ���ƴٴ� ������ ���´� �׷���
												// 0�� ���� ������ ����ģ�Ŵ�.
			if (result == 0) { // 0�� �߻��� Ȯ���� �ſ�����.
				return false;
			}

			// sql������ ���� �����ϰ� �ϴ� ��ü�� ����� ����

		} catch (SQLException e) { // �ڵ尡 ���������� �����ڰ� �˱� ��Ʊ� ������ �߰��߰��� �־��ش�.
			e.printStackTrace();
			throw e; // end�ʿ��� �� �����Ѵ�. �̷��� �ؾ� Ŭ���̾�Ʈ�� �˼� �ִ�.
		} finally { // return �ϱ����� finally �� �ϰ� ����. �켱������ �ռ� �ִ�.
			DBUtil.close(con, pstmt); // �׷��� �ڿ���ȯ�� finally �κп��� �Ѵ�.
		} // �̺κ��� �ڿ���ȯ�ϴ� �κ����� ȣ���ؼ� ����.
		return true;

	}

	// loc �� hospital ����
	public static boolean update(String loc, int hospital) throws SQLException {
		Connection con = null; // �߰�ȣ �κ��� ������ �ֹߵǱ� ������ �ۿ��� �������ش�.
		// �� ��ü�� �����Ǵ� ������ �̹� ���� �� sql������ ����
		PreparedStatement pstmt = null; // alt+shift + r �� �ش� �ϴ� ��� �κ��� �ѹ��� �����Ѵ�.
		try {
			// Connection con =DBUtil.getConnection(); // ������ null������ �ʱ�ȭ try ���� �ȵɼ����־.
			con = DBUtil.getConnection(); // ���� �Ѵ� 
			// ������ �������� sql ���� ��ü ����(���� ��ü)
			pstmt = con.prepareStatement("update HOSPITAL_PEOPLE set hospital= ? where loc =? "); // �÷��� ��ŭ ?�Ѵ�.
			// ?�� ������ �� ���������� ����(������ఴü)
			pstmt.setInt(1, hospital); // ����ǥ ���� / �������� ��  
			pstmt.setString(2, loc); // ����ǥ ���� / �������� ��
			// db�� ���� ����
			int result = pstmt.executeUpdate(); // insert/update/delete ���� �޼ҵ�
												// ���� �̹� �ٳ־��� ������ �Ű������� �ʿ� ����.
												// �̰��� ������� ���� �ο�� ������ ���ͼ� 1 ,2,3 �̷������� ������ �̰� ������ ���ƴٴ� ������ ���´� �׷���
												// 0�� ���� ������ ����ģ�Ŵ�.
		
			if (result == 0) { // 0�� �߻��� Ȯ���� �ſ�����.
				return false;
			}

			// sql������ ���� �����ϰ� �ϴ� ��ü�� ����� ����

		} catch (SQLException e) { // �ڵ尡 ���������� �����ڰ� �˱� ��Ʊ� ������ �߰��߰��� �־��ش�.
			e.printStackTrace();
			throw e; // end�ʿ��� �� �����Ѵ�. �̷��� �ؾ� Ŭ���̾�Ʈ�� �˼� �ִ�.
		} finally { // return �ϱ����� finally �� �ϰ� ����. �켱������ �ռ� �ִ�.
			DBUtil.close(con, pstmt); // �׷��� �ڿ���ȯ�� finally �κп��� �Ѵ�.
		} // �̺κ��� �ڿ���ȯ�ϴ� �κ����� ȣ���ؼ� ����.
		return true;
	}

	// deptno �� �ش� �μ� ����
	public static boolean delete(int loc) throws SQLException {
		Connection con = null; // �߰�ȣ �κ��� ������ �ֹߵǱ� ������ �ۿ��� �������ش�.
		// �� ��ü�� �����Ǵ� ������ �̹� ���� �� sql������ ����
		PreparedStatement pstmt = null; // alt+shift + r �� �ش� �ϴ� ��� �κ��� �ѹ��� �����Ѵ�.
//		ResultSet rs =null;
//		DeptDTO data =null;
		try {
			// Connection con =DBUtil.getConnection(); // ������ null������ �ʱ�ȭ try ���� �ȵɼ����־.
			con = DBUtil.getConnection(); // ���� �Ѵ� !
			// ������ �������� sql ���� ��ü ����(���� ��ü)
			pstmt = con.prepareStatement("delete from HOSPITAL_PEOPLE where loc = ?"); // �÷��� ��ŭ ?�Ѵ�.

			pstmt.setInt(1, loc); // ����ǥ ���� / �������� ��
			// db�� ���� ����
			int result = pstmt.executeUpdate(); // insert/update/delete ���� �޼ҵ�
												// ���� �̹� �ٳ־��� ������ �Ű������� �ʿ� ����.
												// �̰��� ������� ���� �ο�� ������ ���ͼ� 1 ,2,3 �̷������� ������ �̰� ������ ���ƴٴ� ������ ���´� �׷���
												// 0�� ���� ������ ����ģ�Ŵ�.
			if (result == 0) { // 0�� �߻��� Ȯ���� �ſ�����.
				return false;
			}
			
//			rs = pstmt.executeQuery();
//			
//			while(rs.next()) { //�÷����θ� ����.
//				data = new DeptDTO(rs.getInt(1),rs.getString(2),rs.getString(3));
//			}

			// sql������ ���� �����ϰ� �ϴ� ��ü�� ����� ����

		} catch (SQLException e) { // �ڵ尡 ���������� �����ڰ� �˱� ��Ʊ� ������ �߰��߰��� �־��ش�.
			e.printStackTrace();
			throw e; // end�ʿ��� �� �����Ѵ�. �̷��� �ؾ� Ŭ���̾�Ʈ�� �˼� �ִ�.
		} finally { // return �ϱ����� finally �� �ϰ� ����. �켱������ �ռ� �ִ�.
			DBUtil.close(con, pstmt); // �׷��� �ڿ���ȯ�� finally �κп��� �Ѵ�.
		} // �̺κ��� �ڿ���ȯ�ϴ� �κ����� ȣ���ؼ� ����.
		return true;
	}
}
