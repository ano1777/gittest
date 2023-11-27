import acm.program.ConsoleProgram;

public class stringleetcode extends ConsoleProgram {
	public void run() {
		String haystack = "sadbutsad";
		String needle = "sad";
		int result = returnInt(haystack, needle);
		println(result);
	}

	private int returnInt(String haystack, String needle) {
		for (int i = 0; i < (haystack.length() - 1); i++) {
			String sub = haystack.substring(i, i + 1);
			if (sub.equals(needle)) {
				return (i);
			}

		}

		return -1;

	}

}
