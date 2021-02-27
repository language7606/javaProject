package references;

public class Morning0226 {
	public static void main(String[] args) {
		String[] names = { "임성원", "정준영", "도왕락" };
		int[] scores = { 88, 89, 90 };

		// 임성원 점수=>88
		// 정준영 점수=>89
		// 도왕락 점수=>90

		// 향상된 for문
		for (String name : names) {
			System.out.println(name);
			for (int score : scores) {
				System.out.println(names[0] + " 점수=> " + score);
				System.out.println(names[1] + " 점수=> " + score);
				System.out.println(names[2] + " 점수=> " + score);
			}
		}
	}

	public static void arrayCopy() {
		int[] oldAry = { 45, 55, 67 };
		int[] newAry = new int[3];
		for (int i = 0; i < oldAry.length; i++) {
			newAry[i] = oldAry[i];
		}

		int[] newAry2 = new int[5];
		System.arraycopy(newAry, 0, newAry2, 0, 3);
		System.out.println(newAry2[0]);
		System.out.println(newAry2[1]);
		System.out.println(newAry2[2]);
		System.out.println(newAry2[3]);
		System.out.println(newAry2[4]);

	}
//		morning0226();

	public static void morning0226() {
		int[] engScores = new int[3];
		engScores = new int[] { 95, 88, 67 };
		int[] mathScores = new int[3];
		mathScores = new int[] { 77, 80, 69 };

//		int[][] scores = new int[2][];
//		scores[0] = new int[] { 95, 88, 67 };
//		scores[1] = new int[] { 77, 69 };

		int[][] scores = { { 95, 88, 67 }, { 77, 80, 69 } };
		double avg = 0.0;
		for (int i = 0; i < scores.length; i++) {
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
			}
			if (i == 0) {
				avg = (double) sum / scores[i].length;
				System.out.println("영어의 평균: " + avg);
			} else if (i == 1) {
				avg = (double) sum / scores[i].length;
				System.out.println("수학의 평균: " + avg);
			}
			System.out.println("평균 : " + (sum * 10 / scores[i].length) / 10.0);
		}
	}
}
//		int engSum = 0;
//		int mathSum = 0;
//		double engAvg = 0.0;
//		double mathAvg = 0.0;
//		for (int i = 0; i < 3; i++) {
//			engScores[i] = (int) (Math.random() * 100 + 1);
//			mathScores[i] = (int) (Math.random() * 100 + 1);
//			System.out.println("영어 성적 : "+engScores[i]+", 수학 성적 : "+mathScores[i]);
//			System.out.println();
//			engSum = engSum + engScores[i];
//			mathSum = mathSum + mathScores[i];
//		}
//		
//		engAvg = engSum / engScores.length;
//		mathAvg = mathSum / mathScores.length;
//		System.out.println(engAvg);
//		System.out.println(mathAvg);
//	}
//}

//					//int 영어성적 담을 수 있는 배열. engScores => 3
//				//int 수학성적 담을 수 있는 배열. math Scores =>3
//				
//				// 영어, 수학 성적 입력.
//				// 영어의 평균, 수학점수의 평균을 구하는 코딩.
//	}
//
//}
