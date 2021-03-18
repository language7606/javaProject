package com.yedam.diary;

public enum Menu {
	����(0), �߰�(1), ����(2), ����(3), ��ü��ȸ(4);

	private int value;

	private Menu(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public static Menu getMenu(int m) {
		Menu em = null;
		for (Menu menu : Menu.values()) {
			if (menu.getValue() == m) {
				em = menu;
			}
		}
		return em;
	}
}
