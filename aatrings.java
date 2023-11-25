import acm.program.ConsoleProgram;

public class aatrings extends ConsoleProgram {
	public void run() {
	int num1 = readInt("Enter number: ");
	int num2 = readInt("Enter second number: ");
	int answer = log(num1, num2);
	println(log(num1,num2));
	}

	private int log(int num1, int num2) {
		int ans = 0;
		int k = num1;
		while(num1<=num2) {
			num1 *= k;
			ans++;
		}
		return ans;
	}
}
