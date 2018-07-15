package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.domain.Hospital_TotalDTO;
import util.DBUtil;

public class Hospital_TotalDAO {
	// ��� �˻�
	// select * from dept;
	public static ArrayList<Hospital_TotalDTO> getAll() throws Exception {
		Connection con = null; // �߰�ȣ �κ��� ������ �ֹߵǱ� ������ �ۿ��� �������ش�.
		Statement stmt = null;
		ResultSet rs = null;
		ArrayList<Hospital_TotalDTO> datas = null;

		try {
			// Connection con =DBUtil.getConnection(); // ������ null������ �ʱ�ȭ try ���� �ȵɼ����־.
			con = DBUtil.getConnection(); // ���� �Ѵ� !
			stmt = con.createStatement(); // sql������ ���� �����ϰ� �ϴ� ��ü�� ����� ����
			rs = stmt.executeQuery("select * from HOSPITAL_TOTAL"); // �־��ش� !

			datas = new ArrayList<Hospital_TotalDTO>();
			while (rs.next()) { // ������ �ִ��� Ȯ��
				datas.add(new Hospital_TotalDTO(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4)
						, rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11),
						 rs.getInt(12), rs.getInt(13), rs.getInt(14), rs.getInt(15), rs.getInt(16), rs.getInt(17)
						, rs.getInt(18), rs.getInt(19), rs.getInt(20), rs.getInt(21), rs.getInt(22), rs.getInt(23)
						, rs.getInt(24), rs.getInt(25), rs.getInt(26), rs.getInt(27))); // ��ü�� �÷��� �ϳ��� �־��ش�.
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
	public static Hospital_TotalDTO gettoal(String loc) throws SQLException {
		Connection con = null; // �߰�ȣ �κ��� ������ �ֹߵǱ� ������ �ۿ��� �������ش�.
		Hospital_TotalDTO data = null;
		PreparedStatement pstmt = null; // alt+shift + r �� �ش� �ϴ� ��� �κ��� �ѹ��� �����Ѵ�.
		ResultSet rs =null;
		try {
			// Connection con =DBUtil.getConnection(); // ������ null������ �ʱ�ȭ try ���� �ȵɼ����־.
			con = DBUtil.getConnection(); // ���� �Ѵ� !
			// ������ �������� sql ���� ��ü ����(���� ��ü)
			pstmt = con.prepareStatement("select * from HOSPITAL_TOTAL where loc = ?"); // �÷��� ��ŭ ?�Ѵ�.
			pstmt.setString(1, loc);
			rs = pstmt.executeQuery();
			
			while(rs.next()) { //�÷����θ� ����.
				data = new Hospital_TotalDTO(rs.getString(1), rs.getInt(2), rs.getInt(3), rs.getInt(4)
						, rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8), rs.getInt(9), rs.getInt(10), rs.getInt(11),
						 rs.getInt(12), rs.getInt(13), rs.getInt(14), rs.getInt(15), rs.getInt(16), rs.getInt(17)
						, rs.getInt(18), rs.getInt(19), rs.getInt(20), rs.getInt(21), rs.getInt(22), rs.getInt(23)
						, rs.getInt(24), rs.getInt(25), rs.getInt(26), rs.getInt(27));
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
	public static boolean toalInsert(Hospital_TotalDTO newDept) throws SQLException {
		Connection con = null; // �߰�ȣ �κ��� ������ �ֹߵǱ� ������ �ۿ��� �������ش�.
		// �� ��ü�� �����Ǵ� ������ �̹� ���� �� sql������ ����
		PreparedStatement pstmt = null; // alt+shift + r �� �ش� �ϴ� ��� �κ��� �ѹ��� �����Ѵ�.

		try {
			// Connection con =DBUtil.getConnection(); // ������ null������ �ʱ�ȭ try ���� �ȵɼ����־.
			con = DBUtil.getConnection(); // ���� �Ѵ� !
			// ������ �������� sql ���� ��ü ����(���� ��ü)
			pstmt = con.prepareStatement("insert into HOSPITAL_TOTAL values(?,?,?,?,?,?,?,?,?,?,?)"); // �÷��� ��ŭ ?�Ѵ�.
			// ?�� ������ �� ���������� ����(������ఴü)
			pstmt.setString(1, newDept.getLoc()); // ����ǥ ���� / �������� ��
			pstmt.setInt(2, newDept.getGnr_Hospital());
			pstmt.setInt(3, newDept.getGnr_Bed());
			pstmt.setInt(4, newDept.getGnr_Hospital());
			pstmt.setInt(5, newDept.getH_Bed());
			pstmt.setInt(6, newDept.getClinic_Hospital());
			pstmt.setInt(7, newDept.getClinic_Bed());
			pstmt.setInt(8, newDept.getAff_Hospital());
			pstmt.setInt(9, newDept.getAff_Bed());
			pstmt.setInt(10, newDept.getNur_Hospital());
			pstmt.setInt(11, newDept.getNur_Bed());
			pstmt.setInt(12, newDept.getSnr_Hospital());
			pstmt.setInt(13, newDept.getSnr_Bed());
			pstmt.setInt(14, newDept.getTub_Hospital());
			pstmt.setInt(15, newDept.getTub_Bed());
			pstmt.setInt(16, newDept.getMental_hospital());
			pstmt.setInt(17, newDept.getMental_Bed());
			pstmt.setInt(18, newDept.getDent_Hospital());
			pstmt.setInt(19, newDept.getDent_Bed());
			pstmt.setInt(20, newDept.getDent_Clinic_Hospital());
			pstmt.setInt(21, newDept.getDent_Clinic_Bed());
			pstmt.setInt(22, newDept.getHerb_Hospital());
			pstmt.setInt(23, newDept.getHerb_Bed());
			pstmt.setInt(24, newDept.getHerb_Clinic_Hospital());
			pstmt.setInt(25, newDept.getHerb_Clinic_Bed());
			pstmt.setInt(26, newDept.getMaternity_Hospital());
			pstmt.setInt(27, newDept.getMaternity_Bed());
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
	public static boolean toalUpdate(String loc, int hospital) throws SQLException {
		Connection con = null; // �߰�ȣ �κ��� ������ �ֹߵǱ� ������ �ۿ��� �������ش�.
		// �� ��ü�� �����Ǵ� ������ �̹� ���� �� sql������ ����
		PreparedStatement pstmt = null; // alt+shift + r �� �ش� �ϴ� ��� �κ��� �ѹ��� �����Ѵ�.
		try {
			// Connection con =DBUtil.getConnection(); // ������ null������ �ʱ�ȭ try ���� �ȵɼ����־.
			con = DBUtil.getConnection(); // ���� �Ѵ� 
			// ������ �������� sql ���� ��ü ����(���� ��ü)
			pstmt = con.prepareStatement("update HOSPITAL_TOTAL set FULL_TIME= ? where loc =? "); // �÷��� ��ŭ ?�Ѵ�.
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
	public static boolean toalDelete(String loc) throws SQLException {
		Connection con = null; // �߰�ȣ �κ��� ������ �ֹߵǱ� ������ �ۿ��� �������ش�.
		// �� ��ü�� �����Ǵ� ������ �̹� ���� �� sql������ ����
		PreparedStatement pstmt = null; // alt+shift + r �� �ش� �ϴ� ��� �κ��� �ѹ��� �����Ѵ�.
//		ResultSet rs =null;
//		DeptDTO data =null;
		try {
			// Connection con =DBUtil.getConnection(); // ������ null������ �ʱ�ȭ try ���� �ȵɼ����־.
			con = DBUtil.getConnection(); // ���� �Ѵ� !
			// ������ �������� sql ���� ��ü ����(���� ��ü)
			pstmt = con.prepareStatement("delete from HOSPITAL_TOTAL where loc = ?"); // �÷��� ��ŭ ?�Ѵ�.

			pstmt.setString(1, loc); // ����ǥ ���� / �������� ��
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
