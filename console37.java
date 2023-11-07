import acm.program.ConsoleProgram;
import acm.util.RandomGenerator;
// რულეტკა
public class console37 extends ConsoleProgram {
	private static final int MIN_VALUE = 0;
	private static final int MAX_VALUE = 36;
	private RandomGenerator rgen = RandomGenerator.getInstance();
	public void run() {
		int betNumber = readBet();
		int rouletteNumber = spinRoulette();
		if(betNumber == rouletteNumber) {
			
		}
	}

	private int spinRoulette() {
		int rouletteResult = rgen.nextInt(MIN_VALUE, MAX_VALUE);
		println("Roulete result is " + rouletteResult);
		return rouletteResult;
	}

	private int readBet() {
		int bet = readInt ("Enter bet Number (0-36) : ");
		if(bet <0 || bet>36)
		return 0;
	}

}
