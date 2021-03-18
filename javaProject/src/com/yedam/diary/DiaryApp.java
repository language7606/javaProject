package com.yedam.diary;

public class DiaryApp {
	DAO dao;

	public void start() {
		dao = new DiaryListDAO();
//		dao = new DiaryOracleDAO();

		int menuNum = 0;

		do {
			menuPrint();
			menuNum = menuChoose();
			process(menuNum);
		} while (menuNum != 0);
		System.out.println("���α׷� ����");
	}

	// �޴� ���
	public void menuPrint() {
		Menu[] arr = Menu.values();
		int i = 0;
		for (Menu menu : arr) {
			System.out.print(String.format("%d:%s ", i, menu.name()));
			i++;
		}
		System.out.println();
	}

	// �޴� ����
	private int menuChoose() {
		int menuSize = Menu.values().length - 1;
		int menuNum;
		do {
			menuNum = StdInputUtil.readInt();
			if (menuNum <= menuSize)
				break;
			System.out.println(menuSize + " ������ �Է��� �����մϴ�.");
		} while (true);
		return menuNum;
	}

	// �޴� ����
	public void process(int menuNum) {
		Menu menu = Menu.getMenu(menuNum);
		switch (menu) {
		case ����:
			exit();
			break;
		case �߰�:
			insert();
			break;
		case ����:
			update();
			break;
		case ����:
			delete();
			break;
		case ��ü��ȸ:
			selectAll();
			break;
		}
	}

	// �Է�
	public void insert() {
		System.out.println("�Է�>>");
		System.out.println("��¥:[yyMMdd]");
		String wdate = StdInputUtil.readDate();
		System.out.print("����: ");
		String contents = StdInputUtil.readMultiLine();

		DiaryVO vo = new DiaryVO();
		vo.setWdate(wdate);
		vo.setContents(contents);
		int cnt = dao.insert(vo);
		System.out.println(cnt + "�Է� �Ϸ�");
	}

	// ����
	public void update() {
		System.out.println("��������>>");
		System.out.println("��¥:[yyMMdd]");
		String wdate = StdInputUtil.readDate();
		System.out.println("������¥:[yyMMdd]");
		
		int u =dao.update();
		
	}

	// ����
	public void delete() {
		System.out.println("��������>>");
		System.out.println("��¥:[yyMMdd]");
		String wdate = StdInputUtil.readDate();
		int r = dao.delete(wdate);
		System.out.println(r + "�� ������.");
	}

	// ��ü��ȸ
	public void selectAll() {
		System.out.println("��ü����>>");
		for (DiaryVO vo : dao.selectAll()) {
			System.out.println(vo.getWdate());
			System.out.println(vo.getContents());
		}
	}

	// ����
	public void exit() {
		System.out.println("����>>");
	}
}
