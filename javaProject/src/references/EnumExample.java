package references;

import java.util.Calendar;

enum Kind {
	MALE, FEMALE;
}

enum Choice {
	YES, NO;
}

public class EnumExample {

	public static void main(String[] args) {

		int maleOrFemale = 1; // 1 남자, 2 여자
		int yesOrno = 1; // 1 yes, 2 no
		Week today = null;
		today = Week.SUNDAY;
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR) + "년도 ");
		System.out.println((cal.get(Calendar.MONTH) + 1 + "월 "));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "일 ");

		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch (week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		// if (week == 1|| week \\ 2){
		if (today == Week.SUNDAY || today == Week.SATURDAY) {
			System.out.println("주말에는 여행을 갑니다");
		} else {
			System.out.println("주중에는 공부를 합니다.");
		}
		Kind manOfWoman = Kind.FEMALE;
		if(manOfWoman == Kind.MALE) {
			System.out.println("남성입니다.");
		}else if (manOfWoman == Kind.FEMALE) {
			System.out.println("여성입니다.");
		}
		System.out.println("오늘 요일 : " + today);
	}

}
