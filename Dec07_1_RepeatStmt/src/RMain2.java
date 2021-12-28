
// 檜醞 for僥 >> for僥寰縑 for僥 >> (醞繪 for僥)

public class RMain2 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			System.out.printf("i高 : %d------\n", i);
			for (int j = 1; j < 6; j++) {
				System.out.printf("j高 : %d\n", j);
			}
		}
		System.out.println("------------------");
		// 掘掘欽
		// 2 x 1 = 2
		// 2 x 2 = 4
//		for (int dan = 2; dan <= 9; dan++) {
//			System.out.printf("<<< %d欽 >>>\n", dan);
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//			}
//		}
		System.out.println("<2欽>\t\t<3欽>...");
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d x %d = %d\t", dan, i, dan * i);
			}
			System.out.println();
		}
		System.out.println("--------");
		// 滌鎰晦 -> 縈撚 替釵戲煎..!
		
		// 六
		// 六六
		// 六六六
		// 六六六六
		// 六六六六六
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("六");
			}
			System.out.println();
		}
		System.out.println("------------");
		
		// 六
		//	 六
		//	   六
		//		 六
		//		   六
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == i) {
					System.out.print("六");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// if僥 寰噙堅 ж朝 寞徹 !
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");		// j陛 i爾棻 濛擎 奢除擎
											// 嗥橫噙晦煎 詭脯邀
			}
			System.out.println("六");		// 斜 檜諼曖 奢除擎 "六"煎 詭脯邀
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i == j) ? "六" : " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		// 六六六六六
		// 冗冗冗冗
		// 六六六
		// 冗冗
		// 六
		
		for (int i = 4; i >= 0 ; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i % 2 == 0) ? "六" : "冗");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print((i % 2 == 0) ? "六" : "冗");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		// 六
		// 冗冗冗
		// 六六六六六
		// 冗冗冗冗冗冗冗
		// 六六六六六六六六六
		
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j <= (i * 2) ; j++) {
				System.out.print((i % 2 == 0) ? "六" : "冗");
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		//     *
		//    ***
		//   *****
		//  *******
		// *********
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= (i * 2) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("---------------");
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i ; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= (i * 2) ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}













