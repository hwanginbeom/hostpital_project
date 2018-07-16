package view;

import java.util.Scanner;

import controller.Controller;
import model.Hospital_PeopleDAO;
import model.Hospital_TotalDAO;

public class StartView {
	public static void main(String[] args) {
		// ��� �˻�
		Controller controller = Controller.getInstance();

		Scanner scan = new Scanner(System.in);
		int result = 100;
		String resultLoc = null;

		while (result != 10) {
			System.out.println("***********�޴�***********");
			System.out.println("  1 - ���� �� ���� ��ü ����");
			System.out.println("  2 - ���� �� �Ƿ��η¼� ��ü ����  ");
			System.out.println("  3 - ���� �� ���� �˻� ");
			System.out.println("  4 - ���� �� �Ƿ��η� �� �˻�");
			System.out.println("  5 - ���� �� ���� �� �Ƿ��η� �� �˻� ");
			System.out.println("  9 - ������ ��� ");
			System.out.println("  10 - ���α׷��� ���� �ϱ�");
			System.out.println();
			System.out.print(" �޴��� �����ϼ��� :  ");

			try {
				result = scan.nextInt();
				switch (result) {

				case 1:

					System.out.println("*********** �����̼� �� ���� ��ü ���� **************");
					System.out.println();
					System.out.println();
					System.out.println(
							" �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
					controller.getTotalAll();
					System.out.println(
							" �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

					break;
				// �˻� - id �� �˻�
				case 2:
					System.out.println("*********** �����̼� �� �Ƿ��η¼� ��ü ���� **************");
					System.out.println();
					System.out.println();
					System.out.println(
							" �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
					controller.getPeopleAll();
					System.out.println(
							"�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");

					break;

				case 3:

					// �����̼� �� ���� �˻�
					while (result != 0) {
						System.out.println("*** �����̼� �� ���� �˻��� �Ͻðڽ��ϱ�? 1(yes) / 0(no) ");
							result = scan.nextInt();
					}
					int result2 = 10;
					if (result == 0 || result2 == 0) {
						break;
					}
					while (result2 != 0) {
						System.out.println("*** " + "ã���� �ϴ� ������ ���ÿ� ");
						System.out.println("1)���պ���   2)����   3)ġ��   4)���ǿ�/�ѹ溴��   5)�����   6)���/������������   "
								+ "7)���ٺ���   8)���ź���   0)�ڷ� ���ư���");
						result2 = scan.nextInt();

						switch (result2) {

						case 1:
							System.out.println("***���պ����� ��***");
								for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
									System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "������" + " ���պ����� ��:"
											+ Hospital_TotalDAO.getAll().get(i).getGnr_Hospital() + " | ���պ��� ���� �� :"
											+ Hospital_TotalDAO.getAll().get(i).getGnr_Bed());
									Thread.sleep(300);
								}
							break;

						case 2:
							System.out.println("***������ ��***");
								for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
									System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "������" + " ������ ��:"
											+ Hospital_TotalDAO.getAll().get(i).getHospital() + " |���� ���� ��: "
											+ Hospital_TotalDAO.getAll().get(i).getH_Bed());
									Thread.sleep(300);
								}
							break;

						case 3:
							System.out.println("***ġ���� ��***");
								for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
									System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "������" + " ġ���� ��:"
											+ Hospital_TotalDAO.getAll().get(i).getDent_Hospital() + " | ġ�� ���� ��: "
											+ +Hospital_TotalDAO.getAll().get(i).getDent_Bed() + " | ġ���ǿ� ��"
											+ Hospital_TotalDAO.getAll().get(i).getDent_Clinic_Hospital()
											+ " | ġ���ǿ� ���� ��" + Hospital_TotalDAO.getAll().get(i).getDent_Clinic_Bed());
									Thread.sleep(300);
								}
							break;

						case 4:
							System.out.println("***���ǿ�/�ѹ溴���� ��***");
								for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
									System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "������" + " ���ǿ��� ��:"
											+ Hospital_TotalDAO.getAll().get(i).getHerb_Hospital() + " | ���ǿ� ���� ��: "
											+ +Hospital_TotalDAO.getAll().get(i).getHerb_Bed() + " | ġ���ǿ� ��"
											+ Hospital_TotalDAO.getAll().get(i).getHerb_Clinic_Hospital()
											+ " | ġ���ǿ� ���� ��" + Hospital_TotalDAO.getAll().get(i).getHerb_Clinic_Bed());
									Thread.sleep(300);
								}
							break;

						case 5:
							System.out.println("***������� ��***");
								for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
									System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "������" + " ������� ��:"
											+ Hospital_TotalDAO.getAll().get(i).getMaternity_Hospital()
											+ " | ����� ���� �� :" + Hospital_TotalDAO.getAll().get(i).getMaternity_Bed());
									Thread.sleep(300);
								}
							break;

						case 6:
							System.out.println("***���/�������������� ��***");
								for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
									System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "������" + " ��� ������ ��:"
											+ Hospital_TotalDAO.getAll().get(i).getSnr_Hospital() + " | ��� ������ ���� ��: "
											+ +Hospital_TotalDAO.getAll().get(i).getSnr_Bed() + " | ���� ������ ��"
											+ Hospital_TotalDAO.getAll().get(i).getAff_Hospital() + " | ���κ����� ���� ��"
											+ Hospital_TotalDAO.getAll().get(i).getAff_Bed());
									Thread.sleep(300);
								}
							break;

						case 7:
							System.out.println("***���ٺ����� ��***");
								for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
									System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "������" + " ���ٺ����� ��:"
											+ Hospital_TotalDAO.getAll().get(i).getTub_Hospital() + " | ���ٺ��� ���� �� :"
											+ Hospital_TotalDAO.getAll().get(i).getTub_Bed());
									Thread.sleep(300);
								}
							break;

						case 8:
							System.out.println("***���ź����� ��***");
								for (int i = 0; i < Hospital_TotalDAO.getAll().size(); i++) {
									System.out.println(Hospital_TotalDAO.getAll().get(i).getLoc() + "������" + " ���ź����� ��:"
											+ Hospital_TotalDAO.getAll().get(i).getMental_hospital() + " | ���ź��� ���� �� :"
											+ Hospital_TotalDAO.getAll().get(i).getMental_Bed());
									Thread.sleep(300);
								}
							break;

						case 0:
							System.out.println("*** �ʱ� �޴��� �̵�***");
							break;

						}

					break;
					}

				// �����̼� �� �Ƿ��η�
				case 4:

					while (result != 0) {
						System.out.println("*** �����̼� �� �Ƿ��η��� ���ðڽ��ϱ�? 1(yes) /0(no) ");
						result = scan.nextInt();
						if (result == 0) {
							break;
						}
							for (int i = 0; i < Hospital_PeopleDAO.getAll().size(); i++) {
								System.out.println((i + 1) + " " + Hospital_PeopleDAO.getAll().get(i).getLoc());
							}
							while (result != 0) {
								System.out.print("*** ���� ����  ������ ���ڸ� �Է� �ϼ���(0�� ����) :  ");
								result = scan.nextInt();
								if (result == 0) {
									break;
								}
									System.out.println(Hospital_PeopleDAO.getAll().get(result - 1));
									System.out.println(Hospital_TotalDAO.getAll().get(result - 1));

					}
					}

					break;

				// ���� �� ���� �� �Ƿ��η� �� �˻�
				case 5:
					while (result != 0) {
						System.out.println("*** ���� �� ���� �� �Ƿ��η� �� �˻��� �Ͻðڽ��ϱ�? 1(yes) /0(no) ");
						result = scan.nextInt();
						if (result == 0) {
							break;
						} else if (result == 1) {
								for (int i = 0; i < Hospital_PeopleDAO.getAll().size(); i++) {
									System.out.println((i + 1) + " " + Hospital_PeopleDAO.getAll().get(i).getLoc());
								}
								while (result != 0) {
									System.out.print("*** ���� ����  ������ ���ڸ� �Է� �ϼ���(0�� ����) :  ");
									result = scan.nextInt();
									if (result == 0) {
										break;
									}
										System.out.println(Hospital_PeopleDAO.getAll().get(result - 1));
										System.out.println(Hospital_TotalDAO.getAll().get(result - 1));


								}
						} else {
							System.out.println("�߸� �� �Է� �Դϴ�. �ٽ� �Է��ϼ���.");
						}

					}
					break;

				// ������ ���
				case 9:
					while (result != 0) {
						System.out.println("*** ������ ��� ");
						int count =0;
						int password = 1541;
						int inputPassword = 100;
						while (count < 4) {
							System.out.print("��й�ȣ�� �Է��ϼ��� :");
							inputPassword = scan.nextInt();

							// �����ڸ޴�
							if (password == inputPassword) {
								int mangerResult = 10;
								while (mangerResult != 0) {
									System.out.println("***********������ �޴�***********");
									System.out.println("  1 - ��� �˻��ϱ�");
									System.out.println("  2 - ������ �߰��ϱ�  ");
									System.out.println("  3 - �����ϱ� ");
									System.out.println("  4 - �����ϱ�");
									System.out.println("  0 - �⺻ �޴��� ���ư��� ");

									System.out.print(" �޴��� �����ϼ��� :  ");
									mangerResult = scan.nextInt();
									switch (mangerResult) {
									case 1:
										System.out.println("*********** �����̼� �� ���� ��ü ���� **************");
										System.out.println();
										System.out.println();
										System.out.println(
												" �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
										controller.getTotalAll();
										System.out.println(
												" �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
										System.out.println();
										System.out.println();
										System.out.println("*********** �����̼� �� �Ƿ��η¼� ��ü ���� **************");
										System.out.println();
										System.out.println();
										System.out.println(
												" �ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
										controller.getPeopleAll();
										System.out.println(
												"�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
										System.out.println();
										System.out.println();
										break;

									case 2:
										break;

									case 3:
										break;

									case 4:
										break;

									case 0:
										System.out.println("�⺻ �޴��� ���ư��ϴ�.");
										break;

									}
								}
							} else {
								count++;
								System.out.println("�н����尡 Ʋ�Ƚ��ϴ�. �ٽ� �Է����ּ���.");
								System.out.println("3�� Ʋ���� ���α׷��� ���� �˴ϴ�. ���� : " + count);
								System.out.println();
								if (count == 3) {
									System.out.println();
									System.out.println();
									System.out.println();
									System.out.println("�� �������� �������� ���� ���α׷��� ���� �Ǿ����ϴ�.");
									System.exit(0);
								}
							}
						}
					}

					break;
				case 10:
					System.out.println();
					System.out.println("*** ���α׷��� ���� �Ǿ����ϴ�. ***");
					break;
				}

			}

			// controller.getPeopleAll();
			// insert - ����
			// controller.peopleInsert(new Hospital_PeopleDTO("������",1,2,3,4,5,6,7,8,9,10));

			// ��� �˻�
			// controller.getPeopleAll();

			// �ϳ��� �˻� -����
			// controller.getPeople("������");

			// delete - ����
			// controller.peopleDelete("������"); -����
			// controller.peopleDelete("���ı�");
			// controller.getPeopleAll();

			// update -- ����
			// controller.peopleUpdate( "��걸",30);
			// controller.getPeopleAll();

			// controller.getTotalAll(); -����
			// controller.getTotal("��걸"); -����
			// controller.totalInsert(new
			// Hospital_TotalDTO("��������",1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26));
			// ���� !
			// controller.totalDelete("���ı�"); --����
			// controller.getTotalAll();
			// controller.totalUpdate( "��걸",30);
			catch (Exception e) {
				System.out.println("������ �߻��Ͽ����ϴ�.");
				break;
				
			}
		}
	}

}
