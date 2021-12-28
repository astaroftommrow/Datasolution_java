import java.util.Scanner;

// 정수 2개를 입력받아서(각각의 함수에)
// 그 정수 2개를 더했을때 짝수면 결과 리턴, 아니면 값을 재입력

public class YMain2 {
	// x값을 입력받을 함수
	public static int getX() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("x : ");
		int x = keyboard.nextInt();
		return x;
	}
	// y값을 입력받을 함수
	public static int getY() {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("y : ");
		int y = keyboard.nextInt();
		return y;
	}
	// 덧셈을 계산해서 결과를 리턴할 함수
	public static int getResult(int x, int y) {
		int sum = x + y;
		return (sum % 2 == 0) ? sum : getResult(x, y); 	// 원하는 값이 들어오지 않으면
														// 무한 루프가 돌아감
														// -> 처음 홀수를 입력한 값이 계속 계산됨
		// return (sum % 2 == 0) ? sum : getResult(getX(), getY());
	}
	
	public static void main(String[] args) {
		int x = getX();
		int y = getY();
		int sum = getResult(x, y);
		System.out.println(sum);
	}
}










