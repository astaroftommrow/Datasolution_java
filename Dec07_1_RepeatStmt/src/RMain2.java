
// 戚掻 for庚 >> for庚照拭 for庚 >> (掻淡 for庚)

public class RMain2 {
	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			System.out.printf("i葵 : %d------\n", i);
			for (int j = 1; j < 6; j++) {
				System.out.printf("j葵 : %d\n", j);
			}
		}
		System.out.println("------------------");
		// 姥姥舘
		// 2 x 1 = 2
		// 2 x 2 = 4
//		for (int dan = 2; dan <= 9; dan++) {
//			System.out.printf("<<< %d舘 >>>\n", dan);
//			for (int i = 1; i <= 9; i++) {
//				System.out.printf("%d x %d = %d\n", dan, i, dan * i);
//			}
//		}
		System.out.println("<2舘>\t\t<3舘>...");
		for (int i = 1; i <= 9; i++) {
			for (int dan = 2; dan <= 9; dan++) {
				System.out.printf("%d x %d = %d\t", dan, i, dan * i);
			}
			System.out.println();
		}
		System.out.println("--------");
		// 紺啄奄 -> 植漆 汗界生稽..!
		
		// せ
		// せせ
		// せせせ
		// せせせせ
		// せせせせせ
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("せ");
			}
			System.out.println();
		}
		System.out.println("------------");
		
		// せ
		//	 せ
		//	   せ
		//		 せ
		//		   せ
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == i) {
					System.out.print("せ");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// if庚 照床壱 馬澗 号狛 !
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");		// j亜 i左陥 拙精 因娃精
											// 句嬢床奄稽 五蚊捜
			}
			System.out.println("せ");		// 益 戚須税 因娃精 "せ"稽 五蚊捜
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i == j) ? "せ" : " ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		// せせせせせ
		// ぞぞぞぞ
		// せせせ
		// ぞぞ
		// せ
		
		for (int i = 4; i >= 0 ; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i % 2 == 0) ? "せ" : "ぞ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < (5 - i); j++) {
				System.out.print((i % 2 == 0) ? "せ" : "ぞ");
			}
			System.out.println();
		}
		
		System.out.println("----------");
		// せ
		// ぞぞぞ
		// せせせせせ
		// ぞぞぞぞぞぞぞ
		// せせせせせせせせせ
		
		for (int i = 0; i < 5 ; i++) {
			for (int j = 0; j <= (i * 2) ; j++) {
				System.out.print((i % 2 == 0) ? "せ" : "ぞ");
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













